package club.cheapok.football;

import club.cheapok.football.entity.Player;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Playground {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
        Player player = context.getBean("player", Player.class);
        System.out.println(player);
        

    }


}
