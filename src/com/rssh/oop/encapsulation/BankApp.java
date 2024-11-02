package com.rssh.oop.encapsulation;

public class BankApp {
    public static void main(String[] args) {
        Bank mandiri = new Bank(1000000);
        Bank bca = new Bank(50000);

        System.out.println("Saldo Mandiri: " + mandiri.getBalance());
        System.out.println("Saldo BCA: " + bca.getBalance());

        mandiri.transfer(bca, 200000);

        System.out.println("-".repeat(40));
        System.out.println("Setelah Transfer");
        System.out.println("-".repeat(40));

        System.out.println("Saldo Mandiri: " + mandiri.getBalance());
        System.out.println("Saldo BCA: " + bca.getBalance());


        // int res = sum(5, 4); // sum menghasilkan return value
        // int res2 = sum2(5,4); // ini gabisa
    }

    static int sum(int x, int y){
        return x + y;
    }

    static void sum2(int x, int y){

    }
}
