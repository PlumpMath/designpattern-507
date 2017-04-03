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
public class ToppinDecorator implements Pizza {
    protected Pizza tempPizza;
    public ToppinDecorator(Pizza newPizza)
    {
        this.tempPizza  = newPizza;
    }
    @Override
    public String getDescription() {
         return this.tempPizza.getDescription();
    }

    @Override
    public double getCost() {
       return this.tempPizza.getCost();
    }
}
