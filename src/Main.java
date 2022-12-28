import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void calcLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }

    public static void task1() {
        System.out.println("_____Задача 1_____");
        int year = 2024;
        calcLeapYear(year);
    }

    public static void choiceOfApp(int os, int year) {
        if (os == 0 && year <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (os == 1 && year <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (os == 0 && year > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (os == 1 && year > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Введены некорректные данные");
        }
    }

    public static void task2() {
        System.out.println("_____Задача 2_____");
        Scanner sc = new Scanner(System.in);
        System.out.println("Нажмите 0 если у вас iOS,\nНажмите 1 если у вас Adnroid");
        int clientOS = sc.nextInt();
        System.out.println("Введите год выпуска устройства");
        int clientDeviceYear = sc.nextInt();
        choiceOfApp(clientOS, clientDeviceYear);
    }

    public static int deliveryTimeCalc(int delDist) {
        int day = 1; //мин срок доставки

        if (delDist <= 20) {
            day = day;
        } else if (delDist > 20 && delDist <= 60) {
            day = day + 1;
        } else if (delDist > 60 && delDist <= 100) {
            day = day + 2;
        }
        return day;
    }

    public static void task3() {
        System.out.println("_____Задача 3_____");
        Scanner sc = new Scanner(System.in);
        System.out.println("ВВедите расстояние до офиса");
        int deliveryDistance = sc.nextInt();
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет!");
        } else {
            deliveryTimeCalc(deliveryDistance);
            System.out.println("Потребуется дней на доставку: " + deliveryTimeCalc(deliveryDistance));
        }
    }
}