
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int giftValue = scan.nextInt();

        double giftValueCalcResult = calcTaxLimit(giftValue);

        if (giftValueCalcResult == 0) {
            System.out.println("No tax!");
        } else {
            System.out.println("Tax: " + giftValueCalcResult);
        }

    }

    static double calcTaxLimit(int giftValue) {
        int taxLowerLimit = 0;
        double taxRate = 0;
        int rangeValue = 0;

        if (giftValue < 5000){
            taxLowerLimit = 0;
            taxRate = 0;
            rangeValue = 0;
        } else if (giftValue > 5000 && giftValue <= 25000) {
            taxLowerLimit = 100;
            taxRate = 0.08;
            rangeValue = 5000;
        } else if (giftValue > 25000 && giftValue <= 55000) {
            taxLowerLimit = 1700;
            taxRate = 0.10;
            rangeValue = 25000;
        } else if (giftValue > 55000 && giftValue <= 200000) {
            taxLowerLimit = 4700;
            taxRate = 0.12;
            rangeValue = 55000;
        } else if (giftValue > 200000 && giftValue <= 1000000) {
            taxLowerLimit = 22100;
            taxRate = 0.15;
            rangeValue = 200000;
        } else if (giftValue > 1000000) {
            taxLowerLimit = 142100;
            taxRate = 0.17;
            rangeValue = 1000000;
        }

        double result = calcGiftTax(giftValue, taxLowerLimit, taxRate, rangeValue);

        return result;
    }

    static double calcGiftTax(int giftValue, int taxLowerLimit, double taxRate, int rangeValue) {
        double result = taxLowerLimit + (giftValue - rangeValue) * taxRate;

        return result;
    }
}
