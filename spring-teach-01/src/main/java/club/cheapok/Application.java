package club.cheapok;

import club.cheapok.entity.Player;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config/spring-configuration.xml");

        Player player = (Player) context.getBean("p2");

        System.out.println(player.getName() + " : " + player.getAge());
    }
}
