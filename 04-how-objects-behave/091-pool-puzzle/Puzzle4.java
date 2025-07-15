class Value {
    int intValue; // instance variable intValue (is null on init)

    public int doStuff(int factor){ // method that takes 1 argument int factor
        if(intValue > 100){ // if the intValue of the current object is > 100
            return intValue * factor; // return intValue * factor
        }
        else { // if the intValue of the current object is <= 100
            return intValue * (5 - factor); // return intValue * (5 - factor)
        }
    }
}

public class Puzzle4 {
    public static void main(String[] args) {
        Value[] values = new Value[6]; // set new values array and limit to 6
        int number = 1; // set number to 1
        int i = 0; // set i to 0

        while(i < 6){ // while i < 6
            values[i] = new Value(); // ** create array adding to 0,1,2,3,4,5
            values[i].intValue = number; // Value.intValue =[1, 10, 100, 1000, 10000, 100000]
            number = number * 10;
            i = i + 1;
        }

        int result = 0;
        i = 6;
        while(i > 0){
            i = i - 1;
            result = result + values[i].doStuff(i);
            // doStuff is backwards 5,4,3,2,1,0
            // current value of i = passed as factor to doStuff() method.
        }
        System.out.println("result " + result);
    }
}