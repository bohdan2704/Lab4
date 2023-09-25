public class DividingByTwo {
    public static double Calculate(double a, double b, double e) {
        if (Main.NonLinearFunction(a)*Main.NonLinearFunction(b) > 0) {
            System.out.println("Invalid [a; b], no roots at this interval (or parabolic roots)");
        }
        double c = (a+b)/2;
        while ( (b-a)/2 > e) {
            if (Main.NonLinearFunction(a)*Main.NonLinearFunction(c) < 0) {
                System.out.println("New values: a = " + a + "b = " + c);
                b = c;
            }
            else if (Main.NonLinearFunction(c)*Main.NonLinearFunction(b) < 0) {
                System.out.println("New values: a = " + c + "b = " + b);
                a = c;
            }
            else  {
                System.out.println("Unexpected error during calculations");
                throw new ArithmeticException();
            }
            c = (a+b)/2; // NARROWING EVERYTHING
        }
        return c;
    }
}
