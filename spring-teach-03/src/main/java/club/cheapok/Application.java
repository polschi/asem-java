package club.cheapok;

import club.cheapok.engine.GameEngine;
import club.cheapok.entity.Team;
import club.cheapok.service.TeamGenService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/spring-configuration.xml");


        TeamGenService teamGenService = context.getBean(TeamGenService.class);
        Team redTeam = teamGenService.genTeam("Red Team");
        System.out.println(redTeam);
        Team blueTeam = teamGenService.genTeam("Blue Team");
        System.out.println(blueTeam);

        GameEngine gameEngine = new GameEngine(redTeam, blueTeam);
        System.out.println(gameEngine.play());
        System.out.println(gameEngine.getScore());


    }
}
