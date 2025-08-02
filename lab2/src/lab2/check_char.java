package lab2;

import java.util.Scanner;

public class check_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char c;
System.out.println("enter a char");
Scanner sc=new Scanner(System.in);
c=sc.next().charAt(0);
if((c>='a' && c<='z')||(c>='A' && c<='Z')) {
	System.out.println(c+ "is  an alphabet.");
	
}
else {
	System.out.println(c+ "is not an alphabet.");
	
}
	}

}
