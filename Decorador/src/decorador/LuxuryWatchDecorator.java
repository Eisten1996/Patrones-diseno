/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorador;

/**
 *
 * @author ASDUM
 */
public class LuxuryWatchDecorator extends WatchDecorator{
    
    public LuxuryWatchDecorator(Watch watch) {
        super(watch);
    }

    @Override
    public void createFuncionality() {
        super.createFuncionality();
        System.out.println("and more features (Luxury Watch): "
        );
        addFastCharge();
        addImpermeability();
        addNFC();   
    }
    
     private void addFastCharge(){
         System.out.println("FastChange");

     }
     private void addImpermeability(){
         System.out.println("Impermeablity");
     }
     private void addNFC(){
         System.out.println("NFC");
     }
}
