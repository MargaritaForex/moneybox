package com.zabud.moneybox.services;
import com.zabud.moneybox.models.MoneyBox;
import com.zabud.moneybox.services.impl.IMoneyBoxService;
import com.zabud.moneybox.utils.Variables;
import org.springframework.stereotype.Service;

@Service
public class MoneyBoxService implements IMoneyBoxService {


    MoneyBox moneyBox = new MoneyBox();

    /**
     * Return the money total there are  in the MoneyBox.
     *
     * @return Return the money total there are  in the MoneyBox.
     */
    public int calculateTotalMoney() {
        return moneyBox.getNumberCoins1000() * Variables.MIL.getValue() +
                moneyBox.getNumberCoins500() * Variables.QUINIENTOS.getValue() +
                moneyBox.getNumberCoins200() * Variables.DOSCIENTOS.getValue() +
                moneyBox.getNumberCoins100() * Variables.CIEN.getValue() +
                moneyBox.getNumberCoins50() * Variables.CINCUENTA.getValue();
    }

    public void initCoins(int coin) {
        switch (coin) {
            case 1000:
                moneyBox.addCoins1000();
                break;
            case 500:
                moneyBox.addCoins500();
                break;
            case 200:
                moneyBox.addCoins200();
                break;
            case 100:
                moneyBox.addCoins100();
                break;
            case 50:
                moneyBox.addCoins50();
                break;
        }
    }

    @Override
    public int cantTotalCoins() {
        return moneyBox.getNumberCoins1000() + moneyBox.getNumberCoins500() + moneyBox.getNumberCoins200() +
                moneyBox.getNumberCoins100() + moneyBox.getNumberCoins50();
    }

}
