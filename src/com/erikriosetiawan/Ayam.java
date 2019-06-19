package com.erikriosetiawan;

class Ayam extends Binatang implements Edible {
    @Override
    public String bagaimanaMemakan() {
        return "Ayam: Goreng saja";
    }
}