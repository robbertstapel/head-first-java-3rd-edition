public class Dog {
    String name;

    public void bark(){
        System.out.println(name + " Goes: Woof!");
    }

    public void eat(){
        System.out.println( name + " Goes: nom nom nom");
    }

    public void chaseCat(){
        System.out.println("Ting Tong Ting Tong");
    }

    public static void main(String[] args) {
        // Dog object
        Doggo dog1 = new Doggo();
        dog1.name = "Tira";
        System.out.println(dog1.name);

        // Dog Array
        Doggo[] dogs = new Doggo[4];
        dogs[0] = new Doggo();
        dogs[1] = new Doggo();
        dogs[2] = dogs[1];
        dogs[3] = new Doggo();

        dogs[0].name = "Tira";
        dogs[1].name = "Bentley";
        dogs[2].name = "Cindy";

        // Loop trough Array
        int x = 0;
        while(x < dogs.length){
            // This will run even if not all 4 dogs are created
            if(dogs[x] != null){
                System.out.println("Dog " + x + " is named " + dogs[x].name);
            }
            x++;
        }

        // This will fail if not all 4 dogs are created
        // dogs[y].bark() is not an option, you basically say null.bark()
        // and bark() is not a method of null
        int y = 0;
        while(y < dogs.length){
            dogs[y].bark();
            y++;
        }

        for(int i = 0; i < dogs.length; i++){
            // we don't need the "if != null" check for the name
            // we can access and print as long as the object itself is not null
            // So all 4 dogs should be created first.
            System.out.println("Dog " + i + " is named " + dogs[i].name);
        }

    }
}
