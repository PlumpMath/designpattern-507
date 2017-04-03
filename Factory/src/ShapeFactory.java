
public class ShapeFactory {

	public IShape getShape(String shapetype)
	{
		 if(shapetype == null){ 
	         return null; 
	      }
		 
		 if (shapetype == "Cicrle") {
			 
			 return new Circle();
			
		}
		 if (shapetype == "Square") {
			 return new Square();
			
		}
		 if (shapetype == "Rectangle")
		 {
			 return new Rectangle();
		 }
		return null;
		}
	


}
