public class Mix4 {
    int counter = 0;

    public int maybeNew(int index){
        if(index < 1){
            Mix4 mix = new Mix4();
            mix.counter++;
            return 1;
        }
        else {
            return 0;
        }
    }

}

class Mix4Test {
    public static void main(String[] args) {

        // set count and mixes as local vars
        int count = 0; // init count and set to 0
        Mix4[] mixes = new Mix4[20]; // create mixes var that should hold max 20 Mix4 objects

        int i = 0; // init i and set to 0
        while(i < 19){ // while i < whatever you put here
            mixes[i] = new Mix4(); // add new empty Mix4 object to the mixes array
            mixes[i].counter++; // increase the instance var "counter" of the current Mix4 object
            count++; // increase the local var "count"
            count = count + mixes[i].maybeNew(i); // adds again (either 0 or 1) to count with the returned value of maybeNew(i) (function expression in javascript)
            i++; // increase local var "i"
        }

        System.out.println(count + " " + mixes[1].counter);
    }
}

// block 1 = 14 1
// block 2 = 25 1
// block 3 = 14 1
// block 4 = 20 1