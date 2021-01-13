import java.util.Scanner;

public class Dungeon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int mod = (a+b+c)/9;
			if((a+b+c)%9==0 && (a>=mod)&&(b>=mod)&&(c>=mod)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}

	}

}
