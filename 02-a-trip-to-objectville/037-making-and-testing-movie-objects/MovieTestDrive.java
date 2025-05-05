class MovieTestDrive {
    public static void main(String[] args) {
        Movie movieOne = new Movie();
        Movie movieTwo = new Movie();
        Movie movieThree = new Movie();

        movieOne.title = "Gone with the Stock";
        movieOne.category = "Tragic";
        movieOne.rating = -2;

        movieTwo.title = "Lost in Cubicle Space";
        movieTwo.category = "Comedy";
        movieTwo.rating = 5;

        movieThree.title = "Byte Club";
        movieThree.category = "Tragic but ultimately uplifting";
        movieThree.rating = 127;

        movieTwo.playMovie();

        System.out.println("Title: " + movieOne.title);
        System.out.println("Category: " + movieOne.category);
        System.out.println("Rating: " + movieOne.rating);

        System.out.println("Title: " + movieTwo.title);
        System.out.println("Category: " + movieTwo.category);
        System.out.println("Rating: " + movieTwo.rating);

        System.out.println("Title: " + movieThree.title);
        System.out.println("Category: " + movieThree.category);
        System.out.println("Rating: " + movieThree.rating);
    }
}