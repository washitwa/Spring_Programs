import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionList {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/**/spring.xml");
		BeanFactory factory = context;
		ListCreator lc = (ListCreator)factory.getBean("Lis");
		lc.iter();
	}
}
