package lab6Q;

public class MyMethod { // Declares a public class named MyMethod
    // Constant for the value of PI (final means it can't be changed)
    final public static double PI = 3.141592653589793;

    // myPow: Calculates x raised to the power of y
    public static double myPow(double x, int y) {
        if (y == 0) return 1.0; // Any number to the power of 0 is 1

        double result = 1.0; // Initialize result to 1
        int exp = Math.abs(y); // Convert exponent to positive for consistent calculation

        // Multiply x exp. times
        for (int i = 0; i < exp; i++) {
            result *= x;
        }
        // If exponent was negative, return reciprocal of result; otherwise, return result
        return (y < 0) ? 1.0 / result : result;
    }

    // myFactorial: Calculates the factorial of n
    public static double myFactorial(int n) {
        if (n == 0) return 1.0; // 0! = 1

        double fact = 1.0; // Initialize result to 1
        // Multiply numbers from 2 to n
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact; // Return the calculated factorial
    }

    // mySin: Calculates the sine of x using the Taylor series expansion
    public static double mySin(double x) {
        double result = 0.0; // Initialize result to 0

        // Taylor series for sine up to 20 terms for better precision
        for (int n = 0; n < 20; n++) {
            // Calculate term using the formula:
            // (-1)^n * x^(2n + 1) / (2n + 1)!
            double term = myPow(-1.0, n) * myPow(x, (2 * n) + 1) / myFactorial((2 * n) + 1);
            result += term; // Add term to result
        }
        return result; // Return calculated sine value
    }

    // myCos: Calculates the cosine of x using the Taylor series expansion
    public static double myCos(double x) {
        double result = 0.0; // Initialize result to 0

        // Taylor series for cosine up to 20 terms for better precision
        for (int n = 0; n < 20; n++) {
            // Calculate term using the formula:
            // (-1)^n * x^(2n) / (2n)!
            double term = myPow(-1.0, n) * myPow(x, 2 * n) / myFactorial(2 * n);
            result += term; // Add term to result
        }
        return result; // Return calculated cosine value
    }

    // myDegreeToRadian: Converts degrees to radians
    public static double myDegreeToRadian(double degree) {
        // Multiply degree by PI/180 to convert to radians
        return degree * PI / 180;
    }

    // myToLowerCase: Converts an uppercase character to lowercase
    public static char myToLowerCase(char c) {
        if (c >= 'A' && c <= 'Z') { // Check if character is uppercase
            return (char) (c + 32); // Convert to lowercase using ASCII value
        }
        return c; // Return unchanged if already lowercase or not a letter
    }

    // myHeader: Displays formatted header with details about the lab and question
    public static void myHeader(int labNum, int questionNum, String description) {
        System.out.printf("**************************************************\n" + "Full name: Rivka Belemsaga\n" + "Lab Exercise: %d, Question: %d\n" + "Program Description: %s\n" + "**************************************************\n", labNum, questionNum, description);
    }

    // myFooter: Displays closing message with the question number
    public static void myFooter(int questionNum) {
        System.out.printf("\n*** Signing off from Question %d - Rivka :0 ***", questionNum);
    }
}

