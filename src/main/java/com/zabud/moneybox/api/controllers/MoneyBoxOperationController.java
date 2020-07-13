package com.zabud.moneybox.api.controllers;

import com.zabud.moneybox.services.impl.IMoneyBoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class MoneyBoxOperationController {

    @Autowired
    private IMoneyBoxService money;

    @GetMapping("/amountMoney")
    public String calculateTotalMoney(Model model){
        model.addAttribute("amountMoney", money.calculateTotalMoney());
        return "amountMoney";
    }

    @GetMapping("/addCoin/{coin}")
    public String initMoneyBox(@PathVariable("coin") int coin){
        money.initCoins(coin);
        return ("index");
    }

    @GetMapping("/quantityCoins")
    public String quantityCoins(Model model){
        model.addAttribute("quantityCoins", money.cantTotalCoins());
        return ("quantityMoney");
    }

    @GetMapping("/quantityCoinsByValue/{coin}")
    public String quantityCoinsByValue(@PathVariable("coin") int coin,Model model){
        model.addAttribute("quantityCoinsByValue", money.cantCoinsbyValue(coin));
        model.addAttribute("coin",coin);
        return ("quantityCoinsByValue");
    }

    @GetMapping("/TotalMoneyByValueCoins/{coin}")
    public String TotalMoneyByValueCoins(@PathVariable("coin") int coin,Model model){
        model.addAttribute("TotalMoneyByValueCoins", money.calculateTotalMoneyByValueCoins(coin));
        model.addAttribute("coin",coin);
        return ("TotalMoneyByValueCoins");
    }

    @GetMapping("/breakMoneyBox")
    public String breakMoneyBox(Model model){
        model.addAttribute("amountMoney", money.calculateTotalMoney());
        money.breakMoneyBox();
        return ("breakMoneyBox");
    }
}
