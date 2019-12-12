import java.util.Scanner;
public class LabExer1B
{
	public static void main (String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter an Integer:");
		int c = sc.nextInt();
		showNumberPlus10(c);
		showNumberPlus100(c);
		showNumberPlus1000(c);	
	}
	public static void showNumberPlus10(int c){
		int a = 10 + c;
	    System.out.println(c+ " plus 10 is " +a);
	}
	public static void showNumberPlus100(int c){
		int a = 100 + c;
	    System.out.println(c+ " plus 100 is " +a);
	}
	public static void showNumberPlus1000(int c){
		int a = 1000 + c;
	    System.out.println(c+ " plus 1000 is " +a);
	}
		
}