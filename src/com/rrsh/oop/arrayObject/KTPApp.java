package com.rrsh.oop.arrayObject;

import java.util.Scanner;

public class KTPApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input jumlah pendaftar: ");
        int input = Integer.parseInt(scanner.nextLine());

        Person[] peoples = new Person[input];
        String name;
        int age;

        for (int i = 0; i < input; i++) {
            do {
                System.out.print("Input Name: ");
                name = scanner.nextLine();
                if (name.length() < 5) {
                    System.out.println("Minimum 5 char");
                }
            } while (name.length() < 5);

            do {
                System.out.print("Input Umur: ");
                age = Integer.parseInt(scanner.nextLine());

                if (age < 17) {
                    System.out.println("Minimum age 17");
                }
            } while (age < 17);

            peoples[i] = new Person(name, age);
        }

        System.out.println("-");
        for (Person person : peoples) {
            person.displayInfo();
        }

    }
}
