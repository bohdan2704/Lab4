public class IterationalMethod {
    public static double IterationalViewFunction(double x) {
        return Math.pow(Math.E, -(x+1)*(x+1)*(x+1)) ;
//        return -2- 2/(x*x);
    }

    public static double Calculate(double initialGuess, double tolerance, int maxIterations) {
        double currentApproximation = initialGuess;

        for (int i = 0; i < maxIterations; i++) {
            double nextApproximation = IterationalViewFunction(currentApproximation);

            // Перевірка на збіжність за допомогою допустимої похибки
            if (Math.abs(nextApproximation - currentApproximation) < tolerance) {
                System.out.printf("%d\t\t", i);
                return currentApproximation;
            }

            currentApproximation = nextApproximation;
        }

        // Якщо метод не збігся за максимальну кількість ітерацій
        return Double.NaN;
    }
}
