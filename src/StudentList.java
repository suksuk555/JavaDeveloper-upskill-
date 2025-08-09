import java.util.ArrayList;

public class StudentList {

    private String name;
    private String address;
    private ArrayList<String> courses; // วิชา
    private ArrayList<Integer> grades; // คะแนน


    public StudentList(String name, String address) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be null or blank.");
        }
        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException("Address must not be null or blank.");
        }

        this.name = name;
        this.address = address;
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException("Address must not be null or blank.");
        }
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%s(%s)", name, address);
    }

    /*
    add
     */
    public void addCourseGrade(String course, int grade) {
        if (course == null || course.isBlank()) {
            System.out.println("Error:Course name cannto be blank.");
            return;
        }
        if (grade < 0 || grade > 100) {
            System.out.println("Error:Grade must be between 0 and 100.");
            return;
        }
        if (courses.size() >= 30) {
            System.out.println("Cannot add more than 30 courses.");
            return;
        }

        this.courses.add(course);
        this.grades.add(grade);
    }

    // Prints all the couses and grades in a formatted string.
    public void printGrades() {
        System.out.print(this.name + " ");
        for (int i = 0; i < courses.size(); i++) {
            System.out.print(courses.get(i) + ":" + grades.get(i));
            if (i < courses.size() - 1)
                System.out.print(", ");
        }
        System.out.println();
    }

    /*
     * Calculates the average grade for all courses.
     * @return The average grade, or 0.0 if no courses are added.
     */
    public double getAverageGrade(){
        if(courses.isEmpty()) return 0.0;
        int sum=0;
        //using foreach
        for(int _grade:grades){
            sum += _grade;
        }
        
        return (double)sum/courses.size();
    }
}