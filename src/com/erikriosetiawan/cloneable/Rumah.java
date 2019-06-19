package com.erikriosetiawan.cloneable;

import java.util.Date;

public class Rumah implements Cloneable, Comparable {

    private int id;
    private double luas;
    Date kapanDibangun;

    public Rumah(int id, double luas) {
        this.id = id;
        this.luas = luas;
        kapanDibangun = new Date();
    }

    public int getId() {
        return id;
    }

    public double getLuas() {
        return luas;
    }

    public Date getKapanDibangun() {
        return kapanDibangun;
    }

    /**
     * Mengoverride metode klon protected yang didefinisikan dalam
     * kelas object, dan memperkuat aksesibilitasnya
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * Mengimplementasi metode compareTo, didefinisikan dalam
     * Comparable
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(Object o) {
        if (luas > ((Rumah) o).luas) {
            return 1;
        } else if (luas < ((Rumah) o).luas) {
            return -1;
        } else {
            return 0;
        }
    }
}
