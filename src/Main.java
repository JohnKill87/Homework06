public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }
    public static void task1() {
        System.out.println("Задача 1");
        for (int n = 1; n <= 10; n++) {
            System.out.println("Итерация цикла " + n);
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        for (int n = 10; n >= 1; n--) {
            System.out.println("Итерация цикла " + n);
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        for (int n = 0; n <= 17; n = n + 2) {
            System.out.println("Итерация цикла " + n);
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        for (int n = 10; n >= -10; n--) {
            System.out.println("Итерация цикла " + n);
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        for (int n = 1904; n <= 2096; n = n + 4){
            System.out.println("Високосный год " + n);
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        for (int n = 7; n <= 98; n = n + 7){
            System.out.println("Итерация цикла " + n);
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        for (int n = 1; n <= 512; n = n * 2) {
            System.out.println("Итерация цикла " + n);
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        int salary = 29000;
        int moneyBox = 0;
        for (int n = 0; n <= 12; n++) {
            moneyBox = moneyBox + salary;
            System.out.println("Месяц " + n + ", сумма накоплений равна " + moneyBox);
        }
    }
    public static void task9() {
        System.out.println("Задача 9");
        int salary = 29000;
        int moneyBox = 0;
        for (int n = 0; n <= 12; n++) {
            moneyBox = moneyBox + moneyBox / 100;
            moneyBox = moneyBox + salary;
            System.out.println("Месяц " + n + ", сумма накоплений равна " + moneyBox);
        }
    }
    public static void task10() {
        System.out.println("Задача 10");
        int i = 2;
        int f = 0;
        for (int n = 1; n <= 10; n++) {
            f = i * n;
            System.out.println("Итерация цикла " + i + " * " + n + " = " + f);
        }
    }
}