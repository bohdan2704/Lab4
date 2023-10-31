public class DividingByTwo {
//    public static double Calculate(double a, double b, double e) {
//        if (Main.NonLinearFunction(a)*Main.NonLinearFunction(b) > 0) {
//            System.out.println("Invalid [a; b], no roots at this interval (or parabolic roots)");
//        }
//        double c = (a+b)/2;
//        int i = 0;
//        while ( (b-a)/2 > e) {
//            if (Main.NonLinearFunction(a)*Main.NonLinearFunction(c) < 0) {
////                System.out.println("New values: a = " + a + "b = " + c);
//                b = c;
//            }
//            else if (Main.NonLinearFunction(c)*Main.NonLinearFunction(b) < 0) {
////                System.out.println("New values: a = " + c + "b = " + b);
//                a = c;
//            }
//            else if (Main.NonLinearFunction(c)*Main.NonLinearFunction(b) == 0 || Main.NonLinearFunction(c)*Main.NonLinearFunction(a) == 0)
//                return 0;
//            else  {
//                System.out.println("Unexpected error during calculations");
//                return 0;
//            }
//            i++;
//            c = (a+b)/2; // NARROWING EVERYTHING
//        }
//        System.out.println("Total iterations for solution with provided accuracy: " + i);
//        return c;
//    }
public static void Calculate(double a, double b, double precision, int flag){
    double xr = (a+b)/2;  // межі проміжку
    int counter = 0;

    while(Math.abs(b-a) > precision) {  // уточнюємо значення кореня
        if(f(a) * f(xr) < 0)
            b = xr;
        else
            a = xr;
        xr = (a+b)/2;
        counter++;
    }
    if (flag == 0){     // виводимо результати
        System.out.print(xr + "\n");
        System.out.println("Кількість ітерацій: " + counter);
    }
    else{
        System.out.print(counter + "\t\t");
    }
}

    public static double f(double x){
        return Math.cos(x) - x;
    }
}
