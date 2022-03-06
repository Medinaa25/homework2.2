package com.company;

public abstract class Countries {
    private String capital;

    public Countries(String capital) {
        this.capital = capital;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
