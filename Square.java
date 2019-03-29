
public class Square extends Shape {
	double height;
	double width;
	
	public Square(double height,double width) {
		this.height =height;
		this.width =width;
	}
	public double area() {
		return height*width;
	}
	public double circumference() {
		return 4*height;
	}
	
}
