public class MagicCalculator extends Calculator {
    
    static double squareRoot(double a) {
        double answer = Math.sqrt(a);

        System.out.println("√" + a +  " = " + answer);
        return answer;
    }
    
    static double sin(double a) {
        double answer = Math.sin(a);

        System.out.println("sin(" + a + ") = " + answer);
        return answer;
    }
    
    static double cos(double a) {
        double answer = Math.cos(a);

        System.out.println("cos(" + a + ") = " + answer);
        return answer;
    }
    
    static double tan(double a) {
        double answer = Math.tan(a);

        System.out.println("tan(" + a + ") = " + answer);
        return answer;
    }
    
    static int factorial(int a) {
        int answer = 1;

        for (int i = 1; i <= a; i++) {
            answer = answer * i;
        }

        System.out.println("Factorial of " + a + " = " + answer);
        return answer;
    }
}
