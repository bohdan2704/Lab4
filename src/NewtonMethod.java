public class NewtonMethod {
    public static double NonLinearFunction(double x) {
        return Math.cos(x) - x;
    }
    public static double NonLinearFunctionDerivative1(double x) {
        return -Math.sin(x)-1;
    }
    public static double NonLinearFunctionDerivative2(double x) {
        return -Math.cos(x);
    }
    public static double Calculate(double x1, double x2, double e) {
        double prev, cur;
        double t1 = NonLinearFunction(x1)*NonLinearFunctionDerivative2(x1);
        double t2 = NonLinearFunction(x2)*NonLinearFunctionDerivative2(x2);
        double t3 = NonLinearFunction((x2+x1)/2)*NonLinearFunctionDerivative2((x2+x1)/2);
        if (t1 > 0) {
            cur = x1;
        }
        else if (t2 > 0) {
            cur = x2;
        }
        else if (t3 > 0) {
            cur = (x2+x1)/2;
        }
        else {
            System.out.println("Unsolvable point here, not for this method");
            return 0;
//            throw new ArithmeticException();
        }
        int i = 0;
        while ( Math.abs(NonLinearFunction(cur)) > e) {
            i++;
            prev = cur;
            double a = NonLinearFunction(prev);
            double b = NonLinearFunctionDerivative1(prev);

            cur = prev - a/b;
        }
        //System.out.println("Total iterations for solution with provided accuracy: " + i);
        System.out.print(i + "\t\t");
        return cur;
    }
}
