// page 121
package exercises;

public class MixedMessage {
    public static void main(String[] args) {
        int x = 0;
        int y = 30;
        for (int outer = 0; outer < 3; outer++) { // runs 3 times ALWAYS
            for (int inner = 4; inner > 1; inner--) { // runs (3 times) x (3 times) DEPENDING on break
                // code inside therefore runs minimal 3 times and max 9 times AND breaks when x = 6

                // 6, 12, 18, 24, 30, 36, 42, 48, 54
                // x = x + 3;

                // 5, 10, 15, 20, 25, 30, 35, 40, 45
                // x = x + 2;

                // 6, 15, 24, 33, 42, 51, 60 -> runs 7 times because breaks first time
                // so we have 1 cycle then break, 3 cycles, 3 cycles
                // x = x + 6;

                // 4, 8, 12, 16, 20, 24, 28, 32, 36
                // x++;

                // 2, 4, 6, 8, 10, 12, 14, 16, 18
                // x--;

                // default -> 3, 6, breaks forever
                // x = x + 0;

                y = y - 2; // runs 9 times depending on break

                // this breaks on six so for example: [0, 3, break, 9, 12, 15, 18, 21, 24]
                if(x == 6){
                    break;
                }

                x = x + 3; // applied if no break above

            } // end for inner
            y = y - 2;
        } // end for outer
        System.out.println(STR. "\{x} \{y}");
    }
}

