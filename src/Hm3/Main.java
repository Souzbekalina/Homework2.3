package Hm3;

import Hm3.BankAccount;
import Hm3.LimitException;

public class Main {
    public static void main(String[] args) throws LimitException {
       BankAccount bankAccount=new BankAccount();
       bankAccount.deposit(20000);


       while (true){
           try {
               bankAccount.withDraw(6000);
           } catch (LimitException e) {
               System.out.println(e.getMessage());
               break;

           }



       }

    }
}