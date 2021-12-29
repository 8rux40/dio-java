package com.tardin.desafio.desafios_java_developer;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class MacPronalts {
    private static final Map<Integer, Double> products = Map.of(1001, 1.5, 1002, 2.5, 1003, 3.5, 1004, 4.5, 1005, 5.5);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        int productNumber = 0;
        int productAmount = 0;
        double totalValue = 0;
        int numberOfProducts = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfProducts; i++) {
            productNumber = scanner.nextInt();
            productAmount = scanner.nextInt();

            totalValue += products.get(productNumber) * productAmount;
        }

        System.out.printf("%.2f%n", totalValue);
        scanner.close();
    }
}
