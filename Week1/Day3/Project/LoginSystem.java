package Week1.Day3.Project;

import java.util.Scanner;

class Login {
    
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
public class LoginSystem{
    public static void main(String[] args) {
        Login login = new Login();
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

import java.util.Scanner;

public class LoginSystem {

    private String email;
    private String password;

    public void setCredentials(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void login(String userEmail, String userPassword) {
        if (userEmail.equals(email) && userPassword.equals(password)) {
            System.out.println("Login Successful.");
        } else {
            System.out.println("Wrong Credentials.");
        }
    }

import java.util.Scanner;

public class LoginSystem {

    private String email;
    private String password;

    public void setCredentials(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void login(String userEmail, String userPassword) {
        if (userEmail.equals(email) && userPassword.equals(password)) {
            System.out.println("Login Successful.");
        } else {
            System.out.println("Wrong Credentials.");
        }
    }

    public static void main(String[] args) {
        LoginSystem loginSystem = new LoginSystem();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter pre-defined email:");
        String email = scanner.nextLine();

        System.out.println("Enter pre-defined password:");
        String password = scanner.nextLine();

        loginSystem.setCredentials(email, password);

        System.out.println("Enter user email:");
        String userEmail = scanner.nextLine();

        System.out.println("Enter user password:");
        String userPassword = scanner.nextLine();

        loginSystem.login(userEmail, userPassword);
    }
}
   