package com.company;

public class USA extends Countries implements Printable{
    private int states;

    public USA(String capital,int states) {
        super(capital);
        this.states = states;
    }
    public void print(){
        System.out.println(this.getCapital() + " is the capital of United States. USA have " + this.states + " states");
    }
}
