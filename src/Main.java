//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // task 1. Написать метод, возвращающий количество чётных элементов массива.
        System.out.println("Задание №1.");
        String str1 = "Количество четных элементов массива: ";
        int[] array1 = {2, 1, 2, 3, 4};
        int[] array2 = {2, 2, 0};
        int[] array3 = {1, 3, 5};
        System.out.println(str1 + countEvens(array1)); // 3
        System.out.println(str1 + countEvens(array2)); // 3
        System.out.println(str1 + countEvens(array3)); // 0

        System.out.println("Задание №2.");
        // task2. Написать функцию, возвращающую разницу между самым большим и самым
        // маленьким элементами переданного не пустого массива.
        String str2 = "Разница между самым большим и самым маленьким элементом массива равна: ";
        int[] array6 = {2, 4, 6, 8, 10, 12};
        int result = getDifference(array6);
        System.out.println(str2 + result); // 10

        // task3. Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента,
        // с нулевым значением.
        System.out.println("Задание №3.");
        String str3 = "Правда ли, что в первом переданном массиве есть два соседних элемента с нулевым значением: ";
        int[] array4 = {7, 4, 0, 0, 8};
        boolean result1 = checkZeroNeighbors(array4);
        System.out.println(str3 + result1); // Выводит true

        String str4 = "Правда ли, что во втором переданном массиве есть два соседних элемента с нулевым значением: ";
        int[] array5 = {2, 0, 4, 7, 8};
        boolean result2 = checkZeroNeighbors(array5);
        System.out.println(str4 + result2); // Выводит false

    }

    //  task1 countEvens метод, который принимает массив чисел в качестве аргумента
    //  и возвращает количество четных чисел в этом массиве.

    public static int countEvens(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    // task2 getDifference принимает массив `arr`.
    // В цикле проходим по элементам массива, сохраняя
    // минимальное и максимальное значения в переменных
    // `minElem` и `maxElem` соответственно.
    // Затем находим разницу между ними и возвращаем в качестве результата.
    public static int getDifference(int[] arr) {
        int minElem = arr[0];
        int maxElem = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minElem) {
                minElem = arr[i];
            }
            if (arr[i] > maxElem) {
                maxElem = arr[i];
            }
        }
        int diff = maxElem - minElem;
        return diff;
    }

    // Task3 checkZeroNeighbors принимает массив `arr` и в цикле проверяет каждый элемент
    // и его соседа справа. Если найдено два соседних элемента
    // с нулевым значением, то функция возвращает true. Если такие
    // элементы не найдены, функция возвращает false.
    public static boolean checkZeroNeighbors(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}