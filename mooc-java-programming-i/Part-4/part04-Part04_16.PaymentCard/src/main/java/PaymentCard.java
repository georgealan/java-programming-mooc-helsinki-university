public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }
    public void eatAffordably() {
        if (this.balance >= 2.60){ this.balance -= 2.60; }
    }
    public void eatHeartily() {
        if (this.balance >= 4.60){ this.balance -= 4.60; }
    }
    public void addMoney(double money) {
        if (money > 0) {
            boolean verifyLimit = (this.balance + money) <= 150.0;
            double change = money - (150.0 - this.balance);

            if (verifyLimit) {
                this.balance += money;
            } else {
                this.balance += (money - change);
            }
        }
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
