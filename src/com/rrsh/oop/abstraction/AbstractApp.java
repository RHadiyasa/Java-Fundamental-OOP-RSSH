package com.rrsh.oop.abstraction;

import java.util.Scanner;

public class AbstractApp {
    /**
     * TODO:
     * 1. Abstract
     * Sebuah class yang bisa memiliki abstract method, dan method biasa.
     * abstract method -> sebuah method yang tidak dideklarasikan isinya (namanya doang).
     * <p>
     * 2. Scanner -> inputan di java
     */
    public static void main(String[] args) {
//        Shape rectangle = new Rectangle(5.0); // polymorph
//        Shape circle = new Circle(10);
//        System.out.println("Keliling: " + rectangle.getKeliling());
//        System.out.println("Luas: " + rectangle.getArea());
//
//        System.out.println("Area: " + circle.getArea());
//        System.out.println("Keliling: " + circle.getKeliling());

//        System.out.println("-".repeat(40));
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan panjang: "); // pake print biasa biar ga ada enter
        Double length = (double) sc.nextInt(); // casting (merubah tipe data dari int -> Double)
        System.out.print("Masukan lebar: ");
        Double width = (double) sc.nextInt(); // casting (merubah tipe data dari int -> Double)
        System.out.print("Masukan tinggi: ");
        Double height = (double) sc.nextInt(); // casting (merubah tipe data dari int -> Double)

        Block block = new BlockChild(length, width, height); // polymorph
        System.out.printf("Keliling balok: %f\n", block.getKeliling()); // printf sama kaya di C
        System.out.println("Luas Balok: " + block.getArea());
        System.out.println("Volume Balok: " + block.getVolume());
    }
}
