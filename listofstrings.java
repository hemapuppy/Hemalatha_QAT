import java.util.ArrayList;
import java.util.Scanner;

public class listofstrings {
	

		public static void main(String[] args) {
			ArrayList<String> arr = new ArrayList<>();
			Scanner sc = new Scanner(System.in); 
			System.out.print("Enter the size of string array : ");
			int n = sc.nextInt();
			for(int i=0;i<n;i++) {
				arr.add(sc.next());
			}
			System.out.println("string reverse : ");
			for(int j=arr.size()-1;j>=0;j--) {
				System.out.println(arr.get(j));
			}

		}

	

}
