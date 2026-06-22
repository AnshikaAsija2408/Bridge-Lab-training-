import java.util.Scanner;

public class Merge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m=sc.nextInt();
    int[] arr1=new int[n];
    int[] arr2=new int[m];
    int sum=n+m;
    int[] arr3=new int[sum];
    for(int i=0;i<n;i++){
        arr1[i]=sc.nextInt();
    }
    for(int i=0;i<m;i++){
        arr2[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        arr3[i]=arr1[i];

    }
    for(int i=0;i<m;i++){
        arr3[n+i]=arr2[i];
    }
    for(int i=0;i<sum;i++){
        System.out.print(arr3[i]+" ");
    }
    }


        
}