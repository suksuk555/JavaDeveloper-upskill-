public class TestDateModern {
    public static void main(String[] args) {
        DateModern d1 = new DateModern(2025, 10, 23);

        System.out.println("Original date"+d1);

        //use a chain of method
        DateModern d2 = d1.withDate(2023, 12, 10);
        System.out.println("New Date date"+d2);
        System.out.println("Year is "+d2.getYear());
        System.out.println("Month is "+d2.getMonth());
        System.out.println("Day is "+d2.getDay());

    }
}
