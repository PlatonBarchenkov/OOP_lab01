/**
 * Этот класс демонстрирует сортировку массива целых чисел.
 */
public class Main {

    /**
     * Основной метод приложения.
     * @param args не используются.
     */
    public static void main(String[] args) {
        // Объявление и инициализация статического массива целых чисел
        int[] numbers = {5, 2, 8, 1, 3};

        // Вывод начального состояния массива
        System.out.println("Начальный массив:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Сортировка массива по возрастанию
        int n = numbers.length;
        // Алгоритм сортировки пузырьком
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Сравнение соседних элементов
                if (numbers[j] > numbers[j + 1]) {
                    // Обмен элементов при необходимости
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Вывод отсортированного массива
        System.out.println("Массив после сортировки по возрастанию:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Алгоритм сортировки пузырьком
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Сравнение соседних элементов
                if (numbers[j] < numbers[j + 1]) {
                    // Обмен элементов при необходимости
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Вывод отсортированного массива
        System.out.println("Массив после сортировки по убыванию:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


}
