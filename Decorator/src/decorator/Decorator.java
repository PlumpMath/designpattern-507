/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Asad Abbas
 */
public class Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pizza basicPizza = new Tikka(new Mozerella(new Fajita(new Mozerella(new PlainPizza()))));
        System.out.println(basicPizza.getDescription());
        System.out.println(basicPizza.getCost());
    }
    
}
