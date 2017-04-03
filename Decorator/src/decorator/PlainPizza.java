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
public class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
         return "Thin Dough";
    }

    @Override
    public double getCost() {
       System.out.println("Cost Of Dough:"+4.00);
       return 4.00;
    }
    
}
