package com.rrsh.oop.crud.service;

import com.rrsh.oop.crud.Sneakers;

public interface SneakersService {
    void addProduct(Sneakers sneakers);
    void view();
    void update(int id, String name, String brand, Integer price, Integer stock);
    void removeProduct(int id);
}
