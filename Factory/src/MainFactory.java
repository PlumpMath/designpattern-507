

public class MainFactory {

	

	public static void main(String[] args) {
		
		  ShapeFactory obj = new ShapeFactory();
		
		  IShape circle = obj.getShape("Circle");
		  circle.draw();
		
		
		
		 //get an object of Rectangle and call its draw method. 
	      IShape rectangle = obj.getShape("RECTANGLE");  
	      //call draw method of Rectangle 
	      rectangle.draw();  
	      //get an object of Square and call its draw method. 
	      IShape square = obj.getShape("SQUARE");  
	      //call draw method of circle 
	      square.draw();
		
		
		
		
		

	}

}
