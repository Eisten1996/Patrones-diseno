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
public class SportWatchDecorator extends WatchDecorator {
    
    public SportWatchDecorator(Watch watch) {
        super(watch);
    }

    @Override
    public void createFuncionality() {
      super.createFuncionality();
        System.out.println("and mores features (Sport Watch) : ");
          this.addPedometer();
          this.addSleppMode();
    }
    private void addPedometer(){
        System.out.println("Pedometer");
    }
    private void addSleppMode(){
        System.out.println("SleppMode");
    }
    
}
