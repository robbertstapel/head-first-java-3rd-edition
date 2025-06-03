public class BookPartTwo {
    String title;
    String author;
}

class BookPartTwoTestDrive {
    public static void main(String[] args) {
        BookPartTwo[] myBooks = new BookPartTwo[3];

        // We need to create the objects first.
        // Else we cannot set the values.
        for(int i = 0; i < myBooks.length; i++){
            myBooks[i] = new BookPartTwo();
        }

        int x = 0;
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";

        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        while(x < 3){
            System.out.println(myBooks[x].title);
            System.out.println(myBooks[x].author);
            x++;
        }

    }
}


