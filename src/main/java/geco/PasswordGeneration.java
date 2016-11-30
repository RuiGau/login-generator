package geco;

import java.util.Random;

public class PasswordGeneration {

    private static final char[] CHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

    public static String getRandomPassword(){
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            char c = CHARS[random.nextInt(CHARS.length)];
            sb.append(c);
        }
        return sb.toString();
    }
}
