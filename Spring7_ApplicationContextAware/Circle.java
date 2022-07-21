import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Circle implements ApplicationContextAware, BeanNameAware{
	Point pointA;
	Point pointB;
	Point pointC;
	ApplicationContext context = null;
	
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

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
		System.out.println("Context is: "+context);
		
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bena Name is: "+beanName);
	}
}
