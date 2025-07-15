public class XClock {
    String time;

    void setTime(String time){
        this.time = time;
    }

    String getTime() {
        return time;
    }

}

class XClockTest {
    public static void main(String[] args) {
        XClock today = new XClock();

        today.setTime("12:45");

        String clock = today.getTime();
        System.out.println("time: " + clock);

    }
}
