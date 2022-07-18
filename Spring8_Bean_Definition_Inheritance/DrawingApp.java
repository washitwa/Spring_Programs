import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String[] args) {
		ApplicationContext context  = new ClassPathXmlApplicationContext("/**/spring.xml");
		BeanFactory factory = context;
		Circle cr = (Circle)factory.getBean("Circ");
		cr.draw();
	}
}
