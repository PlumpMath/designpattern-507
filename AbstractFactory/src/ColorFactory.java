
public  class ColorFactory extends AbstractFactory  {

    @Override
    Color getcolor(String color) {
         if(color.equals("Red"))
        {
            return new Red();
        }
        else if(color.equals("Green"))
        {
            return new Green();
        }
        else if(color.equals("Blue"))
        {
            return new Blue();
        }
        return null;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    Shpae getshape(String shape) {
        return null;//To change body of generated methods, choose Tools | Templates.
    }
    
}
