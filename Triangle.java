
public class Triangle extends Shape implements IRightAngle {
int a;
int b;
public Triangle (int a,int b) {
	this.a=a;
	this.b=b;
}
	public  double pythagoras() {
		 return Math.pow(a, 2)+ Math.pow(b,2);
	}
	public  double area() {
		return .5*a*b;
	}
	public  double circumference() {
		return a+b+pythagoras();
	}
}
