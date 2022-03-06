package com.company;

public class Netherlands extends Countries implements Printable{

    private double population;

    public Netherlands(String capital,double population) {
        super(capital);
        this.population = population;
    }

    public void print(){
        System.out.println(this.getCapital() + " is the capital of Netherlands. Population: " + this.population + " million");
    }
}
