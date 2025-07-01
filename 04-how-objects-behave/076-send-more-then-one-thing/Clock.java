public class Clock {
    String day;
    int hours;

    void returnTime() {
        String formattedHours = String.format("%02d:%02d", hours / 100, hours % 100);
        System.out.println(day + " " + formattedHours);
    }
}

class ClockTestDrive {
    public static void main(String[] args) {
        Clock today = new Clock();
        today.day = "Sunday";
        today.hours = 1200;

        today.returnTime();
    }
}
