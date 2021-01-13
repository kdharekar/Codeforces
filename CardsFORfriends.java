import java.util.Scanner;

public class CardsFORfriends {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n  = sc.nextInt();
			long ans = 1;
			boolean bool = false;
			while(a%2==0 || b%2==0) {
				if(a%2==0) {
					a = a/2;
					ans= ans * 2;
				}
				else {
					b = b/2;
					ans= ans*2;
				}
				if(ans>=n) {
					bool = true;
				}
			}
			if(bool || n<=1) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}

	}

}
