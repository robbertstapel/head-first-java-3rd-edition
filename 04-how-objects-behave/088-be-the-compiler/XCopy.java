public class XCopy {

    int go(int arg){
        arg = arg * 2;
        return arg;
    }

    public static void main(String[] args) {
        XCopy x = new XCopy();

        int orig = 42;
        int y = x.go(orig);

        System.out.println(orig + " " + y);
    }
}
