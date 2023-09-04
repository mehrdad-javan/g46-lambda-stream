package se.lexicon.utilExamples;

import java.security.SecureRandom;

public class PasswordGenerator {

    public static String generate() {
        String validChars = "abcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{}|;:,.<>?";
        int passwordLength = 8;
        StringBuilder stringBuilder = new StringBuilder();
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < passwordLength; i++) {
            int randomIndex = random.nextInt(validChars.length());
            stringBuilder.append(validChars.charAt(randomIndex));
        }

        return stringBuilder.toString();
    }
}
