public class BookTestRide {
    public static void main(String[] args) {
        Book a = new Book();
        Book b = new Book();
        System.out.println("Title: " + b.title + " Year: " + b.year);
        // when you declare but don't assign, the values will be null or 0;

        // Book a and b are created above this creates 2 objects on the heap
        // It then stores the reference to these objects in variables a and b.
        System.out.println("Two new objects created on the heap");
        System.out.println(a);
        System.out.println(b);

        System.out.println("----------------------------------------");
        // Now we copy the reference value from b and put it into c.
        // Book c variable now holds the same reference to the same object, which is Book b.
        Book c = b;
        System.out.println("Value for c is copied from b");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("You now have 2 object's with 3 references");

        // When an object is unprogrammed, it's eligible for the Garbage collector

        System.out.println("----------------------------------------");

        Book d = new Book();
        Book e = new Book();


    }
}
