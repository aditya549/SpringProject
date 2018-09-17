package Spring_Maven_Demo.Spring_Maven_Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        TestSpring ts=(TestSpring)context.getBean("test");
        System.out.println("---------------------");
        System.out.println("Id Is:  "+ts.getId());
        System.out.println("Name is:"+ts.getName());
        System.out.println("---------------------");
    }
}
