
public class Circle {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
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
		System.out.println("pointA object: "+getPointA()+"\npointB object: "+getPointB()+"\npointC object: "+getPointC());
		System.out.println("pointA x: "+getPointA().getX()+" y: "+getPointA().getY());
		System.out.println("pointB x: "+getPointB().getX()+" y: "+getPointB().getY());
		System.out.println("pointC x: "+getPointC().getX()+" y: "+getPointC().getY());
	}
}
