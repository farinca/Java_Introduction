package lesson_2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        changeArr();
        writeInArr();
        multiplicationArr();
        squareDiagonalArr();
    }

    //1 задание
    //Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void changeArr() {
        int arr[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // 2 задание
    // Задать пустой целочисленный массив размером 8.
    // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void writeInArr() {
        int a = 0;
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
            a = a + 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    // 3 задание
    // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void multiplicationArr() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    // 4 задание
    // Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void squareDiagonalArr() {
        int[][] square = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == j) {
                    square[i][j] = 1;
                }
                if (i + j == square.length - 1) {
                    square[i][j] = 1;
                }
                System.out.print(square[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
