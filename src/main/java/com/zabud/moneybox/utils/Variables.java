package com.zabud.moneybox.utils;

public enum Variables {
    CINCUENTA(50),
    CIEN(100),
    DOSCIENTOS(200),
    QUINIENTOS(500),
    MIL(1000);

    private int value;

    Variables(int value ) { this.value = value; }

    public int getValue() {return this.value;}
}
