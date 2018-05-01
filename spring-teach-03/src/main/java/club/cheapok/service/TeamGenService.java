package club.cheapok.service;

import club.cheapok.entity.Player;
import club.cheapok.entity.Team;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TeamGenService {

    PlayerGenService playerGenService;

    public Team genTeam(String name) {
        final List<Player> players = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            players.add(playerGenService.genPlayer());
        }
        Team team = new Team(name, players);
        return team;
    }

    public void setPlayerGenService(final PlayerGenService playerGenService) {
        this.playerGenService = playerGenService;
    }
}
