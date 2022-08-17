import java.util.ArrayList;
import java.util.Scanner;;
public class Main1 {
    public static void main(String[] args) {
        

        
        Scholar scholar = new Scholar(34, "Nguyen Tuan Anh", 20, "gioi");
        Scholar scholar1 = new Scholar(23, "Nguyen Thanh Tung", 18, "Kha");
        Scholar scholar2 = new Scholar(12, "Tran Duc Hieu", 22, "gioi");
        Scholar scholar3 = new Scholar(24, "Nguyen Kim Cong", 19, "Xuat sac");
        ArrayList<Scholar> scholars= new ArrayList<>();
        scholars.add(scholar);
        scholars.add(scholar1);
        scholars.add(scholar2);
        scholars.add(scholar3);

        

       Class12A class1 = new Class12A("java", scholars);
       ArrayList<Class12A>classrooms = new ArrayList<>();
       classrooms.add(class1);




        Techmaster techmaster = new Techmaster("Miss Huong","MR Dat", classrooms);
        ArrayList<Techmaster> techmasters = new ArrayList<>();
        techmasters.add(techmaster);

        System.out.println(techmaster.toString());

        scholars.get(3).setHocluc("Trung Binh");

        System.out.println("Sau khi cap nhat thong tin cua 1 ban theo id : ");
        System.out.println(techmaster.toString());

        scholars.remove(1);
        System.out.println( "lop sau khi co 1 ban nghi,ban do bi xoa khoi lop : ");
        System.out.println(techmaster.toString());



    }
    
}
