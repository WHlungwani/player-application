package hlungwani.wn.date;

/**
 *
 * @author GOD IS GOOD
 */
public class Date {

    private int day;
    private String month;
    private int year;

    public Date() {
    }

    public Date(int day, String month, int year) {
        this.day = 0;
        this.month = " ";
        this.year = 0;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
    }

}
