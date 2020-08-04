public class BmiService {
    public long calculate(int weight, double growth) {
        double index = weight / (growth * growth);

        return (long) index;

    }
}

