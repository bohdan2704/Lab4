public class NewtonMethod {
    public static double NonLinearFunction(double x) {
        return x*x - Math.sin(5*x);
    }
    public static double NonLinearFunctionDerivative1(double x) {
        return 2*x-5*Math.cos(5*x);
    }
    public static double NonLinearFunctionDerivative2(double x) {
        return 25*Math.sin(5*x)+2;
    }
    public static double Calculate(double x1, double x2, double e) {
        double prev, cur;
        if (NonLinearFunction(x1)*NonLinearFunctionDerivative2(x1) > 0) {
            cur = x1;
        }
        else if (NonLinearFunction(x2)*NonLinearFunctionDerivative2(x2) > 0) {
            cur = x2;
        }
        else {
            System.out.println("Unsolvable point here, not for this method");
            return 0;
//            throw new ArithmeticException();
        }
        while ( Math.abs(NonLinearFunction(cur)) > e) {
            prev = cur;
            cur = prev - NonLinearFunction(prev)/NonLinearFunctionDerivative1(prev);
        }
        return cur;
    }
}
