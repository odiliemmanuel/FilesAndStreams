public class PasswordValidator {

    public static boolean isValidPassword(String password) {

        String regex = "[A-z0-9.!@$%^#]{8,26}";

        return !password.matches(regex);
    }
}
