/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorador;

/**
 * @author ASDUM
 */
public class Decorador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Watch basicWatch = new BasicWatch();
        basicWatch.createFuncionality();
        System.out.println("\n-----------");
        Watch sportsWatch = new SportWatchDecorator(new BasicWatch());
        sportsWatch.createFuncionality();
        System.out.println("\n---------");
        Watch sportsLuxuryWatch = new LuxuryWatchDecorator(new SportWatchDecorator(new BasicWatch()));
        sportsLuxuryWatch.createFuncionality();
    }

}
