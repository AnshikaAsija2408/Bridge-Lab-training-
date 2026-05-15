import java.util.Scanner;

public class CheckRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if (str1.length() == str2.length() && (str1 + str1).contains(str2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
// Mistakenly first checked if the string is reversed or not