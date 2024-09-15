/**
 * @author Барченков Платон 3312
 * @version 1.00
 */
public class Main {
    /**
     * @param args Входных аргументов нет
     */
    public static void main(String[] args) {
        int[] arr = {12, 50, 70, 132, -37};

        // Вывод начального массива
        System.out.println("Начальный массив:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Сортировка массива по возрастанию
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                // Сравнение соседних элементов
                if (arr[j] > arr[j + 1]) {
                    // Обмен элементов при необходимости
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Вывод отсортированного массива
        System.out.println("Массив после сортировки по возрастанию:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Массив после сортировки по убыванию:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
