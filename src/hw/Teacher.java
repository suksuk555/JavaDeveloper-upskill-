package hw;
public class Teacher extends Person{
    final int MAX_COURSES = 5;
    private int numCourses = 0;
    private String[] courses = new String[MAX_COURSES];

    public Teacher(String name,String address){
        super(name, address);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Teacher: "+super.toString();
    }

    public boolean addCourse(String course){
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                return false; 
            }
        }
        
        if (numCourses >= MAX_COURSES) {
            throw new IllegalStateException("Cannot teach more than " + MAX_COURSES + " courses concurrently.");
        }
        courses[numCourses] = course;
        numCourses++;
        return true;
    }

    public boolean removeCourse(String course) {
        int idx = -1;
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                idx = i;
                break;
            }
        }
        if (idx == -1) return false; // does not exist

        
        for (int i = idx; i < numCourses - 1; i++) {
            courses[i] = courses[i + 1];
        }
        courses[numCourses - 1] = null;
        numCourses--;
        return true;
    }


    


}
