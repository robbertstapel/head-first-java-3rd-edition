// page 119
package exercises;

public class MultiFor {
    public static void main(String[] args) {
        for(int i = 0; i < 4; i++){ // runs 3 times 0,1 and 3 because we do i++ if i == 1
            for(int j = 4; j > 2; j--){ // runs 2x always
                System.out.println(STR. "\{i} \{j}");
            }
            if(i == 1){
                i++;
            }
        }
    }
}
