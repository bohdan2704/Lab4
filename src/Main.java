// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
//  Math.cos(x) - x;
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        System.out.println(" ".repeat(42)+"Метод дихотомії");
        System.out.print("Значення кореня зі вказаною точністю (0.00001): ");
        DividingByTwo.Calculate(0.7, 0.8,0.00001, 0);
        System.out.println("Кількість ітерацій в залежності від зміни точності:");
        System.out.println("Точність:\te^-1\te^-2\te^-3\te^-4\te^-5\te^-6\te^-7\te^-8\te^-9\te^-10");
        System.out.print("Ітерації:\t");
        for(double e=0.01, i=0;i<10;i++, e*=0.1){
            DividingByTwo.Calculate(0.7, 0.8,e, 1);
        }
        System.out.println("\n");


        System.out.println(" ".repeat(42)+"Метод хорд");
        System.out.print("Значення кореня зі вказаною точністю (0.00001): ");
        InterpolationMethod.Calculate(0.7, 0.8,0.00001, 0);
        System.out.println("Кількість ітерацій в залежності від зміни точності:");
        System.out.println("Точність:\te^-1\te^-2\te^-3\te^-4\te^-5\te^-6\te^-7\te^-8\te^-9\te^-10");
        System.out.print("Ітерації:\t");
        for(double e=0.01, i=0;i<10;i++, e*=0.1){
            InterpolationMethod.Calculate(0.7, 0.8, e, 1);
        }
        System.out.println("\nЗначення кореня є помилковим");


        System.out.println(" ".repeat(42)+"\nМетод Ньютона");
        System.out.print("Значення кореня зі вказаною точністю (0.00001): ");
        System.out.println(NewtonMethod.Calculate(0.7,0.8,0.00001));
        System.out.println("Кількість ітерацій в залежності від зміни точності:");
        System.out.println("Точність:\te^-1\te^-2\te^-3\te^-4\te^-5\te^-6\te^-7\te^-8\te^-9\te^-10");
        System.out.print("Ітерації:\t");
        for(double e=0.01, i=0;i<10;i++, e*=0.1){
           NewtonMethod.Calculate(0.7,0.8,e);
        }

        System.out.println(" ".repeat(42)+"\nМетод Ітерацій");
        System.out.print("Значення кореня зі вказаною точністю (0.00001): ");
        double result = IterationalMethod.Calculate(-3,0.00001,10000);
        System.out.println(result);
        System.out.println("Кількість ітерацій в залежності від зміни точності:");
        System.out.println("Точність:\te^-1\te^-2\te^-3\te^-4\te^-5\te^-6\te^-7\te^-8\te^-9\te^-10");
        System.out.print("Ітерації:\t");
        for(double e=0.01, i=0;i<10;i++, e*=0.1){
            IterationalMethod.Calculate(0.2, e, 10000);
        }
        System.out.println("\nЗначення кореня є помилковим");

    }

}