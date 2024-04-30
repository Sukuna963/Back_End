public class Register {
    public static boolean registerUser(String username, String password) {
        return ValidateUser.validateUsername(username) && ValidateUser.validatePassword(password);
    }
}