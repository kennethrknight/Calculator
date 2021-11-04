public class MyCalculator {
    public static void main(String[] args) throws Exception {
        System.out.println("Calculator tests: ");
        MagicCalculator.add(9, 10);
        MagicCalculator.subtract(10, 2);
        MagicCalculator.multiply(3, 10);
        MagicCalculator.divide(10, 3);
        MagicCalculator.square(5);
        MagicCalculator.squareRoot(25);
        MagicCalculator.sin(45);
        MagicCalculator.cos(45);
        MagicCalculator.tan(45);
        MagicCalculator.factorial(5);
    }
}
