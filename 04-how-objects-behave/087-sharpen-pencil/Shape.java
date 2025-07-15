class Shape {
    // static so we can call it without creating an object
    static int calcArea(int width, int height){
        System.out.println("The area is " + width * height + "m2");
        return width * height;
    }

    public static void main(String[] args) {
        int a = calcArea(7, 12);
        short c = 7;
        calcArea(c, 15);

        // This won't work because we need 2 arguments from the caller
//        int d = calcArea(57)

        calcArea(2, 3);

        // This won't work because we expect the method params to be
        // int and int... not long and int
//        long t = 42;
//        int f = calcArea(t, 17);

        // This won't work because we need 2 arguments from the caller
        // You could think that default values will be 0 and 0
        // But remember! This is "inside" the method (or inside the argument list)
        // So we are dealing with local vars not instance vars.
//        int g = calcArea();

//        calcArea();

        // This won't work because calcArea return an int
        // We can't store int in byte.
//        byte h = calcArea(4, 20);

        // This won't work because we have 3 arguments from the caller
        // We need exactly 2 integers, nothing more, nothing less.
//        int j = calcArea(2,3, 5);

    }
}