package lab2;
import java.util.Scanner;

public class sum_of_num {

	public static void main(String[] args) {
	int num;
	System.out.println("enter the number");
	Scanner sc= new Scanner(System.in);
	num = sc.nextInt();
	int sum =0;
	int temp=num;
	while (temp>0) {
		 sum+=temp%10;
		temp=temp/10;
		
	}
	
	// TODO Auto-generated method stub
	System.out.println("sum of digits:"+sum);

	}

}
