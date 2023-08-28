// Описание что делал ниже
/**
 * Я реализовал смену значений переменных двумя способами.
 * Метод swapFirstWay() использует исключающее ИЛИ.
 * А метод swapSecondWay() использует операции сложения и вычитания для смены мест переменных.
 */

public class Task2 {
    public static int a;
    public static int b;

    public static void main(String[] args) {
        a = 3;
        b = 5;
        System.out.println("До применения функции swapFirstWay(), a = " + a + " b = " + b);
        swapFirstWay();
        System.out.println("После применения, a = " + a + " b = " + b + "\n");

        a = 9;
        b = 4;
        System.out.println("До применения функции swapSecondWay(), a = " + a + " b = " + b);
        swapSecondWay();
        System.out.println("После применения, a = " + a + " b = " + b + "\n");
    }

    public static void swapFirstWay() {
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
    }
    public static void swapSecondWay() {
        a = a + b; //8
        b = a - b; // 3
        a = a - b;

    }
}
