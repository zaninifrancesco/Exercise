package com.company;

public class Account {
    private String name;
    private int numAccount;
    private int amount;

    public Account(String n, int numAccount, int amount){
        this.amount = amount;
        this.numAccount = numAccount;
        this.name = n;
    }

    public int getAmount() {
        return amount;
    }


    public void deposita(int amountToDeposit){
        this.amount += amountToDeposit;
    }

    public void prelieva(int amountToWithdrawn){
        this.amount -= amountToWithdrawn;
    }

    public void showAccountInfo(){
        System.out.println("ACCOUNT NAME: " + this.name + "\nACCOUNT NUMBER " + this.numAccount + "\nAMOUNT AVAILABLE: " + this.amount);
    }

    public int getNumAccount(){
        return numAccount;
    }

}
