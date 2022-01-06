package Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Subodh on 06/01/2022.
 */
public class output {
    public static void main(String [] arg){
        ApplicationContext context=new ClassPathXmlApplicationContext("CollectionInjection.xml");
        CollectionInjection collectionInjection= (CollectionInjection) context.getBean("collection");
        System.out.println(collectionInjection);
    }
}
