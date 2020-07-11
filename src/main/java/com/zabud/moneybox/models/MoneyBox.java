package com.zabud.moneybox.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MoneyBox implements Serializable {

    // -----------------------------------------------------------------
    // attributes
    // -----------------------------------------------------------------

    /**
     * number of coins of $50 there are in the MoneyBox.
     */
    private int numberCoins50;

    /**
     * number of coins of $100 there are in the MoneyBox.
     */
    private int numberCoins100;

    /**
     * number of coins of $200 there are in the MoneyBox.
     */
    private int numberCoins200;

    /**
     *number of coins of $500 there are in the MoneyBox.
     */
    private int numberCoins500;

    /**
     *number of coins of $1000 there are in the MoneyBox.
     */
    private int numberCoins1000;

    /**
     *total money in the MoneyBox.
     */
    private int totalMoney;

}
