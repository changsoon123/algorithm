package chap01;

import java.util.Scanner;

public class test {

	static void spira(int a){
			
		for(int i = 1; i <= a; i++) {
			
			
			for(int j = 1; j <= a - i; j++)				
				System.out.printf(" ");
			
		System.out.println("*".repeat((i-1) * 2 + 1));
				
			}
	}
	
	static void npira(int a){
		
		for(int i = 1; i <= a; i++) {
			
			
			for(int j = 1; j <= a - i; j++)				
				System.out.printf(" ");
			
			for(int w = 1; w <= (i-1) * 2 + 1; w++) {
				System.out.print(i % 10);
			}
			
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		System.out.println("n단의 피라미드를 출력하는 메서드를 작성하세요.");
		
		int a;
		
		do {
		System.out.printf("n단: ");
		a = stdIn.nextInt();
		} while(a <= 0);
		
		spira(a);
		System.out.println("---------------------------");
		npira(a);
		
	}

}
