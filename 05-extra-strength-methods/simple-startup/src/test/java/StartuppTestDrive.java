import startup.game.SimpleStartup;

public class StartuppTestDrive {
    public static void main(String[] args) {
        SimpleStartup dot = new SimpleStartup();
        // set location cells for this test
        int[] locations = {1, 2, 3};
        dot.setLocationCells(locations);

        // make user guess
        int userGuess = 2;
        // verify and print result
        String result = dot.guessOnce(userGuess);
        String testResult = "failed";
        if(result.equals("hit")){
            testResult = "passed";
        }

        System.out.println("Test 1: " + testResult);

        testResult = "failed";
        userGuess = 4;
        result = dot.guessOnce(userGuess);
        if(result.equals("miss")){
            testResult = "passed";
        }

        System.out.println("test 2: " + testResult);

        testResult = "failed";
        dot.setNumOfHits(0);
        userGuess = 1;
        result = dot.guessOnce(userGuess);
        userGuess = 2;
        result = dot.guessOnce(userGuess);
        userGuess = 3;
        result = dot.guessOnce(userGuess);

        if(result.equals("kill")){
            testResult = "passed";
        }

        System.out.println("test 3: " + testResult);

    }
}
