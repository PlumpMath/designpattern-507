/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asad Abbas
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();
    
    public void addItem(Item item)
    {
        
        items.add(item);
    }
    
    public float getcost()
    {
        float cost = 0.0f;
        for(Item i :items)
        {
            cost+=i.price();
        }
        return cost;
    }
    
    public void ShowItems()
    {
        for(Item i : items)
        {
            System.out.println("name" + i.name());
            System.out.println("Packing"+i.packing().pack());
            System.out.println("Price"+i.price());
        }
    }
}
