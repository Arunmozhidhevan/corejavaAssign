package nonprimesum;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scanner.nextInt();
		
		System.out.println(UserMainCode.addNumber(n));
	}

}
