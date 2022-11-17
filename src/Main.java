import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate dateMouth = LocalDate.now();
        LocalDate dateMouth2 = LocalDate.of(2022, 11, 30);
        long date1Time = dateMouth.getDayOfMonth();
        long date2Time = dateMouth2.getDayOfMonth();
        long finalDate = date2Time - date1Time;
        System.out.println("How many days are left till the end of the mouth? " + finalDate + " days");

        LocalDate dateYear = LocalDate.now();
        LocalDate dateYear2 = LocalDate.of(2022, 12, 31);
        long dateTimeYear = dateYear.getDayOfYear();
        long dateTimeYear2 = dateYear2.getDayOfYear();
        long dateFinalYear = dateTimeYear2 - dateTimeYear;
        System.out.println("How many days are left till the end of the year? " + dateFinalYear + " days");

        }


    }
