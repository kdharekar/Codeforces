import java.util.Scanner;

public class Avoid_trygub {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			sc.nextLine();
			String str = sc.nextLine();
			String ans = "";
			String ts = "";
			for(int j=0;j<n;j++) {
				char cc = str.charAt(j);
				if(cc=='t') {
					ts = ts + 't';
				}
				else {
					ans = ans + cc;
				}
			}
			
			ans = ans + ts;
			System.out.println(ans);
		}

	}

}
