package com.kodilla.good.patterns.challenges;

public class User{

    private String firstName;
    private String lastName;

    public User(final String firstName,
                final String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
}