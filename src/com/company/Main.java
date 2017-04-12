package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int operation;
        String numbers;

        do {

            System.out.println("Wybierz działanie:\n" +
                    "1. Dodawanie\n" +
                    "2. Odejmowanie\n" +
                    "3. Mnożenie\n" +
                    "4. Dzielenie\n" +
                    "5. Dzielenie modulo\n");

            operation = scanner.nextInt();



            System.out.print("Podaj dwie liczby oddzielone spacją: ");

            scanner.nextLine();
            numbers = scanner.nextLine();

            String number[] = numbers.split(" ");
            int number1 = Integer.parseInt(number[0]);
            int number2 = Integer.parseInt(number[1]);

            if(operation == 1){
                System.out.println("Wynik dodawania: " + (number1 + number2) + "\n");
            }else if(operation == 2) {
                System.out.println("Wynik odejmowania: " + (number1 - number2) + "\n");
            }else if(operation == 3) {
                System.out.println("Wynik mnożenia: " + (number1 * number2) + "\n");
            }else if(operation == 4) {
                System.out.println("Wynik dzielenia: " + (double)(number1 / number2) + "\n");
            }else if(operation == 5) {
                System.out.println("Wynik dzielenia modulo: " + (number1 % number2) + "\n");
            }
        }while(true);
    }
}