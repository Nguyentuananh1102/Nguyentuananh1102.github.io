import java.util.ArrayList;

public class Techmaster {
    private String manager;
    private String lecturers;
    private ArrayList<Class12A>classrooms;

    
    public void setManager(String manager) {
        this.manager = manager;
    }
    public void setLecturers(String lecturers) {
        this.lecturers = lecturers;
    }
    public void setClassrooms(ArrayList<Class12A> classrooms) {
        this.classrooms = classrooms;
    }

    
    public Techmaster(String manager, String lecturers, ArrayList<Class12A> classrooms) {
        this.manager = manager;
        this.lecturers = lecturers;
        this.classrooms = classrooms;
    }
    @Override
    public String toString() {
        return "Techmaster [classrooms=" + classrooms + ", lecturers=" + lecturers + ", manager=" + manager + "]";
    }
    
}
