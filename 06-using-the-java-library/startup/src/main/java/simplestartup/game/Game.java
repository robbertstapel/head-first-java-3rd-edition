package simplestartup.game;

// goal: sink all 3 startups.
// in the fewest amount of turns
// you'll be given a score based on turns
// when launched, we place 3 startups randomly on the 7x7 grid
// when complete you can start guessing

public class Game {
    public static void main(String[] args) {

        Startup startup = new Startup();
        GameHelper helper = new GameHelper();

        boolean isAlive = true;
        int numOfGuesses = 0;
//        int startPosition = (int) (Math.random() * 5);

        startup.locationCells.add("1");
        startup.locationCells.add("2");
        startup.locationCells.add("3");


        while(isAlive){
            int guess = helper.GetUserInput("Guess a number:");
            numOfGuesses++;

            startup.pickACell(String.valueOf(guess));

            if(startup.getResult().equals("kill")){
                isAlive = false;
                System.out.println(STR. "Game over! You took \{numOfGuesses} guesses");
            }

        }
    }
}
