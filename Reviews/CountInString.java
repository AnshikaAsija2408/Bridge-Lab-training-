import java.util.*;

public class CountInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int alphabets = 0;
        int digits = 0;
        int special = 0;
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                alphabets++;
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else {
                special++;
            }
        }
        System.out.println("Alphabets:" + alphabets);
        System.out.println("Digits:" + digits);
        System.out.println("Special Characters:" + special);            
    }
}
