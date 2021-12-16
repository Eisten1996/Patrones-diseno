/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronobserver;

/**
 *
 * @author ASDUM
 */
public class PatronObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //clase observable
        BankAccount bankAccount =new BankAccount();
        //clase observador
        BankExpense bankExpense1= new BankExpense("commission",0.11d);
        BankExpense bankExpense2= new BankExpense("expense",0.22d);
        BankExpense bankExpense3= new BankExpense("compensation",0.33d);
        
       /*
        añadimos estos observadores a la clase 
        observable
        */
       bankAccount.addObserver(bankExpense1);
       bankAccount.addObserver(bankExpense2);
       bankAccount.addObserver(bankExpense3);
       // cambiar el estado observable
       bankAccount.addAmount(1000d);
       bankAccount.addAmount(1000d);
       
       //el observador fue notificado
         System.out.println(bankExpense1.toString());
         System.out.println(bankExpense2.toString());
         System.out.println(bankExpense3.toString());
           
    }
    
}
