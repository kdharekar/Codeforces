import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bovine_dillemma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int j=0;j<n;j++) {
				arr[j] = sc.nextInt();
			}
			Set<Integer> set = new HashSet<>();
			for(int j=0;j<n-1;j++) {
				for(int k = j+1;k<n;k++) {
					if(set.contains(arr[k]- arr[j])==false) {
						set.add(arr[k]- arr[j]);
					}
				}
			}
			System.out.println(set.size());
		}

	}

}
