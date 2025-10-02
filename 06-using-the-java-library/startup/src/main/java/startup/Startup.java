package startup;

import lombok.Getter;
import lombok.Setter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;

@Getter
@Setter
@RequiredArgsConstructor
public class Startup {
    @NonNull
    private String name;
    public ArrayList<String> locationCells = new ArrayList<>();
    public String result = "miss";

    public String userSelectCell(String userInput){
        result = "miss";
        int index = locationCells.indexOf(userInput); // if there is a positive indexOf we have a hit!
        if(index >= 0){ // indexOf returns a negative value if nothing is found @ userInput
            locationCells.remove(index);
            if(locationCells.isEmpty()){
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }

}
