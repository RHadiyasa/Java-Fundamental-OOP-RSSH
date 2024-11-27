package com.rrsh.oop.crud;

import com.rrsh.oop.crud.service.SneakerServiceImpl;
import com.rrsh.oop.crud.service.SneakersService;

import java.util.Scanner;

public class Menu {
    private final SneakersService sneakersService = new SneakerServiceImpl();
    private final Scanner scanner = new Scanner(System.in);
    boolean choose = true;
    public void startApp(){
        while(choose){
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("0. Exit");
            System.out.print("Choose : ");
            int input = Integer.parseInt(scanner.nextLine());
            switch(input){
                case 1:
                    add();
                    break;
                case 2:
                    sneakersService.view();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 0:
                    choose = false;
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

    private void add(){
        System.out.println("Enter product name: ");
        String name = scanner.nextLine();
        System.out.println("Enter product brand: ");
        String brand = scanner.nextLine();
        System.out.println("Enter product price: ");
        Integer price = Integer.parseInt(scanner.nextLine());
        System.out.println("stock: ");
        Integer stock = Integer.parseInt(scanner.nextLine());

        Sneakers savedSneakers = new Sneakers(name, brand, price, stock);
        sneakersService.addProduct(savedSneakers);
    }

    private void update(){
        System.out.println("Enter product ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter product name: ");
        String name = scanner.nextLine();
        System.out.println("Enter product brand: ");
        String brand = scanner.nextLine();
        System.out.println("Enter product price: ");
        Integer price = Integer.parseInt(scanner.nextLine());
        System.out.println("stock: ");
        Integer stock = Integer.parseInt(scanner.nextLine());

        sneakersService.update(id, name, brand, price, stock);
    }

    private void delete(){
        System.out.println("Enter product ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        sneakersService.removeProduct(id);
    }

}
