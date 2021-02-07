import java.util.GregorianCalendar;

public class Lab04_2 {
    public static void main(String[] args){
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("Current year, month, date, and day of week");
        System.out.printf("Year is %d \n", calendar.get(GregorianCalendar.YEAR));
        System.out.printf("Month is %d \n", calendar.get(GregorianCalendar.MONTH));
        System.out.printf("Date is %d \n", calendar.get(GregorianCalendar.DATE));
        System.out.printf("Day of week is %d \n", calendar.get(GregorianCalendar.DAY_OF_WEEK));
        //Millis elapsed of tomorrow since Jan, 1970
        GregorianCalendar newCalendar = new GregorianCalendar();
        long time = System.currentTimeMillis() + 60*60*24*1000;
        newCalendar.setTimeInMillis(time);
        System.out.println("------------");
        System.out.println("After specified the elapsed time of one day after current day");
        System.out.printf("Year is %d \n", newCalendar.get(GregorianCalendar.YEAR));
        System.out.printf("Month is %d \n", newCalendar.get(GregorianCalendar.MONTH));
        System.out.printf("Date is %d \n", newCalendar.get(GregorianCalendar.DATE));
        System.out.println("Day of week is " + newCalendar.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println(newCalendar.getTime());
    }
}
