public class EquationSolver {
    public static double Calculate(double m, double c) {
        double y = 0;
        // Solve for x
        double x = (y - c) / m;
        System.out.println("The equation is 0 when x = " + x);
        return x;
    }
}