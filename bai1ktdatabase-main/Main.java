import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        wallet wallet= new wallet(1,1234,"Nguyen Tuan Anh",1234342335);

       ArrayList <item>items = new ArrayList<>();
        item item1=new item(1,"Ban chai dien",234432124.7,"Danh bay rang");
        item item2=new item(2,"Thuoc ngu",846282346.4,"Vi cafe");



        items.add(item1);
        items.add(item2);


        item item3=null;
        for (item item :items) {
            System.out.println(item.toString());
        }
        System.out.println("Nhap ID san pham");
        String chonSp = scanner.nextLine();
        for (item item :items){
            if(item.getId() == Integer.parseInt(chonSp)){
                item3=item;
                break;
            }else {
                System.out.println("San pham khong ton tai");
                System.exit(0);
            }

        }

        System.out.println("san pham ban da chon");
        System.out.println(item2.toString());
        System.out.println("Nhap thong tin khach hang :");
        System.out.println("Nhap Name");
        String name=scanner.nextLine();
        System.out.println("Nhap dia chi");
        String diachi=scanner.nextLine();
        System.out.println("Nhap SDT");
        int sdt=scanner.nextInt();
        customer customer=new customer(1,name,sdt,diachi);
        System.out.println("Nhap so luong");
        int quantity= scanner.nextInt();
        order order=new order(1, customer.getId(),quantity, LocalDate.now(),item3);

        System.out.println("Thong tin don hang");
        double infor_Order=item3.getPrice()*quantity;
        System.out.println("ten : "+customer.getName() +"\n"+"sdt : " +customer.getPhone()+"\n"+"dia chi : "+customer.getAddress()
                +"\n"+"so luong : "+quantity +"\n"+"Tong Tien:"+infor_Order +"\n"+ "So Du trong wallet la : "+(wallet.amount-infor_Order ));


















    }
}
