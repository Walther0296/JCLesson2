//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // task 1. Написать метод, возвращающий количество чётных элементов массива.
        String str = "Количество четных элементов массива: ";
        int[] array1 = {2, 1, 2, 3, 4};
        int[] array2 = {2, 2, 0};
        int[] array3 = {1, 3, 5};
        System.out.println(str + countEvens(array1)); // 3
        System.out.println(str + countEvens(array2)); // 3
        System.out.println(str + countEvens(array3)); // 0
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



}