package Converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double exchange;
        double quantity;
        double result;
        Scanner in = new Scanner(System.in);
        System.out.printf("Курс доллара: ");
        exchange = in.nextDouble();
        System.out.printf("Колличество рублей: ");
        quantity = in.nextDouble();
        result = quantity/exchange;
        System.out.printf("Итого долларов: " + "%.2f",result);
    }
}
