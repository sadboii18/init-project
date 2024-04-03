package javalearning;

import java.util.Scanner;

public class HelloWorld {

//	public static int snt(int n) {
//		for(int i = 2; i <= sqrt(n); i++) {
//			if(n % i == 0) return 0;
//		}
//		return n > 1;
//	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t--) {
			int a = in.nextInt();
			if (a % 2 == 0)
				System.out.println("true");
			else
				System.out.println("false");
		}
	}
}
