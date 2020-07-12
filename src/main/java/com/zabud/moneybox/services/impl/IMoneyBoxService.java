package com.zabud.moneybox.services.impl;

public interface IMoneyBoxService {

    public int calculateTotalMoney();

    public String initCoins(int coin);

    public int cantTotalCoins();

    public int cantCoinsbyValue(int coin);

    public int calculateTotalMoneyByValueCoins(int coin);
}
