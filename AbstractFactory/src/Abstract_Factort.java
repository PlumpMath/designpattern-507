
//import java.util.Scanner;


public class Abstract_Factort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner ss = new Scanner(System.in);
//        String input = ss.nextLine();
        AbstractFactory Shape = FactoryProducer.getfactory("Shape");
        Shpae shape1 = (Shpae) Shape.getshape("Circle");
        shape1.Draw();
        
        
        
    }
    
}
