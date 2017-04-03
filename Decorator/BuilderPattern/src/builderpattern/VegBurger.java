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
public class VegBurger extends Burger {

    @Override
    public float price() {
        return  20.5f;
    }

    @Override
    public String name() {
        return "VegBurger";
    }
    
}
