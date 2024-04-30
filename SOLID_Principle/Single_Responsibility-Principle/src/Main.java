

public class Main {
    public static void main(String[] args) throws Exception {
        String username = "maria25";
        String password = "senha123";
        
        if ( Register.registerUser(username, password)) {
            System.out.println("User registered successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
        
        if (Login.loginUser(username, password)) {
            System.out.println("User logged in successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}