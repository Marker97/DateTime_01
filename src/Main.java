import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate dateMouth = LocalDate.now();
        long date1Time = dateMouth.getDayOfMonth();
        long date2Time = dateMouth.lengthOfMonth();
        long finalDate = date2Time - date1Time;
        System.out.println("How many days are left till the end of the mouth? " + finalDate + " days");

        LocalDate dateYear = LocalDate.now();
        long dateTimeYear = dateYear.getDayOfYear();
        long dateTimeYear2 = dateYear.lengthOfYear();
        long dateFinalYear = dateTimeYear2 - dateTimeYear;
        System.out.println("How many days are left till the end of the year? " + dateFinalYear + " days");

        }


    }
