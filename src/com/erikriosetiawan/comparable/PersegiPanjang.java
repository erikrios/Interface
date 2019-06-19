package com.erikriosetiawan.comparable;

public class PersegiPanjang {

    private double panjang, lebar;

    public  PersegiPanjang() {

    }

    public PersegiPanjang(double panjang, double lebar) {

    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double luas() {
        return getPanjang() * getLebar();
    }
}
