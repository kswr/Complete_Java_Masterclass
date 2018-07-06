public class TestDriveGener01 {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team<FootballPlayer> otherFootballTeam = new Team<>("Other");

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago cubs");
        baseballPlayerTeam.addPlayer(pat);
        System.out.println(baseballPlayerTeam.numPlayers());

        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("Soccer team");
        soccerPlayerTeam.addPlayer(beckham);

        adelaideCrows.matchResult(baseballPlayerTeam, 3, 2);
        soccerPlayerTeam.matchResult(adelaideCrows,1,1);

        System.out.println(adelaideCrows.compareTo(otherFootballTeam));
        System.out.println(adelaideCrows.ranking());
        System.out.println(otherFootballTeam.ranking());

    }
}
