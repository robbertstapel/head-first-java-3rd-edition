public class Episode {
    int seasonNumber;
    int episodeNumber;

    void skipIntro(){
        System.out.println("Skipping intro of episode " + episodeNumber + " of series " + seasonNumber);
    }
}

class EpisodeTestDrive {
    public static void main(String[] args) {
        Episode episode = new Episode();
        episode.seasonNumber = 1;
        episode.episodeNumber = 4;
        episode.skipIntro();
        // episode.play() will not work as there is no method called play()
    }
}
