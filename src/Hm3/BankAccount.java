package Hm3;

import Hm3.LimitException;

public class BankAccount {
    private int amount;


    public int getAmount() {


        return amount;
    }


    public String deposit(int sum) throws LimitException {
        amount = +sum;


        return "Ваш баланс составляет " + amount;
    }


    public String withDraw(int sum) throws LimitException {
        if (sum >= amount) {
            throw new LimitException("Ошибка.запращиваямая сумма больше чем остаток денег на счете " + amount, (double) amount);
        } amount = amount - sum;
            return "Успешно. Вы  вывели на сумму 6000: " + amount;

    }

}



