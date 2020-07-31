public class BmiService {
    public long calculate(int BMI) {
        int weight = 58;
        double growth = 1.7;
        double index = weight / (growth * growth);

        return (long) index;

    }
}

