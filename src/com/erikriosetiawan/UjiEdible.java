package com.erikriosetiawan;

public class UjiEdible {

    public static void main(String[] args) {
        Object[] objek = new Object[] {new Harimau(), new Ayam(), new Apel()};
        for (int i = 0; i < objek.length; i++) {
            if (objek[i] instanceof Edible) {
                System.out.println(((Edible)objek[i]).bagaimanaMemakan());
            }
        }
    }
}
