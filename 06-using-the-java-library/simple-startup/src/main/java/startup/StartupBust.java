package startup;

public class StartupBust {
    private static boolean startupsAlive = true;
    private int numberOfGuesses;

    public static void main(String[] args) {
        System.out.println("Hello from StartupBust!");

        // Create 3 startups
        Startup startupA = new Startup("poniez");
        Startup startupB = new Startup("cabista");
        Startup startupC = new Startup("hacqi");



        GameHelper helper = new GameHelper();
        while(startupsAlive){
            String result = "miss";
            int guess = helper.GetUserInput("Guess a number:");
            if(guess == 10){
                startupsAlive = false;
            }
        }


    }

}
