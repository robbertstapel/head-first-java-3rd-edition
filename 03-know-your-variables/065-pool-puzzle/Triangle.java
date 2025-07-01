public class Triangle {
    double area;
    int height;
    int length;

    void setArea() {
        area = (height * length) / 2.0;
    }
}

class TriangleTestDrive {
    public static void main(String[] args) {
        // New triangle array named "ta" with 4 positions (index 0-3)
        Triangle[] ta = new Triangle[4];

        int x = 0;
        while(x < 4){
            // create a new Triangle object and set width and height
            ta[x] = new Triangle();
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;

            // call setArea method so we can output the result
            ta[x].setArea();
            System.out.print("triangle " + x + ", area");
            System.out.println(" = " + ta[x].area);

            // increment x for next round
            x++;
        }

        int y = x; // at this moment x = 4
        x = 27; // // after we have set x, we now change x to 27;2
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", t5 area = " + t5.area);
    }


}