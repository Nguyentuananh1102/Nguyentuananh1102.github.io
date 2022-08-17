import java.util.ArrayList;

public class Class12A {
    private String monhoc;
    private ArrayList<Scholar> scholars;

    
    public void setMonhoc(String monhoc) {
        this.monhoc = monhoc;
    }
    public void setScholars(ArrayList<Scholar> scholars) {
        this.scholars = scholars;
    }
    public Class12A(String monhoc, ArrayList<Scholar> scholars) {
        this.monhoc = monhoc;
        this.scholars = scholars;
    }

    @Override
    public String toString() {
        return "Class12A [monhoc=" + monhoc + ", scholars=" + scholars + "]";
    }

    
    
}
