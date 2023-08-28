// Описание что делал ниже
/**
 * Видел что надо было выбрать одно задание на выбор, но стало интересно и я сделал два :)
 * В классе Task3_1 - Задание с инвертированием односвязного списка.
 * В классе Task3_2 - Задание со строкой палиндромом.
 */

public class Task3_2 {
    public static void main(String[] args) {
        String text1 = "Я Ем Змея";
        String text2 = "Race Car";
        String text3 = "112211";
        String text4 = "Hello world";

        System.out.println(text1 + " палиндром? - " + isPalindrome(text1));
        System.out.println(text2 + " палиндром? - " + isPalindrome(text2));
        System.out.println(text3 + " палиндром? - " + isPalindrome(text3));
        System.out.println(text4 + " палиндром? - " + isPalindrome(text4));
    }

    public static boolean isPalindrome(String text) {
        if (text.isEmpty()) {
            return true;
        }
        text = text.replaceAll("[^a-zA-Z0-9А-Яа-я]", "");
        text = text.toLowerCase();

        int pointerToStart = 0;
        int pointerToEnd = text.length() - 1;

        while (pointerToEnd > pointerToStart) {
            if (text.charAt(pointerToStart) != text.charAt(pointerToEnd)) {
                return false;
            }

            pointerToStart++;
            pointerToEnd--;
        }

        return true;
    }
}
