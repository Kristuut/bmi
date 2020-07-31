public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 50;
        double growth = 1.7;
        long index = service.calculate(weight);

        System.out.println(index);

    }
}
