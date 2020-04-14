package geekbrains.Java_introduction_1;

public class Main {
    //ex1 (1 задание) Метод main
    public static void main(String[] args) {

    }

    // 2 задание объявить и инициализировать переменные
    public static void variables() {
        byte a = 6;
        int b = 12000;
        long c = -280L;
        float d = 15.25f;
        double e = -42.425;
        char f = '@';
        boolean g = false;
    }

    // 3 задание
    // Метод возвращяющий результат (аргументы типа float)
    public static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    // 4 задание
    // Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    // в противном случае – false.
    public static boolean compare(int a, int b) {
        return ((10 <= (a+b)) && ((a+b) <= 20));
    }

    //5 задание
    //Написать метод, которому в качестве параметра передается целое число,
    //метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    //Замечание: ноль считаем положительным числом.
    public static void printPositiveNegative(int a) {
        if (a>0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }
    //6 задание
    //Написать метод, которому в качестве параметра передается целое число.
    //Метод должен вернуть true, если число отрицательное.
    public static boolean ifNegative(int a){
        return (a<0);
    }
    //7 задание
    //Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    //Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void printHelloName(String a){
        System.out.println("Привет, "+ a+"!");
    }
}
