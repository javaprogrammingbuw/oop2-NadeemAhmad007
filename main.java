//always start your class names with capitol letters!
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Circle(2);
		double a= s.area();
	        double c=s.circumference();
	        s.setColor(2, 5, 5);
		System.out.println(a);
		System.out.println(c);
	}

}
