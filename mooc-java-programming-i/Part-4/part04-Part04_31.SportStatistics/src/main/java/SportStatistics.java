
import java.nio.file.Paths;
import java.util.*;

public class SportStatistics {
    static Map<String, GameStatistics> statisticsMap = new HashMap<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scan.nextLine();
        fillMap(fileName);
        setMapValues(fileName);

        System.out.println("Team:");
        String teamName = scan.nextLine();

        GameStatistics gm = statisticsMap.get(teamName);
        if (gm == null) {
            System.out.println("Games: 0");
            System.out.println("Wins: 0");
            System.out.println("Losses: 0");
        }
        System.out.println(gm);
    }

    static void setMapValues(String fileName) {
        try (Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                String line = file.nextLine();
                String[] parts = line.split(",");
                int homePoints = Integer.parseInt(parts[2]);
                int visitingPoints = Integer.parseInt(parts[3]);
                boolean homeWon = countHomeWins(homePoints, visitingPoints);
                boolean visitWon = countVisitWins(visitingPoints, homePoints);

                statisticValues(statisticsMap.get(parts[0]), homeWon);
                statisticValues(statisticsMap.get(parts[1]), visitWon);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void fillMap(String fileName) {
        try (Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                String line = file.nextLine();
                String[] parts = line.split(",");
                statisticsMap.put(parts[0], new GameStatistics());
                statisticsMap.put(parts[1], new GameStatistics());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static boolean countHomeWins(int homePoints, int visitingPoints) {
        return homePoints > visitingPoints;
    }

    static boolean countVisitWins(int visitingPoints, int homePoints) {
        return visitingPoints > homePoints;
    }

    static void statisticValues(GameStatistics gameStatistics, boolean won) {
        gameStatistics.incrementGames();
        if (won) {
            gameStatistics.incrementWins();
        } else {
            gameStatistics.incrementLosses();
        }
    }
}
