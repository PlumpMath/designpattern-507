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
public class BuilderPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Single Veg");
        System.out.println("");
       MeaBuilder m = new MeaBuilder();
       Meal veg = m.meal1();
       
       veg.ShowItems();
       System.out.println(veg.getcost());
       
       System.out.println("Single Chicken");
        System.out.println("");
       Meal chk = m.meal2();
       chk.ShowItems();
       System.out.println(chk.getcost());
       
        System.out.println("Combo");
         System.out.println("");
       Meal com = m.meal2();
       com.ShowItems();
       System.out.println(com.getcost());
    }
    
}
