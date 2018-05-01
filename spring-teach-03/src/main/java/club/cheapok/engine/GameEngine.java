package club.cheapok.engine;

import club.cheapok.entity.Goal;
import club.cheapok.entity.Team;
import club.cheapok.service.PlayerGenService;
import club.cheapok.service.TeamGenService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameEngine {
    private Team team1;
    private Team team2;
    private int team1Score;
    private int team2Score;

    private Random random = new Random();

    public GameEngine(final Team team1, final Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public List<Goal> play() {
        double time = 0.0;
        List<Goal> goals = new ArrayList<>();
        for (; time < 45.0; time+=random.nextDouble()*8) {
            double prob = random.nextDouble();
            if (prob > 0.15 && prob < 0.85) {
                System.out.println(String.format("%,.2f",time)+" a pass");
            } else if (prob < 0.15) {
                Goal goal = new Goal(time, team1, team1.getPlayers().get(1));
                goals.add(goal);
                team1Score++;
                System.out.println(goal);
            } else {
                Goal goal = new Goal(time, team2, team2.getPlayers().get(1));
                goals.add(goal);
                team2Score++;
                System.out.println(goal);
            }
        }
        return goals;
    }

    public String getScore() {
        return team1.getName() + " " + team1Score + " : " + team2Score + " " + team2.getName();
    }

}
