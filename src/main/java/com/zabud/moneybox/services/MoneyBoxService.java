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

    public String initCoins(int coin) {
        String into = "Ingreso correctamente el dinero";
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
            default:
                into = "El dinero no esta entre el rango permitido";
        }
        return into;
    }

    @Override
    public int cantTotalCoins() {
        return moneyBox.getNumberCoins1000() + moneyBox.getNumberCoins500() + moneyBox.getNumberCoins200() +
                moneyBox.getNumberCoins100() + moneyBox.getNumberCoins50();
    }

    @Override
    public int cantCoinsbyValue(int coin) {
        return ValueMoney(0,coin);
    }

    @Override
    public int calculateTotalMoneyByValueCoins(int coin) {
        return ValueMoney(1,coin);
    }

    @Override
    public void breakMoneyBox() {
        moneyBox.setNumberCoins50(0);
        moneyBox.setNumberCoins100(0);
        moneyBox.setNumberCoins200(0);
        moneyBox.setNumberCoins500(0);
        moneyBox.setNumberCoins1000(0);
    }

    private int ValueMoney(int option, int coin) {
        int quantityCoins = 0;
        int valuecoin =0;
        switch (coin) {
            case 1000:
                quantityCoins = moneyBox.getNumberCoins1000();
                valuecoin = Variables.MIL.getValue();
                break;
            case 500:
                quantityCoins = moneyBox.getNumberCoins500();
                valuecoin = Variables.QUINIENTOS.getValue();
                break;
            case 200:
                quantityCoins = moneyBox.getNumberCoins200();
                valuecoin = Variables.DOSCIENTOS.getValue();
                break;
            case 100:
                quantityCoins = moneyBox.getNumberCoins100();
                valuecoin = Variables.CIEN.getValue();
                break;
            case 50:
                quantityCoins = moneyBox.getNumberCoins50();
                valuecoin = Variables.CINCUENTA.getValue();
                break;

        }
        if(option==0){
            return quantityCoins;
        }else{
            return  valuecoin*quantityCoins;
        }
    }
}
