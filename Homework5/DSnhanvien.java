import java.util.Scanner;

import mypack.*;




public class DSnhanvien {

    static void mangGiamDan(Employee[] employeeList){
    Employee trungGian;
    for( int i= 0; i < employeeList.length -1; i++){
        for(int j= i + 1; j < employeeList.length; j++){
            if(employeeList[i].Luong < employeeList[j].Luong){
                trungGian = employeeList[i];
                employeeList[i] = employeeList[j];
                employeeList[j] = trungGian;
            }
        }
    }
}



    public static void main(String[]arg ) {
        Employee[] employeesList = new Employee[5];
        employeesList[0] = new Employee("nv01", "Nguyen Tuan Anh", "24/11/2002", 3500.0, GENDER.MALE);
        employeesList[1] = new Employee("nv02", "Nguyen Thanh Tung", "13/11/2000", 4000.0, GENDER.MALE);
    employeesList[2] = new Employee("nv03", "Nguyen Quoc Viet", "12/08/1999", 5500.0, GENDER.FEMALE);
        employeesList[3] = new Employee("nv04", "Nguyen Van Phuong", "08/09/2002", 6000.0, GENDER.FEMALE);
        employeesList[4] = new Employee("nv05", "Doan Trung Kien", "10/04/2009", 2000.0, GENDER.MALE);

    //Tìm nhân viên theo id
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap id: ");
        String id = scanner.nextLine();

        for (Employee employee : employeesList) {
            if (employee.checkId(id)) {
                  System.out.println(" id: "+ id + " la cua nhan vien : ");
                  employee.inforEmployee();
            }
        }

      //Tìm nhân viên theo tên

        System.out.print("Nhap ten nhan vien: ");
        String name = scanner.nextLine();

        for (Employee employee : employeesList) {
            if (employee.haskeyword(name)) {
                System.out.println("Tim thay nhan vien: " );
                employee.inforEmployee();

            }
        }

        //Đếm số nhân viên nam, nữ

        int MALE = 0;
        int FEMALE = 0;

        for (Employee employee : employeesList) {
            if (employee.checkGender(GENDER.MALE)) {
                MALE ++;
            } else {
                FEMALE++;
            }
        }

        System.out.println("Tong so nam: " + MALE + ", Tong so nu: " + FEMALE);


        //Liệt kê các nhân viên trên 30 tuổi

        System.out.println("nhan vien tren 30t");
        for(Employee employee: employeesList){
            if (employee.over30yearsold()){
                employee.inforEmployee();
            }
        }

        //Nhập từ bàn phím tháng bất kỳ trong năm; kiểm tra xem trong tháng đó có những nhân viên nào có ngày sinh nhật

        System.out.print("nhap thang can kiem tra nhan vien co sinh nhat:");
        int month= scanner.nextInt();
        for(Employee employee: employeesList){

            if (employee.checkBirth(month)){
                employee.inforEmployee();//in thong tin nhan vien ID, ten, ngay sinh, gioi tinh, luong
            }
        }


        // In ra top 3 người có lương tháng cao nhất

        mangGiamDan(employeesList);//sap xep mang giam dan the luong thang
        System.out.println("top 3 nguoi luong cao la:");
        employeesList[0].inforEmployee();
        employeesList[1].inforEmployee();
        employeesList[2].inforEmployee();
        scanner.close();



    }
}