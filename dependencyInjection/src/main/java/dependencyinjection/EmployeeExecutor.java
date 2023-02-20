package dependencyinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class EmployeeExecutor {

	public static void main(String[] args) {
		BasicIconFactory b=new BasicIconFactory("beans.xml");
		Employee e=b.getBean("e1",Employee.class);
		/*e1.setId(101);
		e1.setEmpname("Dularchand");*/
		e.display();
		
		Employee obj=b.getBean("e2",Employee.class);
		obj.display();

	}

}
