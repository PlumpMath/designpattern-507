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
public class Fajita extends ToppinDecorator{
    
    public Fajita(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Fajita");
    }
    
    @Override
    public String getDescription()
    {
        return this.tempPizza.getDescription()+" Fajita";    
    }
    
    /**
     *
     * @return
     */
    @Override
    public double getCost()
    {
        System.out.println("Cost of Fajita: "+ 2.50);
        return this.tempPizza.getCost() + 2.50;
    }
    
    
}
