import java.util.Scanner;

public class Long_Jumps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			long max =0;
			long[] arr = new long[n];
			for(int j=0;j<n;j++) {
				arr[j] = sc.nextInt();
			}
			for(int j =n-1;j>=0;j--) {
				long move = j + arr[j];
				if(move<n) {
					arr[j] = arr[j] + arr[(int) move];
				}
				if(arr[j]>max) {
					max = arr[j];
				}
			}
			System.out.println(max);
		}

	}

}
