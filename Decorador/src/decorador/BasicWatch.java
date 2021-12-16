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
public class BasicWatch implements Watch {

    @Override
    public void createFuncionality() {
        System.out.println("Basic Watch with: ");
        this.addTimer();
    }
    private void addTimer(){
        System.out.println("Timer");
    }
    
}
