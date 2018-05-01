package club.cheapok.service;

import club.cheapok.entity.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PlayerGenService {
    private static List<String> firstNames = Arrays.asList("Adrian", "Victor", "Ion", "Andrei", "Cornel", "Mihai", "Gicu");
    private static List<String> mutableLastNames = new ArrayList<>(Arrays.asList("Iaka", "Whatever", "Popescu", "Gibson", "Zuckerberg", "Gates", "Hagi"));
    private static Random random = new Random();

    public Player genPlayer() {
        return new Player(genName(), genAge());
    }

    public String genName() {
//        random.setSeed(1983);
        StringBuilder sb = new StringBuilder();
        int firstNameIndex = random.nextInt(firstNames.size());
        int lastNameIndex = random.nextInt(mutableLastNames.size());
        sb.append(firstNames.get(firstNameIndex))
          .append(" ")
          .append(mutableLastNames.get(lastNameIndex));
        return sb.toString();
    }

    public int genAge() {
        int min = 18;
        return min + random.nextInt(22);
    }




}
