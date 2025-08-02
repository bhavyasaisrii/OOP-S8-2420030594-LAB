package lab2;

import java.util.Scanner;

public class perfect_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
System.out.println("enter a number");
Scanner sc = new Scanner(System.in);
num=sc.nextInt();
int sum=0;
for (int i=1;i<num;i++) {
	if(num%i==0) {
		sum+=i;
		
	}
}
if(sum ==num) {
	System.out.printf("%d is a perfect number%n", num);
	
}else {
	System.out.printf("%d is not a perfect number", num);
}
	}

}
