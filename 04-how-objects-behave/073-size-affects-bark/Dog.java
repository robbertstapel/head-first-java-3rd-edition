public class Dog {
    int size;
    String name;

    void bark(int times){
        if(size < 10){
            for(int i = 0; i < times; i++){
                System.out.println(name + " Small woof");
            }
        } else if ( size < 20) {
            for(int i = 0; i < times; i++){
                System.out.println(name + " Medium w00f");
            }
        } else {
            for(int i = 0; i < times; i++){
                System.out.println(name + " BIG WOOF");
            }
        }
    }

}

class DogTestDrive {
    public static void main(String[] args) {

        // Dog 1 small dog
        Dog dogOne = new Dog();
        dogOne.name = "Bentley";
        dogOne.size = 8;
        dogOne.bark(2);

        // Dog 2 medium dog
        Dog dogTwo = new Dog();
        dogTwo.name = "Tira";
        dogTwo.size = 15;
        dogTwo.bark(1);

        // Dog 3 big dog
        Dog dogThree = new Dog();
        dogThree.name = "Gila";
        dogThree.size = 50;
        dogThree.bark(3);

    }
}