package course1.cycles;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        hw2Task1();
        hw2Task2();
        hw2Task3();
        hw3Task1();
        hw3Task2();

    }
    public static void task1() {
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    public static void task2() {
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
    public static void task3() {
        System.out.println("Задание 3");
        for (int i = 2; i <= 17; i+=2) {
            System.out.println(i);
        }
    }
    public static void task4() {
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }
// ДОМАШНЕЕ ЗАДАНИЕ - 2
    public static void hw2Task1() {
        System.out.println("ДЗ -2. Задание 1");
        for (int i = 1904; i <= 2096; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.println(i + " год является высокосным");
            }
        }
    }
    public static void hw2Task2() {
        System.out.println("ДЗ -2. Задание 2");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void hw2Task3() {
        System.out.println("ДЗ -2. Задание 3");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

// ДОМАШНЕЕ ЗАДАНИЕ - 3
    public static void hw3Task1() {
        System.out.println("ДЗ -3. Задание 1");
        int savings = 29000;
        int total = 0;
        for (int i = 1; i < 13; i ++) {
            total = total + savings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
    public static void hw3Task2() {
        System.out.println("ДЗ -3. Задание 2");
        double savings = 29000;
        double total = 0;
        for (int i = 1; i < 13; i ++) {
            total = total + savings;
            double percent = total * 0.01;
            total = total + percent;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

}
