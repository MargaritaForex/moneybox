package com.zabud.moneybox.models;
import lombok.*;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
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

    /**
     * Add a coins of $50 to MoneyBox. <br>
     * <b>pre: </b><br>
     * <b>post: </b>Add in one the coins' quantity of $50 in the MoneyBox.
     */
    public void addCoins50( )
    {
        numberCoins50 +=1;
    }

    /**
     * Add a coins of $100 a la alcancía. <br>
     * <b>pre: </b><br>
     * <b>post: </b>Add in one the coins' quantity of $100 in the MoneyBox.
     */
    public void addCoins100( )
    {
        numberCoins100 +=1;
    }

    /**
     * Add a coins of $200 a la alcancía. <br>
     * <b>post: </b>Add in one the coins' quantity of $200 in the MoneyBox.
     */
    public void addCoins200( )
    {
        numberCoins200 +=1;
    }

    /**
     * Add a coins of $500 a la alcancía. <br>
     * <b>pre: </b><br>
     * <b>post: </b>Add in one the coins' quantity of $500 in the MoneyBox.
     */
    public void addCoins500( )
    {
        numberCoins500 += 1;
    }

    /**
     * Add a coins of $1000 a la alcancía. <br>
     * <b>pre: </b><br>
     * <b>post: </b>Add in one the coins' quantity of $1000 in the MoneyBox.
     */
    public void addCoins1000( )
    {
        numberCoins1000 +=1;
    }


}
