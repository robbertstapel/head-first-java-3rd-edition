package comments;

import startup.game.GameHelper;
import startup.game.SimpleStartup;

import java.util.HashSet;
import java.util.Set;

public class GameWithComments {
    public static void main(String[] args) {

        // declare int var to hold numOfGuesses
        int numOfGuesses = 0;
        // make new SimpleStartUp instance
        SimpleStartup simpleStartup = new SimpleStartup();
        // Compute a random number between 0-4 for start pos
        int startPosition = (int) (Math.random() * 5);
        // make int array that holds the starting num and adds the 2 extra nums (1,2,3) or (5,6,7) depending on the random number
        int[] locations = {startPosition, startPosition + 1, startPosition + 2};
        // invoke setLocationCells on Startup instance
        simpleStartup.setLocationCells(locations);
        // Declare boolean holding the state of the game name isAlive SET to true;
        boolean isAlive = true;

        GameHelper helper = new GameHelper();

        // keep gameResults for each guess in an array.
        Set<Integer> gameResults = new HashSet<>();

        // make the array unique so no identical items can exist
        // inform the user to choose another number

        // While Startup isAlive
        while(isAlive){
            // GET user input from command line
            int guess = helper.GetUserInput("Guess a number:");
            // invoke guess method on Startup instance

            if(gameResults.contains(guess)){
                System.out.println("No dups please");
            } else{
                String result = simpleStartup.guessOnce(guess);
                gameResults.add(guess);
                System.out.println(STR. "Game results \{gameResults}");

                System.out.println(STR. "this was the guess \{guess}");

                // increment numOfGuesses
                numOfGuesses++;
                // Check for Startup death - if result is kill
                if(result.equals("kill")){
                // Print num of userGuesses
                    System.out.println(STR. "Game over! you had \{numOfGuesses} turns");
                // SET isAlive to FALSE
                    isAlive = false;
                }
            }
        } // endwhile

    }
}
