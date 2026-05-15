import java.util.*;

public class ExtractNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String numbers = "";
for(int i=0;i<str.length();i++){
char ch=str.charAt(i);
if(ch>='0'&&ch<='9'){
numbers=numbers+ch;
}
}
System.out.println(numbers);
}}