 import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.able.beans.Logger;
import com.able.beans.Robot;

public class AppRobot {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		
		Robot rob = context.getBean(Robot.class);
		
		rob.speak();
		
		((ClassPathXmlApplicationContext) context).close();

	}

}
