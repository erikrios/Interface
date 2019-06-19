package com.erikriosetiawan.cloneable;

public class Main {

    public static void main(String[] args) {

        Rumah rumah1 = new Rumah(1, 1750.50);
        try {
            Rumah rumah2 = (Rumah) rumah1.clone();
            System.out.println(rumah1 == rumah2);
            System.out.println(rumah1.kapanDibangun == rumah2.kapanDibangun);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
