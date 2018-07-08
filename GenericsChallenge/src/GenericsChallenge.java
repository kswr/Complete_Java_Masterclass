class GenericsChallenge {
    // Create a generic class to implement a league table for a sport.
    // The class should allow teams to be added to the list, and store
    // a list of teams that belong to the league.
    //
    // Your class should have a method to print out the teams in order,
    // with the team at the top of the league printed first.
    //
    // Only teams of the same type should be added to any particular
    // instance of the league class - the program should fail to compile
    // if an attempt is made to add an incompatible team.
    public static void main(String[] args) {
        FootballLeague footballLeague01 = new FootballLeague("Football League 1");
        FootballLeague footballLeague02 = new FootballLeague("Football League 2");
        SoccerLeague soccerLeague01 = new SoccerLeague("Soccer League 1");
        FootballTeam footballTeam01 = new FootballTeam("Football Team 1");
        FootballTeam footballTeam02 = new FootballTeam("Football Team 2");
        FootballTeam footballTeam03 = new FootballTeam("Football Team 3");
        SoccerTeam soccerTeam01 = new SoccerTeam("Soccer Team 1");

//      does not work; as expected
//        soccerLeague01.addTeam(footballTeam01);

        footballLeague01.addTeam(footballTeam01);
        footballLeague01.addTeam(footballTeam01);
        footballLeague01.addTeam(footballTeam02);
        footballLeague01.addTeam(footballTeam03);
        footballTeam03.match(footballTeam01, 5, 3);
        footballTeam03.match(footballTeam02, 5, 3);
        footballTeam03.match(footballTeam01, 1,1);

        System.out.println(footballTeam01.score());
        System.out.println(footballTeam02.score());
        System.out.println(footballTeam03.score());
        footballLeague01.printLeague();
        // collections modify in place
        footballLeague01.printInOrder();
        footballLeague01.printLeague();

    }
}
