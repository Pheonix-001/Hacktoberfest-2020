import java.util.*;
public class Switch 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :-");
		int a = sc.nextInt();
		System.out.println("Enter the second number :-");
		int b = sc.nextInt();
		System.out.println("Enter 1 for addition");
		System.out.println("Enter 2 for substraction :-");
		System.out.println("Enter 3 for multiplication :-");
		System.out.println("Enter 4 for division :-");
		int choice = sc.nextInt();
		switch (choice)
			{
			case 1:
				System.out.println("The result is "+ a+b);
				break;
			case 2:
				int c = a - b;
				System.out.println("The result is "+c);
				break;
			case 2+1:
				System.out.println("The result is "+ a*b);
				break;
			case 4:
				System.out.println("The result is "+ a/b);
				break;
			default:
				System.out.println("You entered the invalid number");
				break;
			}
	}
}
