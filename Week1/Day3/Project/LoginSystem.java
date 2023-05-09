package Week1.Day3.Project;

import java.util.Scanner;

class LoginSystem {
    
    private String email;
    private String password;
    Scanner sc = new Scanner(System.in);

    public void setCredentials(){
        email="xyz@email.com";
        password="password";
    }

    public void signin() {
        System.out.print("Enter Your Email: ");
        String userEmail = sc.nextLine();
        System.out.print("Enter Your Password: ");
        String userPassword = sc.nextLine();

        if (email.equals(userEmail) && password.equals(userPassword)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Wrong Credentials");
        }
    }
   
}
public class Login{
    public static void main(String[] args) {
        LoginSystem login = new LoginSystem();
        login.setCredentials();
        login.signin();
    }
}
/*
 *      == checks if both objects are same or not
 *      .equals() checks if both string objects are having same value or not
 *      String s1="hello";
 *      String s2="hi";
 *      String s3=s1;
 *      String s4="hello";
 *        
 *      s1==s4->false
 *      s1==s4->true
 *      s1.equals(s2);->false
 *      s1.equals(s4);->true
 */
