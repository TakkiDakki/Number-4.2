public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float height = (float) 1.70;

        float index = (int) service.calculate(52, (float) 1.70);
        System.out.println(index);
    }
}