package Task;

/*
In this file you can find violation of Single Responsibility Principle. 
You should refactor this file. 
You can remove this file completely, because it will not be used during the evaluation of the solution.
*/

public class UserDataManager {
    private String username;
    private String password;

    public UserDataManager(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void registerUser() {
        // Validate username and password
        if (validateUsername(username) && validatePassword(password)) {
            // Register user in the database
            System.out.println("User registered successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    public void loginUser() {
        // Validate username and password
        if (validateUsername(username) && validatePassword(password)) {
            // Authenticate user
            System.out.println("User logged in successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    private boolean validateUsername(String username) {
        // Validate username (e.g., length, characters allowed)
        return username.length() >= 5 && username.matches("[a-zA-Z_0-9]+");
    }

    private boolean validatePassword(String password) {
        // Validate password (e.g., length, complexity)
        return password.length() >= 8 && password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$");
    }

    public static void main(String[] args) {
        UserDataManager userManager = new UserDataManager("john_doe", "Password123");
        userManager.registerUser();
        userManager.loginUser();
    }
}
