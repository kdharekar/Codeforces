import java.util.Scanner;

public class Last_minute_enhancement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			int prev = 0;
			int count = 0;
			for(int j=0;j<n;j++) {
				int val  = sc.nextInt();
				if(val==prev) {
					val++;
					count++;
					prev = val;
				}
				else if(val<prev){
					
				}
				else {
					prev = val ;
					count++;
				}
				
			}
			System.out.println(count);
		}

	}

}
