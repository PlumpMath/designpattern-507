
public class FactoryProducer {
    public static AbstractFactory getfactory(String Fact)
    {
        if(Fact.equals("Shape"))
        {
            return new ShapeFactory();
        }
        else if(Fact.equals("Color"))
        {
            return new ColorFactory();
        }
        return null;
    }
}
