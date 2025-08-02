public class Date {

    private int year;
    private int month;
    private int day;
    //private int year month day

    //constructir method
    public Date(int year, int month , int date){
        this.year = year;
        this.year = month;
        this.year = day;
    }

    //setter and getter
    public int getYear(){
        return this.year;
        
    }
    public int getMonth(){
        return this.month;
    }
    public int getDay(){
        return this.day;
    }

    public void setYear(int year){
        this.year = year;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setDay(int day){
        this.day = day;
    }

    //tostring

    public String tostring(){
        return String.format("%02d/%02d/%04d", month, day, year);
    }
    public void setDate(int year,int month,int day){
        this.year = year;
        this.month = month;
        this.day = day;

    }
}