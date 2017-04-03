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
public class Mozerella extends ToppinDecorator {
    
    public Mozerella(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Dough");
        System.out.println("Adding Moz");
    }
    
    @Override
    public String getDescription()
    {
        return this.tempPizza.getDescription()+" Mozzarella";    
    }
    
    /**
     *
     * @return
     */
    @Override
    public double getCost()
    {
        System.out.println("Cost of Moz: "+ .50);
        return this.tempPizza.getCost() + .50;
    }
    
}
