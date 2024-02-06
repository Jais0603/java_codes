
public class Stats<T extends Number> {
    private T[] data;

    public Stats(T[] data) {
        this.data = data;
    }

    public double getAverage() {
        double sum = 0.0;
        for (T num : data) {
            sum += num.doubleValue();
        }
        return sum / data.length;
    }

    public boolean sameAvg(Stats<?> other) {
        return Math.abs(this.getAverage() - other.getAverage()) < 0.0001;
    }
}
