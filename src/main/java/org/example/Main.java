package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int product = 0;
        try {
            int countOfPeople = scanner.nextInt();
            int countOfDays = scanner.nextInt();

            Vacation vacation = new Vacation(countOfPeople, countOfDays);
            product = vacation.calculate();
        }
        catch (InputMismatchException exception) {
            System.out.println("Вы ввели неравильные данные. Введите число");
        }
        System.out.println(product);
    }
}