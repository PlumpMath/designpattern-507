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
public class Tikka extends ToppinDecorator {
    
    public Tikka(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Tikka");
    }
    
    @Override
    public String getDescription()
    {
        return this.tempPizza.getDescription()+" Tikka";    
    }
    
    /**
     *
     * @return
     */
    @Override
    public double getCost()
    {
        System.out.println("Cost of tikka: "+ 1.50);
        return this.tempPizza.getCost() + 1.50;
    }
    
    
}
