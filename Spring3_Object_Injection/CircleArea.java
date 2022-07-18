import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircleArea {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/**/spring.xml");
		BeanFactory factory = context;
		Circle cr = (Circle)factory.getBean("Circle");
		cr.draw();
	}
}
