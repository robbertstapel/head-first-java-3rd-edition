public class PoorDog {
    private int size;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}

// I think it will return null and 0;
class PoorDogTest{
    public static void main(String[] args) {
        PoorDog one = new PoorDog();
        System.out.println("size = " + one.getSize());
        System.out.println("name = " + one.getName());
    }
}