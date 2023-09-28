public class IterationalMethod {
    public static double IterationalViewFunction(double x) {
        return x + 1E-6*(x*x - Math.sin(5*x));
    }
    public static double IterationalViewFunctionDerative(double x) {
        return 1E-6*(2*x-5*Math.cos(5*x))+1;
    }
    public static double Calculate(double x1, double x2, double e) {
        double prev, cur;
        if (Math.abs(IterationalViewFunctionDerative(x1)) < 1 || Math.abs(IterationalViewFunctionDerative(x2)) < 1) {
            cur =  IterationalViewFunction(x1);
        }
        else {
            System.out.println("Unsolvable point here, not for this method");
            return 0;
        }
        do {
            prev = cur;
            cur = IterationalViewFunction(prev);
        } while (Math.abs(cur - prev) > e);
        return cur;
    }
}
