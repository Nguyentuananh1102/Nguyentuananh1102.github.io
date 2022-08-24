import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class Main {
    public static void main(String[] args) {
        // user cho sẵn để đăng nhập
        String username = "Tuan Anh";
        String Email = "tuananh@gmail.com";
        String password = "123Anh";
        String guessUser,guessPass, usernameChange;
        int Program, job;
        int dangNhap = 1;
        int dangKi = 2;
        
        Scanner scanner = new Scanner(System.in);

        // Chọn chương trình đăng nhập hoặc đăng kí
        System.out.println("Cac Chuong Trinh lua chon");
        System.out.println("1- Dang Nhap");
        System.out.println("2- Dang Ki");
        System.out.println("Chon Chuong Trinh : ");
        Program = scanner.nextInt();

        
        while(Program == dangNhap){
            //Kiem tra username va password để đăng nhập
            // nhập tên = Tuan Anh và pass = 123Anh để đăng nhập vì user cho sẵn
            System.out.println("Nhap vao username: ");
            scanner.next();
            guessUser = scanner.nextLine();
            System.out.println("Nhap vao Password: ");
            guessPass = scanner.nextLine();
            

            if(username.equals(guessUser) || (password.equals(guessPass))){
                System.out.println("Chao mung " + username + " ban co the thuc hien cac cong viec sau: ");
                
                System.out.println("1- Thay doi username");
                System.out.println("2- Thay doi email");
                System.out.println("3- Thay doi mat khau");
                System.out.println("4- Dang xuat");
                System.out.println("5- Thoat chuong trinh");
                System.out.println("Nhap vao cong viec: ");
                job = scanner.nextInt();

                
                //Thực hiện các công việc
                for(job = 0 ; job < 6 ; job ++){
                    if( job == 1 ){
                        System.out.println("Nhap NameUser moi: ");
                        scanner.next();
                        usernameChange = scanner.nextLine();
    
                    }
                    else if( job == 2){
                        System.out.println("Nhap Email moi: ");
                        String EmailNew = scanner.nextLine();
                    }else if( job == 3){
                        System.out.println("Nhap password moi: ");
                        String passwordNew = scanner.nextLine();
                    }else if( job == 4){
                        System.out.println("Dang xuat");
                        
                    }else if( job == 5){
                        System.out.println("thoat chuong trinh");
                    }
                    
                }
                
                
            }
            // Quên mật khẩu yêu cầu nhập lại email
            else {
                System.out.println("Dang nhap lai");
                System.out.println("Quen mat khau");
                System.out.println(" nhap lai email: ");
                scanner.next();
                String Emailcomeback = scanner.nextLine();
                if( Emailcomeback.equals(Email)){
                    
                    System.out.println("Email dung");
                }
            }
        }


        // chương trình 2 tạo tài khoản mới
        while(Program == dangKi){
            System.out.println("Tao tai khoan moi: ");
            System.out.println("Nhap ten tai khoan: ");
            scanner.next();
            String accountName = scanner.nextLine();

            String EMAIL_PATTERN = 
            "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";

            System.out.println("Nhap vao email: ");
            String accountEmail = scanner.nextLine();
            
            String PASS_PATTERN = "((?=.*d)(?=.*[a-z])(?=.*[A-Z])(?=.*[.,_;-]).{8,50})";

            System.out.println("Nhap mat khau cua ban: ");
            String accountPass = scanner.nextLine();


        }



        
    }
}
