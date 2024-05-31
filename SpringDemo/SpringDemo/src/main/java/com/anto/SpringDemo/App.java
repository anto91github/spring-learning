package com.anto.SpringDemo;

// import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// import org.springframework.core.io.FileSystemResource;



public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
    	
    	 Alien obj1 =  (Alien)context.getBean("alien");
    	 obj1.code();
    	 
    	 System.out.println(obj1.getAge()); // 10
    }
}
