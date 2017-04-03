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
public class ThreeCheesePizza implements Pizza{

    private String description = "Mozereella cheese Pizza";
        private double cost = 10.50;
        
         public void setDescription(String newd)
        {
            this.description = newd;
        }
    @Override
    public String getDescription() {
        
        return description;
       
    }
    
      public void setCost(double cost)
        {
           this.cost = cost;
        }

    @Override
    public double getCost() {
        return this.cost;
    }
    
}
