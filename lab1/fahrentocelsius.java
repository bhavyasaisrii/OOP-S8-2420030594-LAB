package lab2;

import java.util.Scanner;

public class fahrentocelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float celsius;
System.out.println("enter celsius temperatue");
Scanner sc = new Scanner(System.in);
celsius=sc.nextFloat();
float fahrenheit=(float)(celsius *1.8)+32;
System.out.println("fahrenheit="+fahrenheit);
	}

}
