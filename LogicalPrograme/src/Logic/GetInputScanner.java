package Logic;

import java.util.Scanner;

public class GetInputScanner {
public static void main(String[] args) {
	int a;
	float f;
	String s;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter here");
	
	a = sc.nextInt();
	System.out.println("Enter here");
	System.out.println(a);
	s=sc.next();
	System.out.println("String here");
	System.out.println(s);
	f=sc.nextFloat();
	System.out.println("float Here");
	System.out.println(f);
}
}
