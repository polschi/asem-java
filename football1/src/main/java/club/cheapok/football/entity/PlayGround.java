package club.cheapok.football.entity;

import java.io.*;
import java.util.Properties;

public class PlayGround {
    public static void main(String[] args) throws IOException {
        Player player = new Player("Vitalic", Player.PlayerRole.ATACKER);
        player.scoreGoal();
        System.out.println(player);

//        Console console = System.console();
//        String s = console.readLine();



    }
}
