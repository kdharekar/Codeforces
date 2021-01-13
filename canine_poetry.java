import java.util.Scanner;

public class canine_poetry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<t;i++) {
			String str = sc.nextLine();
			StringBuilder str1 = new StringBuilder(str);
			int n = str.length();
			int ans = 0;
			for(int j=1;j<n;j++) {
				char c = str1.charAt(j);
				//System.out.println(c);
				//int k = 0;
				//boolean isplain = false;
				//int count = 0;
				if(str1.charAt(j-1)==c) {
					ans++;
					str1.setCharAt(j,'_');
				}
				else if(j-2>=0 && str1.charAt(j-2)==c) {
					ans++;
					str1.setCharAt(j,'_');
				}
				/*
				 * while(k<=j) { if(isplain ==false && str1.charAt(k)==c) { isplain = true;
				 * count++; k++; } else if(isplain) { if(j-count<=k) { str1.setCharAt(j,'_');
				 * ans++; break; } else if(str1.charAt(k)!='_'&& str1.charAt(j-count) != '_' &&
				 * str1.charAt(j-count)==str1.charAt(k)) { k++; count++; } else { count =0;
				 * isplain=false; } } else { k++; } }
				 */
			}
			System.out.println(ans);
		}

	}

}
