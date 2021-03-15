
import java.util.Scanner;
public class Example {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		int b;
		int c;
		double a1;
		System.out.println("Enter a:");
		a=sc.nextInt();
		System.out.println("Enter b:");
		b=sc.nextInt();
		System.out.println("Enter c:");
		c=sc.nextInt();
		a1= b + Math.sqrt(b^2+4*a*c)/2*a-a*3*c+b;
		System.out.println("Res:"+a1);
		
		
		

	}

	
	}


