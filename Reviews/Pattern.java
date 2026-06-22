import java.util.*;

public class Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int space = 1; space <= n - i; space++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
// import java.util.*;

// public static void Pyramid{

// public static void Main(String[] args){
// Scanner sc = new Scanner(System.in);
// int n=sc.nextInt();

// for(int i=1;i<n;i++){
// for(int space=1;space<=row-i;space++){
// System.out.print(" ");
// for(int j=1 ; j<(2*i)-1 ; j++){
// System.out.print("*");
// }
// System.out.println();
// }
// }