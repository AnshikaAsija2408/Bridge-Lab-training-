import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        boolean unique = true;

       for (int i=0;i<str.length( );i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println("unique characters contained");
                
            }
            else {
                System.out.println("not unique characters contained");
                
            }
        }
     
   }
}