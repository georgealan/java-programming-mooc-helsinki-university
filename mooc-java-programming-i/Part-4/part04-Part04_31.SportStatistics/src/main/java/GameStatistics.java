public class GameStatistics {
    private int games;
    private int wins;
    private int losses;

    public GameStatistics() {
        this.games = 0;
        this.wins = 0;
        this.losses = 0;
    }

    public void incrementGames() {
        this.games++;
    }

    public void incrementWins() {
        this.wins++;
    }

    public void incrementLosses() {
        this.losses++;
    }

    public int getGames() {
        return games;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    @Override
    public String toString() {
        return "Games: " + this.games + "\n" + "Wins: " + this.wins + "\n" + "Losses: " + this.losses;
    }
}
