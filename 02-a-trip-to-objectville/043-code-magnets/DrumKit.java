class DrumKit {
    boolean snare = true;
    boolean topHat = true;

    void playSnare(){
        System.out.println("bang bang ba-bang");
    }
    void playTopHat() {
        System.out.println("ding ding da-ding");
    }
}

class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit(); // instantiate a new DrumKit object
        // divine state and behavior
        d.snare = false;
        d.playSnare();
        d.playTopHat();
        if(d.snare){ // same as d.snare == true
            d.playSnare();
        }
    }
}