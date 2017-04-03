
public class Liskov {

	public static void main(String[] args) {
        Stationary s = new Rubber();
        s.getstationary();
        
        s = new Pencil();
        s.getstationary();
    }
}
