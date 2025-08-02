package lab2;
import java.util.Scanner;
public class check_vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char c;
System.out.println("enter a alphabet.");
Scanner sc=new Scanner(System.in);
c=sc.next().charAt(0);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
System.out.println(c+ " is an vowel");
	}else {
		System.out.println(c+ " is a consonent");
	}

	

	}}
