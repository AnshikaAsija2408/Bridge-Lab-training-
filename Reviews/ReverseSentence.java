import java.util.*;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}

// public static void ReverseSentence{

// public static void Main(String[] str) {
// String str = sc.nextLine();
// str = str.split(" ");
// for (int i = str.length() - 1; i >= 0; i--) {
// String rev = rev + str.charAt(i);
// System.out.print(rev);
// }
// }