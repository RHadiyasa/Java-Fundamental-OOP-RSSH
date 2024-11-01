package com.rssh.oop.encapsulation;

public class BankApp {
    public static void main(String[] args) {
        Bank mandiri = new Bank(1000000);
        Bank bca = new Bank(50000);

        System.out.println(mandiri.getBalance());
        mandiri.deposit(50000);
        System.out.println(mandiri.getBalance());

        bca.withdraw(10000);
        System.out.println(bca.getBalance());

//        int res = sum(5, 4); // sum menghasilkan return value
//        int res2 = sum2(5,4); // ini gabisa
    }

    static int sum(int x, int y){
        return x + y;
    }

    static void sum2(int x, int y){

    }
}
