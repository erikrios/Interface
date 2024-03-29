package com.erikriosetiawan.comparable;

/**
 * Max.java: mencari suatu objek maksimum
 */
public class Max {

    /**
     * Mengembalikan maksimum dari dua objek
     */
    public static Comparable max(Comparable o1, Comparable o2) {
        if (o1.compareTo(o2) > 0) {
            return o1;
        } else {
            return o2;
        }
    }
}
