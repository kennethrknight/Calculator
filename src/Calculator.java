public class Calculator {
    static int add(int a, int b) {
        int answer = a + b;

        System.out.println(a + " + " + b + " = " + answer);
        return answer;
    }
    static int subtract(int a, int b) {
        int answer = a - b;
        
        System.out.println(a + " - " + b + " = " + answer);
        return answer;
    }
    static int multiply(int a, int b) {
        int answer = a * b;

        System.out.println(a + " * " + b + " = " + answer);
        return answer;
    }
    static double divide(int a, int b) {
        double answer = (double)a / (double)b;

        System.out.println(a + " / " + b + " = " + answer);
        return answer;
    }
    static int square(int a) {
        int answer = a ^ 2;

        System.out.println(a + " ^2 " + " = " + answer);
        return answer;
    }
}
