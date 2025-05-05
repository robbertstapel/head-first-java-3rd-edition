public class While {
    public static void main(String[] args) {
        System.out.println("before the loop");
        int x = 1;
        while (x < 101) {
            System.out.print("#");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            x = x + 1;
        }
        System.out.println("after the loop value is now 5 value: " + (x - 1));
    }
}
