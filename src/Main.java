// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static double NonLinearFunction(double x) {
        return x*x - Math.sin(5*x);
    }
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

//        System.out.println(NewtonMethod.Calculate(-1, -0.85, 0.000001));
//        System.out.println(NewtonMethod.Calculate(-0.8, -0.65, 0.000001));
//        System.out.println(NewtonMethod.Calculate(-0.5, 0.5, 0.000001));
//        System.out.println(NewtonMethod.Calculate(0.5, 0.65, 0.000001));
//        System.out.println("\n\n");

//        System.out.println(InterpolationMethod.Calculate(-1, -0.85, 0.000001));
//        System.out.println(InterpolationMethod.Calculate(-0.8, -0.65, 0.000001));
//        System.out.println(InterpolationMethod.Calculate(-0.5, 0.5, 0.000001));
//        System.out.println(InterpolationMethod.Calculate(0.5, 0.65, 0.000001));
//        System.out.println("\n");

        System.out.println(IterationalMethod.Calculate(-1, -0.85, 0.000001));
        System.out.println(IterationalMethod.Calculate(-0.8, -0.65, 0.000001));
        System.out.println(IterationalMethod.Calculate(-0.5, 0.5, 0.000001));
        System.out.println(IterationalMethod.Calculate(0.5, 0.65, 0.000001));
        System.out.println("\n");

//        System.out.println(DividingByTwo.Calculate(-1, -0.85, 0.000001));
//        System.out.println(DividingByTwo.Calculate(-0.8, -0.65, 0.000001));
//        System.out.println(DividingByTwo.Calculate(-0.5, 0.5, 0.000001));
//        System.out.println(DividingByTwo.Calculate(0.5, 0.65, 0.000001));

    }
}