package com.zabud.moneybox.api.controllers;

import com.zabud.moneybox.models.MoneyBox;
import com.zabud.moneybox.services.MoneyBoxService;
import com.zabud.moneybox.services.impl.IMoneyBoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MoneyBoxController {

    @Autowired
    private IMoneyBoxService money;

    @GetMapping("/amountMoney")
    public int calculateTotalMoney(){
        return money.calculateTotalMoney();
    }

    @GetMapping("/addCoin/{coin}")
    public String initMoneyBox(@PathVariable("coin") int coin){
         return money.initCoins(coin);
    }

    @GetMapping("/quantityCoins")
    public int quantityCoins(){
        return money.cantTotalCoins();
    }

    @GetMapping("/quantityCoinsByValue/{coin}")
    public int quantityCoinsByValue(@PathVariable("coin") int coin){
        return money.cantCoinsbyValue(coin);
    }

    @GetMapping("/TotalMoneyByValueCoins/{coin}")
    public int TotalMoneyByValueCoins(@PathVariable("coin") int coin){
        return money.calculateTotalMoneyByValueCoins(coin);
    }

}
