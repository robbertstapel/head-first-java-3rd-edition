package startup.game;

import java.util.*;

public class Game {
    public static void main(String[] args) {

        SimpleStartup simpleStartup = new SimpleStartup();
        GameHelper helper = new GameHelper();
        boolean isAlive = true;
        int numOfGuesses = 0;
        int startPosition = (int) (Math.random() * 5);
        int[] locations = {startPosition, startPosition + 1, startPosition + 2};
        simpleStartup.setLocationCells(locations);
        Set<Integer> gameResults = new HashSet<>();

        while(isAlive){
            int guess = helper.GetUserInput("Guess a number:");

            if(gameResults.contains(guess)){
                System.out.println("No duplicates allowed!");
            } else{
                String result = simpleStartup.guessOnce(guess);
                gameResults.add(guess);
                numOfGuesses++;
                if(result.equals("kill")){
                    System.out.println(STR. "Game over! you took \{numOfGuesses} guesses");
                    isAlive = false;
                }
            }
        }
    }
}
