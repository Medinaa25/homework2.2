package com.company;

public class Japan extends Countries implements Printable{

    private String mainland;

    public Japan(String capital,String mainland) {
        super(capital);
        this.mainland = mainland;
    }
    public void print(){
        System.out.println(this.getCapital() + " is the capital of Japan. Located: " + this.mainland);
    }
}
