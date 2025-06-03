public class Hobbit {
    String name;

    public static void main(String[] args) {
        Hobbit[] hobbits = new Hobbit[3];
        int z = 0;

        // We say'd Hobbit[3]; which means Hobbit Array with 3 length.
        // If we while loop this smaller then 4, 0,1,2,3 would be exceeding this.
        while(z < 3) {
            hobbits[z] = new Hobbit();
            hobbits[z].name = "bilbo";

            if(z == 1){
                hobbits[z].name = "frodo";
            }
            if(z == 2){
                hobbits[z].name = "sam";
            }

            System.out.println(hobbits[z].name + " is a good Hobbit name");

            // This should be incremented after the object is created.
            // Else we run into issues, we enter with 2 which is smaller than 3
            // Right after we add 1 so 3 < 3 == false;
            z++;
        }
    }
}
