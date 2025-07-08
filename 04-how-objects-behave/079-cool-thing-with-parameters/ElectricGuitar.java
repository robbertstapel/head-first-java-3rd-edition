class ElectricGuitar {

    String brand;
    int numOfPickUps;
    boolean rockstarUsesIt;


    // Getters and Setters for "brand"
    public String getBrand(){
        System.out.println(brand);
        return brand;
    }

    public void setBrand(String brand){
        System.out.println("Setting brand to " + brand);
        this.brand = brand;
    }

    // Getters and Setters for "numOfpickUps"
    public int getNumOfPickups() {
        System.out.println(numOfPickUps);
        return numOfPickUps;
    }

    public void setNumOfPickups(int numOfPickups){
        System.out.println("Setting numOfPickups to " + numOfPickups);
        this.numOfPickUps = numOfPickups;
    }

    // Getters and Setters for "rockstarUsesIt"
    public boolean getRockstarUsesIt(){
        System.out.println(rockstarUsesIt);
        return rockstarUsesIt;
    }

    public void setRockstarUsesIt(boolean rockstarUsesIt){
        System.out.println("Setting rockstarUsesIt to " + rockstarUsesIt);
        this.rockstarUsesIt = rockstarUsesIt;
    }

}

class ElectricGuitarTest {
    public static void main(String[] args) {
        ElectricGuitar guitarOne = new ElectricGuitar();
        guitarOne.setBrand("Fender");
        guitarOne.getBrand();

        guitarOne.setRockstarUsesIt(true);
        guitarOne.getRockstarUsesIt();

    }
}
