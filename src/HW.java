import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        double n = scanner.nextDouble();
        double m = scanner.nextDouble();
        double dif = Math.abs(10.0 - m);
        double dif2 = Math.abs(10.0 - n);
        String dif3 = dif < dif2 ? m + " ближе к 10" : n + " ближе к 10";
        System.out.println(dif3);
    }
}
