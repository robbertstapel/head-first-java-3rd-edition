class StreamingSong {
    String title;
    String artist;
    int duration; // in seconds

    void play(){
        System.out.println("Playing " + title + " by " + artist);
    }
}

class StreamingSongTestDrive {
    public static void main(String[] args) {

        StreamingSong song = new StreamingSong(); // it was missing the instantiation of the object
        song.title = "Come together";
        song.artist = "The Beatles";
        song.play();
    }
}