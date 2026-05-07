import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = n * (n + 1) / 2;
        for (int i = 0; i < n - 1; i++) {
            sum -= arr[i];
        }
        System.out.println(sum);
    }
}
// import java.util.*;

// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt(); // input size
// int[] arr = new int[n];for(
// int i = 0;i<arr.length;i++){
// int s=arr[i]+1;
// if(s!=arr[i+1]){
// return s;