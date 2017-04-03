/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

/**
 *
 * @author Asad Abbas
 */
public abstract  class ColdDrink implements Item {

    

    @Override
    public Packing packing() {
        return new Bottle(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public abstract float price();
    
    
}
