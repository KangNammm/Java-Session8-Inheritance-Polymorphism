package user;

import java.util.Scanner;

public class User {
    private int id;
    private String username;
    private String password;
    public User(){
    }

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public boolean login(String username, String password){
        if (this.username.equals(username) && this.password.equals(password)){
            System.out.println("Đăng nhập thành công");
            return true;
        }else {
            System.out.println("Đăng nhập thất bại");
            return false;
        }
    }
    public void displayData(){
        System.out.println("" +
                "id :" + this.id + "\n" +
                "username : " + this.username + "\n");
    }
}
