package com.erikriosetiawan.comparable;

public class PersegiPanjangKomparabel extends PersegiPanjang implements Comparable {

    /**
     * Menciptakan suatu PersegiPanjangKomparabel dengan properti tertentu
     *
     * @param panjang
     * @param lebar
     */
    public PersegiPanjangKomparabel(double panjang, double lebar) {
        super(panjang, lebar);
    }


    @Override
    public int compareTo(Object o) {
        if (luas() > ((PersegiPanjangKomparabel) o).luas()) {
            return 1;
        } else if (luas() < ((PersegiPanjangKomparabel) o).luas()) {
            return -1;
        } else {
            return 0;
        }
    }
}
