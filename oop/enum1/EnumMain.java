package oop.enum1;

public class EnumMain {
    public static void main(String[] args) {
        final long ID = 256332145L;
        System.out.println(ID);
        //   ENUM

        Day current = Day.SUNDAY;
        System.out.println(current);
         //   STRANDART

        WeekDay todaysDate = new WeekDay("Sanday");
        System.out.println(todaysDate);

        WeekDay sunday = WeekDay.SANDAY;
        System.out.println(sunday);

        Day day = Day.SUNDAY;
        switch (day){
            case MONDAY:
                System.out.println("today is Monday");
                break;
            case TUESDAY:
                System.out.println("to day is Tuesday");
                break;
            case WEDNESDAY:

            System.out.println("to day is Wednesday");
            break;
            case FRIDAY:

                System.out.println("to day is FRiday");
                break;
            case SUNDAY:
                System.out.println("to day is Sanday");
                break;
        }
        System.out.println(day);
        for (Day d: Day.values()){
            System.out.println(d);
        }

    }
}
