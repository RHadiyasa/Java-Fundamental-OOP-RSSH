package com.rrsh.oop.arrayObject;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /**
         * String[] names = new String[4]; // java style
         String[] cars = {"Mazda","BMW"}; // C style

         names[0] = "Eja";
         names[1] = "Satrio";
         */

        // buat aplikasi sederhana
        // 1. Minta input jumlah orang
        // 2. Input nama sama umurnya (validasi minimal karakter nama 5 karakter, umur minimal 17 tahun)

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Name: ");
//        String name = scanner.nextLine(); // input String
//        System.out.println(name);
//
//        Person[] persons = new Person[4]; // Panjang array
//        persons[0] = new Person("Rafi", 26);
//        persons[1] = new Person("Eja", 26);
//        persons[2] = new Person("Satrio", 26);
//        persons[3] = new Person("Heraldo", 26);
//
//        // for biasa
//        for (int i = 0; i < persons.length; i++) {
//            persons[i].displayInfo();
//        }
//
//        System.out.println("-".repeat(40));
//        // for each
//        for(Person person : persons){
//            person.displayInfo();
//        }

        String name;
        int age;
        String hobby;

        System.out.print("Input name: ");
        name = scanner.nextLine(); // press enter
        System.out.print("Input Age: ");
        age = Integer.parseInt(scanner.nextLine()); // parsing nextLine menjadi nextInt
//        age = scanner.nextInt(); // press enter (ga ketampung)
//        scanner.nextLine(); // nampung enter dari nextInt();
        System.out.print("Input Hobby: ");
        hobby = scanner.nextLine();

        System.out.println(name);
        System.out.println(age);
        System.out.println(hobby);
    }
}
