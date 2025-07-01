public class Islands {

}

class IslandsTestDrive { // In the book this is called TestArrays
    public static void main(String[] args) {
        // First we create a String array with 4 positions index 0-3
        String[] islands = new String[4];

        // We assign string values to the array
        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";

        // We create a int array with 4 positions index 0-3
        int[] index = new int[4];

        // We reassemble the indexes so we get the correct output.
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        // Set initial value for while loop.
        int y = 0;
        while (y < 4) {
            // create int variable called ref.
            int ref;
            // assign index[y], position the loop is in, to ref.
            ref = index[y];
            System.out.print("island = ");
            System.out.println(islands[ref]);
            y++;
        }

    }
}
