package startup.game;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SimpleStartup {
    int[] locationCells;
    int numOfHits = 0;

    public String guessOnce(int guess){
        String result = "miss"; // default
        for(int locationCell : locationCells){
            if(guess == locationCell){
                numOfHits++;
                result = (numOfHits == locationCells.length ? "kill" : "hit");
            }
        }
        System.out.println(result);
        return result;
    }

}
