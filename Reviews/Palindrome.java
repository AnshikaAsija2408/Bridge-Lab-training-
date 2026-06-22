import java.util.Scanner;

class Palindrome {
    public static void main(

            String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // take input from user
        int reversed = 0;
        int original = n;
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }
        if (reversed == original) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

    }
}
// import java.util.*;

// public static void Palindrome{

// public static void Main(String[] args){
// Scanner sc = new Scanner(System.in);

// int n=sc.nextInt(); //input
// int reversed=0;
// if((n>0)&&(n<100)){
// while(n>0){
// n=n%10;
// reversed=reversed*10 + n;
// n=n/10;
// } }

// if(reversed==n){
// System.out.println("Palindrome"):
// }
// else{"not a palindrome"};
// }
// }