import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

class Authentication {
    Scanner sc = new Scanner(System.in);

    String storageFilePath = "D:\\programming-skills-bootcamp\\Week1\\Day4\\Project\\userData.txt";

    HashMap<String, String> userMap = new HashMap<>();

    public void register() {
        System.out.println("Enter Your Email address :-- ");
        String email = sc.nextLine();

        if (email.contains("@") && email.contains(".")) {
            if (!isUserExists(email)) {
                System.out.println("Enter Your Password :--");
                String password = sc.nextLine();

                write(email, password);
                System.out.println("User Has Been Registered Successfully!");
            } else {
                System.out.println("User Already Registered!");
            }
        } else {
            System.out.println("Invalid Email, Try Again!");
        }
    }

    public void login() {
        System.out.println("Enter Your Email Address :-- ");
        String email = sc.nextLine();

        System.out.println("Enter Your Password :-- ");
        String password = sc.nextLine();

        if (email.contains("@") && email.contains(".")) {
            if (isUserExists(email)) {
                if (userMap.get(email).equals(password)) {
                    System.out.println("Login Successfully!");
                } else {
                    System.out.println("Wrong Credentials login unsuccesfull!!");
                }
            } else {
                System.out.println("Wrong Credentials!");
            }
        } else {
            System.out.println("Invalid Email, Try Again!");
        }
    }

    public String listUsers() {
        return userMap.toString();
    }

    public boolean isUserExists(String email) {
        return userMap.containsKey(email);
    }

    public void write(String email, String password) {
        try {
            FileOutputStream writeFileStream = new FileOutputStream(storageFilePath, true);
            String data = email + "," + password + "\n";
            char ch[] = data.toCharArray();
            for (char c : ch) {
                writeFileStream.write(c);
            }
            writeFileStream.close();
        } catch (Exception e) {
            System.out.println("File Write Error :" + e.toString());
        }
    }

    public void read() {
        userMap.clear();
        try {
            FileInputStream readFileStream = new FileInputStream(storageFilePath);
            BufferedReader reader = new BufferedReader(new InputStreamReader(readFileStream));
            String line;
            while ((line = reader.readLine()) != null) {
                String userData[] = line.split(",");
                userMap.put(userData[0], userData[1]);
            }
        } catch (Exception e) {
            System.out.println("File Read Error :" + e.toString());
        }
    }
}

public class UserAuthenticationSystem {
    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        Authentication auth = new Authentication();

        do {
            System.out.println("Enter Your Choice :-- \n1. Register\n2. Login\n3. View Records\n4. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    auth.register();
                    break;
                case 2:
                    auth.login();
                    break;
                case 3:
                    System.out.println(auth.listUsers());
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 4);
    }
}
