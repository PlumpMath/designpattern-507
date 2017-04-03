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
public class Coke extends ColdDrink {

    @Override
    public float price() {
       return 35.5f;
    }

    @Override
    public String name() {
        return "Coke";
    }
    
}
