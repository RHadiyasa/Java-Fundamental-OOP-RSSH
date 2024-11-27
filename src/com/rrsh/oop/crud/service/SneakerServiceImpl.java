package com.rrsh.oop.crud.service;

import com.rrsh.oop.crud.Sneakers;


public class SneakerServiceImpl implements SneakersService{
    private static final int MAX_PRODUCT = 10;
    private final Sneakers[] productSneakers = new Sneakers[MAX_PRODUCT];
    private int count = 0;

    @Override
    public void addProduct(Sneakers sneakers) {
        if (count >= MAX_PRODUCT){
            System.out.println("Storage full");
            return;
        }

        productSneakers[count] = sneakers;
        count++;
        System.out.println("Product added");
    }

    @Override
    public void view() {
        if (count == 0){
            System.out.println("Nothing added");
            return;
        }

        // for each
        for (int i = 0; i < count; i++){
            System.out.println(productSneakers[i].displayInfo());
        }
    }

    @Override
    public void update(int id, String name, String brand, Integer price, Integer stock) {
        if (id < 1 || id > count){
            System.out.println("ID NOT FOUND");
            return;
        }

        Sneakers productSneaker = productSneakers[id - 1];
        productSneaker.setName(name);
        productSneaker.setBrand(brand);
        productSneaker.setPrice(price);
        productSneaker.setQty(stock);
        System.out.println("Product updated");
    }

    @Override
    public void removeProduct(int id) {
        if (id < 1 || id > count){
            System.out.println("ID NOT FOUND");
            return;
        }

        for (int i = 0; i < count; i++){
            productSneakers[i] = productSneakers[i+1];
        }

        productSneakers[count - 1] = null;
        count--;
        System.out.println("Product removed");
    }
}
