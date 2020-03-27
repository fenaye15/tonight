package org;
//Fig. 3.5: Account.java

public class Account {
    private String name;

//constructor
    public Account (String name) {
        this.name = name;
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
