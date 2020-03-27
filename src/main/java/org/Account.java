package org;
//Fig. 3.5 & 3.8: Account.java


public class Account {
    private String name;
    private double balance;

//Account constructor that recieves two parameters
    public Account (String name, double balance) {
        this.name = name;

        //validate that the balance is greater than 0.0; if it's not,
        //instance variable balance keeps its default initial value of 0.0
        if (balance >0.0) { //if the balance is valid
            this.balance = balance;  //assign it to instance variable balance
        }
    }

    //method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount) {
        if (depositAmount >0.0) { //if the deposit amount is valid
            balance = balance + depositAmount; //add it to the balance
        }
    }

    //method returns the account balance
    public double getBalance() {
        return balance;
    }

    //method
    public void setName (String name) {
        this.name = name;
    }

    //method
    public String getName() {
        return name;
    }
}
