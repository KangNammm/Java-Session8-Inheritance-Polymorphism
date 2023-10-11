package user;

import java.util.Scanner;

public class MainUser {
    public static void main(String[] args) {
        User student = new Student(1,"username", "123456","Hóa học");
        Scanner scanner = new Scanner(System.in);
        boolean isLogin = false;
        while (!isLogin){
            System.out.println("Thực hiện đăng nhập");
            System.out.println("Nhập username : ");
            String username = scanner.nextLine();
            System.out.println("Nhập password : ");
            String password = scanner.nextLine();
            if (student.login(username,password)){
                student.displayData();
                isLogin = true;
            }
        }
    }
}
