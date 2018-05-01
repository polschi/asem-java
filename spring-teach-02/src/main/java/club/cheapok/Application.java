package club.cheapok;

import club.cheapok.entity.Player;
import club.cheapok.entity.Team;
import club.cheapok.service.PlayerGenService;
import club.cheapok.service.TeamGenService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.ParameterizedTypeReference;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/spring-configuration.xml");


//        //Part I - Create a Player using a service
//        PlayerGenService playerGenService = context.getBean(PlayerGenService.class);
//        Player player = playerGenService.genPlayer();
//        System.out.println(player);

        //Part II - Create a Team of Players having the PlayerGenService being injected into the TeamGenService

        TeamGenService teamGenService = context.getBean(TeamGenService.class);
        Team red_team = teamGenService.genTeam("Red Team");
        System.out.println(red_team);

    }
}
