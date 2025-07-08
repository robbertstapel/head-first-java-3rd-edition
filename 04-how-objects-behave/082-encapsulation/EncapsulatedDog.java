class EncapsulatedDog {
    private int size; // this is private now

    void bark(){
        if(size > 60){
            System.out.println("Wooof! Wooof!");
        }
        else if (size > 14){
            System.out.println("Ruff! Ruff!");
        }
        else {
            System.out.println("Yip! Yip!");
        }
    }

    // Using private instance variable(s) and public getters and setters
    public int getSize(){
        System.out.println("The dog is " + size + " inches tall");
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }
}

class EncapsulatedDogTest {
    public static void main(String[] args) {

        EncapsulatedDog dogOne = new EncapsulatedDog();
        dogOne.setSize(60);

        dogOne.getSize();
        dogOne.bark();

    }
}