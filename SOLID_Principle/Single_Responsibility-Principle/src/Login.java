public class Login {
    public static boolean loginUser(String username, String password) {
        return ValidateUser.validateUsername(username) && ValidateUser.validatePassword(password);
    }
}
