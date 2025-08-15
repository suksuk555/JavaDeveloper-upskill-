package hw;

public class Student extends Person {
    final int MAX_COURSES = 30;

    
    private int numCourses = 0;
    private String[] courses = new String[MAX_COURSES];
    private int[] grades = new int[MAX_COURSES];

    public Student(String name,String address){

        super(name, address);
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Student: "+super.toString();
    }

    public void addCourseGrade(String course,int grade){
         for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                grades[i] = grade;
                return;
            }
        }
        
        if (numCourses >= MAX_COURSES) {
            throw new IllegalStateException("Cannot add more than " + MAX_COURSES + " courses.");
        }
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }

    public void printGrade(){
        if (courses.length == 0) {
            throw new IllegalArgumentException("No Course enroll");
        }
        System.out.print(getName() + "'s grades: ");
        for (int i = 0; i < numCourses; i++) {
            System.out.print(courses[i] + ":" + grades[i]);
            if (i < numCourses - 1) System.out.print(", ");
        }
        System.out.println();
    }
    public double getAverageGrade() {
        if (numCourses == 0) return 0.0;
        int sum = 0;
        for (int i = 0; i < numCourses; i++) {
            sum += grades[i];
        }
        return sum / (double) numCourses;
    }

    



}
