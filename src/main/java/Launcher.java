import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by msi on 2016-04-14.
 */
public class Launcher {
    public void launch() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    }
}
