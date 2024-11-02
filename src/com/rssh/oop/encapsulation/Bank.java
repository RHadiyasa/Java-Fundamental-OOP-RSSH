package com.rssh.oop.encapsulation;

public class Bank {
    private Integer balance; // non-primitive

    public Bank(Integer balance) {
        this.balance = balance;
    }

    public void deposit(Integer amount) {
        this.balance += amount;
    }

    public void transfer(Bank bank, Integer amount){
        Integer receiveTransfer = bank.getBalance() + amount;
        bank.setBalance(receiveTransfer);
        this.balance -= amount;
    }

    public void withdraw(Integer amount) {
        if (amount > this.balance) {
            System.out.println("Saldo kurang");
        } else {
            this.balance -= amount;
        }
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
