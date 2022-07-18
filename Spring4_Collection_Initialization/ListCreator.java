import java.util.*;
public class ListCreator {
	ArrayList<Point> alist = new ArrayList<Point>();
	Point pointA;
	Point pointB;
	Point pointC;
	
	public ArrayList<Point> getAlist() {
		return alist;
	}

	public void setAlist(ArrayList<Point> alist) {
		this.alist = alist;
	}
	
	
	public void iter() {
		for(Point p: alist) {
			System.out.println("Point x: "+p.getX()+" y: "+p.getY());
		}
	}
}
