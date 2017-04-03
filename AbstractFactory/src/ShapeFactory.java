
public class ShapeFactory extends AbstractFactory {

    @Override
    Color getcolor(String color) {
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    Shpae getshape(String shape) {
        if(shape.equals("Circle"))
        {
            return new Circle();
        }
        else if(shape.equals("Rectangle"))
        {
            return new Rectangle();
        }
        else if(shape.equals("Square"))
        {
            return new Square();
        }
        return null;
    }
    
    
}
