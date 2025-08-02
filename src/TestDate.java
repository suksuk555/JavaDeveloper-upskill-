public class TestDate {
    public static void main(String[] args) {
        Date d1  = new Date(2025, 8, 1);

        d1.setYear(2024);
        d1.setMonth(8);
        d1.setDay(22);
        System.out.println(d1);

        System.out.println("year is "+d1.getYear());
        System.out.println("year is "+d1.getMonth());

        d1.setDate(2023, 1, 25);
        System.out.println(d1);



    }
}
