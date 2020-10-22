import java.util.*;
public class Array {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 3,i;
		int a[] = new int[n];
		
		
		for(i = 0; i < a.length; i++) {
			
			a[i] = sc.nextInt();
		}
		for(i=0;i < 3;i++)
		{
			System.out.println(a[i]);
		}
	}

}
