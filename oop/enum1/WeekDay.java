package oop.enum1;

public class WeekDay {
    private String today;

    public WeekDay(String today) {
        this.today = today;
    }public  static WeekDay SANDAY = new WeekDay("Sanday");

    @Override
    public String toString() {
        return "WeekDay{" +
                "today='" + today + '\'' +
                '}';
    }
}
