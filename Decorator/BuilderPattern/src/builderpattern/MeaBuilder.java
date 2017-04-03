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
public class MeaBuilder {
    public Meal meal1()
    {
        Meal m = new Meal();
        m.addItem(new VegBurger());
        m.addItem(new Coke());
        return m;
    }
    public Meal meal2()
    {
        Meal m = new Meal();
        m.addItem(new ChickenBurger());
        m.addItem(new Pepsi());
        return m;
    }
    
    public Meal Combo()
    {
        Meal m = new Meal();
        m.addItem(new ChickenBurger());
        m.addItem(new VegBurger());
        m.addItem(new Pepsi());
         m.addItem(new Coke());
        return m;
    }
}
