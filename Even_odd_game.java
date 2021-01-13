import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Even_odd_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++) {
			long alice = 0;
			long bob = 0;
			int n = sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int j=0;j<n;j++) {
				int a = sc.nextInt();
				arr.add(a);
			}
			/*
			 * for(int j=0;j<n;j++) { System.out.print(arr.get(j)+ " "); }
			 */
			Collections.sort(arr,Collections.reverseOrder());
			for(int j=0;j<n;j++) {
				int val = arr.get(j) ;
				//System.out.print(val+ " ");
				if(j%2==0 && val%2==0) {
					alice = alice + val;
				}
				if(j%2==1 && val%2==1) {
					bob = bob + val;
				}
			}

			/*
			 * for(int val : arr) { System.out.print(val+ " "); if(j%2==0 && val%2==0) {
			 * alice = alice + val; } if(j%2==1 && val%2==1) { System.out.print(val+ " ");
			 * bob = bob + val; } j++; }
			 */
			/*
			 * System.out.println("Alice"+ " " + alice); System.out.println("BOB"+ " " +
			 * bob);
			 */
			  if(alice>bob) { System.out.println("Alice"); } else if(alice<bob) {
			 System.out.println("Bob"); } else { System.out.println("Tie"); }
			 
		}
	}

}
