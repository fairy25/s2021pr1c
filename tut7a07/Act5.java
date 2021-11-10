package tut7a07;

public class Act5 {
    public static void main(String[] args) {
        String p = "Sd1bd@fsd fsfs";
        // how to know that p contains at least 1 uppercase letter?
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSymbol = false;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == ' ') {
                System.out.println("Password cannot contain space.");
                return;
            }
            if (Character.isUpperCase(p.charAt(i))) {
                hasUppercase = true;
            } else if (Character.isLowerCase(p.charAt(i))) {
                hasLowercase = true;
            } else if (Character.isDigit(p.charAt(i))) {
                hasDigit = true;
            } else {
                hasSymbol = true;
            }
        }
        int score = 0;
        if (p.length() > 12) {
            score += 2;
        } else if (p.length() >= 8) {
            score++;
        }
        if (hasUppercase) score++;
        if (hasLowercase) score++;
        if (hasDigit) score++;
        if (hasSymbol) score++;
        System.out.println(score);
    }
}
