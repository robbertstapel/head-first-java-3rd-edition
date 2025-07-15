class JustADog {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class JustADogTest {
    public static void main(String[] args) {

        JustADog[] pets = new JustADog[7];
//        pets = new JustADog[7];

        pets[0] = new JustADog();
        pets[0].setName("Bentley");

        System.out.println(pets[0].getName());

    }
}
