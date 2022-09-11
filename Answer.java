import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int a[]= new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		//for (int i = 0; i < N; i++)
			//System.out.print(a[i] + " ");

		for (int i = 0; i < N - 1; i += 2) {
			int temp = a[i];
			a[i] = a[i + 1];
			a[i + 1] = temp;

		}

		for (int i = 0; i < N; i++)
			System.out.print(a[i] + " ");

	}
}