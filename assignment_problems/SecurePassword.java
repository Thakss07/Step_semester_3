public class SecurePassword {
    private final String password;

    public SecurePassword(String password) {
        this.password = password;
    }

    public String getStrength() {
        if (password.length() < 6) {
            return "Weak";
        } else if (password.length() <= 9) {
            return "Medium";
        } else {
            return "Strong";
        }
    }

    public static void main(String[] args) {
        SecurePassword p1 = new SecurePassword("abcd");
        SecurePassword p2 = new SecurePassword("abcdefghij");

        System.out.println(p1.getStrength());
        System.out.println(p2.getStrength());
    }
}