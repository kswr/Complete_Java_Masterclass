import java.util.ArrayList;
import java.util.Collections;

public abstract class League<T extends Team> {
    private String name;
    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }


    public void addTeam(T team) {
        if (!teams.contains(team)) {
            teams.add(team);
            System.out.println(team.getName() + " added to League " + name);
        } else {
            System.out.println("Team already in the league");
        }
    }

    public void printInOrder(){
        Collections.sort(teams);
        Collections.reverse(teams);
        for (Team team : teams) {
            System.out.println(team.getName());
        }
    }

    public void printLeague() {
        for (Team team : teams) {
            System.out.println(team.getName());
        }
    }
}
