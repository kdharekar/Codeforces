import java.util.Scanner;

public class RedAndBlue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			int max1 = 0;
			int curr = 0;
			for(int j=0;j<n;j++) {
				curr= curr + sc.nextInt();
				if(curr>max1) {
					max1 = curr;
				}
			}
			int max2 = 0;
			curr =0;
			int m = sc.nextInt();
			for(int j=0;j<m;j++) {
				curr = curr + sc.nextInt();
				if(curr>max2) {
					max2 = curr;
				}
			}
			System.out.println(max1+max2);
		}

	}

}
