
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int numberOfInteractions = 0;

        while (numberOfInteractions < number) {
            System.out.print("*");
            numberOfInteractions++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int numberOfInteractions = 0;

        while (numberOfInteractions < number) {
            System.out.print(" ");
            numberOfInteractions++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int incrementForStar = 0;
        int decrementForSpace = size -1;

        while (incrementForStar < size) {
            printSpaces(decrementForSpace);
            decrementForSpace--;

            incrementForStar++;
            printStars(incrementForStar);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int controlFlux = 0;
        int incrementForStar = 1;
        int decrementForSpace = height -1;

        while (controlFlux < height) {
            printSpaces(decrementForSpace);
            decrementForSpace--;

            printStars(incrementForStar);
            incrementForStar += 2;
            controlFlux++;
        }

        for (int i = 0; i < 2; i++) {
            printSpaces(height -2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
