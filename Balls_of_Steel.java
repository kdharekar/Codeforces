import java.util.Scanner;

public class Balls_of_Steel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] x = new int[n];
			int[] y = new int[n];
			for(int j=0;j<n;j++) {
				int x1 = sc.nextInt();
				int y1 = sc.nextInt();
				x[j] = x1;
				y[j] = y1;
			}
			int ptr = 0;
			boolean aa = false;
			while(ptr<n) {
				int val = 0;
				for(int e=0;e<n;e++) {
					if(Math.abs(x[ptr]-x[e])+Math.abs(y[ptr]-y[e])>k) {
						break;
					}
					val = e;
				}
				if(val==n-1) {
					aa = true;
					break;
				}
				ptr++;
			}
			if(aa) {
			System.out.println(1);
			}
			else {
				System.out.println(-1);
			}
		}

	}

}
