public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
    }
    public void addNumber(int number) {
        sum += number;
        this.count++;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        return this.sum == 0 ? 0 : (double) this.sum / getCount();
    }
}
