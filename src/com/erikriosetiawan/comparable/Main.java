package com.erikriosetiawan.comparable;

public class Main {

    public static void main(String[] args) {
        PersegiPanjangKomparabel persegiPanjangPertama = new PersegiPanjangKomparabel(5, 4);
        PersegiPanjangKomparabel persegiPanjangKedua = new PersegiPanjangKomparabel(3, 6);
        System.out.println(Max.max(persegiPanjangPertama, persegiPanjangKedua));
        System.out.println(persegiPanjangPertama);
        System.out.println(persegiPanjangKedua);
    }
}
