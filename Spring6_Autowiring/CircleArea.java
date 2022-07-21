//Bean scope 1: Singleton
//Bean scope 2: Prototype 
public class CircleArea {
	Point pointA;
	Point pointB;
	Point pointC; 
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	public void draw() {
		
		System.out.println("First Radius is: "+getPointA().r+" Area is: "+3.14*(getPointA().r*getPointA().r));
		System.out.println("First Radius is: "+getPointB().r+" Area is: "+3.14*(getPointB().r*getPointB().r));
		System.out.println("First Radius is: "+getPointC().r+" Area is: "+3.14*(getPointC().r*getPointC().r));
	}
}
