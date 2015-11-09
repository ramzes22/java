package SpringRefGroupId.SpringReference.AutowiringCollaborators;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringCollaborators {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring_context_autowiring.xml");
		Printer print = (Printer) context.getBean("printer");
        print.printFigure();
	}
}
