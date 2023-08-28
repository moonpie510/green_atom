// Описание что делал ниже
/**
 * Видел что надо было выбрать одно задание на выбор, но стало интересно и я сделал два :)
 * В классе Task3_1 - Задание с инвертированием односвязного списка.
 * В классе Task3_2 - Задание со строкой палиндромом.
 *
 * Я не был уверен что можно было использовать LinkedList, потому что это он реализоован как
 * двусвязный список, а в задании говорится про однозвязный список, поэтому реализовал свой
 * класс односвязного списка и назвал его SingleLinkedList.
 */

public class Task3_1 {
    public static void main(String[] args) {
        SingleLinkedList<String> list = new SingleLinkedList<>();
        list.add("hello");
        list.add("world");

        list.print();
        list.reverse();
        list.print();

        SingleLinkedList<Integer> arr = new SingleLinkedList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        arr.print();
        arr.reverse();
        arr.print();
    }
}