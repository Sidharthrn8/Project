
import java.util.Scanner;



public class Calculator {
public static void main(String[] args) {
	Calculator c=new Calculator();
c.addition();

	
	
}

Calculator(){
	
}
public void  addition(){
	int a,b;
	System.out.println("Enter the first value");
	Scanner s = new Scanner(System.in);
	a=s.nextInt();
	System.out.println("Enter the second value");
	b=s.nextInt();
	System.out.println("Sum : "+(a+b));
}
}
