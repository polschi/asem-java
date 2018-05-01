package club.cheapok.entity;

public class Goal {
    private double time;
    private Team team;
    private Player player;

    public Goal(final double time, final Team team, final Player player) {
        this.time = time;
        this.team = team;
        this.player = player;
    }

    @Override
    public String toString() {
        return "Goal{" +
                "@time=" + String.format("%,.2f", time) +
                ", by team=" + team.getName() +
                ", scored by player=" + player +
                '}';
    }
}
