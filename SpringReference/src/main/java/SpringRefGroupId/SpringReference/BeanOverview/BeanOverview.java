package SpringRefGroupId.SpringReference.BeanOverview;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanOverview {
	
	private static ApplicationContext ac;

	public static void main(String[] args) {
		
		ac = new ClassPathXmlApplicationContext(
				"spring_context.xml");
		
		//DefaultBean defaultBean = (DefaultBean) ac.getBean("defaultBean");
		
		/*ClientInstance bean = (ClientInstance) ac.getBean("clientInstance");
		bean.test();

		DefaultServiceLocator locator = (DefaultServiceLocator) ac
				.getBean("serviceLocator");
		
		Service service = (Service) ac
				.getBean("service");*/
	}
}
