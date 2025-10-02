package simplestartup.game;

import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;

@Getter
@Setter
public class Startup {
    public ArrayList<String> locationCells = new ArrayList<>();
    public String result = "miss";

    public String pickACell(String userInput){
        result = "miss"; // default
        int index = locationCells.indexOf(userInput);

        if(index >= 0){
            locationCells.remove(index);
            if(locationCells.isEmpty()){
                result = "kill";
            } else {
                result = "hit";
            }
        }
        System.out.println(STR."Result: \{result}");
        return result;
    }

}


