import java.util.ArrayList;
import java.util.Collections;

public abstract class Team<T extends Player> implements Comparable<Team<T>>{
    private String name = "Default name";
    private ArrayList<T> teamMembers = new ArrayList<>();
    private int won;
    private int lost;
    private int drew;

    public Team(String name) {
        this.name = name;
    }

    public int compareTo(Team<T> team) {
        if (team.score() > score()) {
            return -1;
        } else if (team.score() < score()) {
            return 1;
        } else return 0;
    }


    public void match(Team opponent, int ourScore, int theirScore) {
        String message;
        if (ourScore > theirScore) {
            won++;
            message = " wont with ";
        } else if (ourScore < theirScore) {
            lost++;
            message = " lost to ";
        } else {
            drew++;
            message = " drew with ";
        }
        if (opponent!=null) {
            opponent.match(null, theirScore, ourScore);
            System.out.println(this.name + message + opponent.name);
        }
    }

    public void addPlayer(T player) {
        if (!teamMembers.contains(player)) {
            teamMembers.add(player);
            System.out.println("Player " + player.getName() + " added to team " + this.name);
        } else {
            System.out.println("Player " + player.getName() + " already in team " + this.name);
        }
    }

    public String getName() {
        return name;
    }

    public int score() {
        return won *2 + drew;
    }
}
