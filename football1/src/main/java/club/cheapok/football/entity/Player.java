package club.cheapok.football.entity;

public class Player {
    private String name;
    private PlayerRole role;
    private int goals;

    public Player(String name, PlayerRole role) {
        this.name = name;
        this.role = role;
        this.goals = 0;
    }

    public void scoreGoal() {
        this.goals++;
    }

    public int getGoals() {
        return this.goals;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", role=" + role +
                ", goals=" + goals +
                '}';
    }

    public enum PlayerRole{
        ATACKER, DEFENDER, GOALKEEPER;
    }
}
