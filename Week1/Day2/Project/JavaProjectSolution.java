package Week1.Day2.Project;

class JavaProjectSolution {
    public static void main(String[] args) {
        String email = "demo@email.com";
        String password = "123";
        String userEmail = "demo1@email.com";
        String userPassword = "234";
        if (userEmail.equals(email) && userPassword.equals(password)) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Wrong credentials.");
        }
        
    }
}
