package lesson_3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        puzzleNumber();
    }

    //1 задание
    //Написать программу, которая загадывает случайное число от 0 до 9
    // и пользователю дается 3 попытки угадать это число.
    // При каждой попытке компьютер должен сообщить,
    // больше ли указанное пользователем число, чем загаданное, или меньше.
    // После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
    public static void puzzleNumber() {
        int x = random.nextInt(9);
        int n = 0;
        int goOn;
        do {
            do {
                int userNumb = getNumberFromScanner("Введите число в пределах от 0 до 9", 0, 9);

                if (userNumb == x) {
                    System.out.println("Вы выиграли!");
                    break;
                }
                if (userNumb < x) {
                    System.out.println("Введенное число меньше загаданного");
                }
                if (userNumb > x) {
                    System.out.println("Введенное число больше загаданного");
                }
                n++;


            } while (n < 3);
            n = 0;
            goOn = numb("Повторить игру еще раз? 1 – да / 0 – нет", 0, 1);
        }
        while (goOn != 0);
        System.out.println("Увидимся позже");
    }


    public static int getNumberFromScanner(String message, int min, int max) {
        int x;
        do {
            System.out.println(message);
            x = scan.nextInt();
        } while (x < min || x > max);
        return x;
    }

    public static int numb(String message, int min, int max) {
        int y;
        do {
            System.out.println(message);
            y = scan.nextInt();
        } while (y < min || y > max);
        return y;
    }
}


