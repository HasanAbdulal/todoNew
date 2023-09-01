import static java.lang.Math.*;

public class BuiltinMethodMath {
    /*
     * static double    abs(double a) Returns the absolute value of a double value.
     * static float     abs(float a) Returns the absolute value of a float value.
     * static int       abs(int a) Returns the absolute value of an int value.
     * static long      abs(long a) Returns the absolute value of a long value.
     * static double    ceil(double a) Returns the smallest (closest to negative).
     * static double    floor(double a) Returns the largest (closest to positive).
     * static long      round(double a) Returns the closest long to the argument.
     * static int       round(float a) Returns the closest int to the argument.
     * static double    sqrt(double a) Returns the correctly rounded positive.
     * static double    cos(double a) Returns the trigonometric cosine of an angle.
     * static double    sin(double a) Returns the trigonometric sine of an angle.
     * static double    exp(double a) Returns Euler's number e raised to the power.
     * static double    log(double a) Returns the natural logarithm (base e) of a double value.
     * static double    log10(double a) Returns the base 10 logarithm of a double value.
     * static double    pow(double a, double b) Returns the value of the first argument raised to the power of the second argument.
     * static double    random() Returns a double value with a positive sign.
     * static double    max(double a, double b) Returns the greater of two double values.
     * static float     max(float a, float b) Returns the greater of two float values.
     * static int       max(int a, int b) Returns the greater of two int values.
     * static long      max(long a, long b) Returns the greater of two long values.
     * static double    min(double a, double b) Returns the smaller of two double values.
     * static float     min(float a, float b) Returns the smaller of two float values.
     * static int       min(int a, int b) Returns the smaller of two int values.
     * static long      min(long a, long b) Returns the smaller of two long values.
     *  */
    public static void main(String[] args) {
        // (random() * (max - min)+1) + min;
        int random = (int) (Math.random() * (10 - 1) + 1);
        System.out.println("random = " + random);
        float ran = (int) (Math.random() * (10 - 1) + 1);
        System.out.println("ran = " + ran);

        System.out.println("Max = " + max(max(2.3, max(10, 3)), 20));
        System.out.println("Min = " + min(min(2.3, min(10, 3)), 20));

    }
}
