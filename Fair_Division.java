import java.util.Scanner;

public class Fair_Division {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			int a = 0;
			int b = 0;
			int total =0;
			for(int j=0;j<n;j++) {
				if(sc.nextInt()==1) {
					a++;
					total ++;
				}
				else {
					b++;
					total = total + 2;
				}
				
			}
			if(total%2==1 || a%2==1) {
				
				System.out.println("NO");
			}
			else if(b%2==0 ||a>=2){
				
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}

	}

}
