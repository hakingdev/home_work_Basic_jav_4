import java.util.Scanner;
/*
Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
Числа могут быть, как целочисленные, так и дробные.


Например :
ввод : m=10.5, n=10.45
вывод: Число 10.45 ближе к 10.
 */
public class HW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        double n = scanner.nextDouble();
        double m = scanner.nextDouble();
        double dif = Math.abs(10 - m);
        double dif2 = Math.abs(10 - n);
        String dif3 = dif < dif2 ? m + " ближе к 10" : n + " ближе к 10";
        System.out.println(dif3);
    }
}
