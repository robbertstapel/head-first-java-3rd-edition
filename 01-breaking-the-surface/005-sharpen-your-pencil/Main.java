import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        int size = 27; // declare an integer variable named size and assign it the value 27
        String name = "Fido"; // declare a string variable named name and assign it the value "Fido"
        Dog myDog = new Dog(name, size); // declare a Dog object variable named myDog and assign a new Dog object with the name and size variables as arguments
        x = size - 5; // declare a (unknown type) variable named x and assign it the value of size - 5 (27 - 5)
        if (x < 15) // if statement with the condition x < 15
            myDog.bark(8); // call the bark method on the myDog object with the argument 8

        while (x > 3) { // while loop with the condition x > 3
            myDog.play(); // call the play method on the myDog object
        }

        int[] numList = { 2, 4, 6, 8 }; // declare an integer array variable named numList and assign it the values 2, 4, 6, 8
        System.out.print("Hello"); // print the string "Hello"
        System.out.print("Dog " + name); // print the string "Dog " concatenated with the name variable
        String num = "8"; // declare a string variable named num and assign it the value "8"
        int z = Integer.parseInt(num); // declare an integer variable named z and assign it the parsed integer value of the num variable

        try{ // try block
            readTheFile("myFile.txt"); // call the readTheFile method with the argument "myFile.txt"
        } catch(FileNotFoundException e){ // catch block for FileNotFoundException
            System.out.println("File not found."); // print the string "File not found."
        }
    }
}
