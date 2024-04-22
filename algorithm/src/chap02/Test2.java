package chap02;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

	static void rcopy(int[] a, int[] b) {
		
		int arrayLength = a.length <= b.length ? a.length : b.length;
		for(int i = 0; i < arrayLength; i++) {
			
			a[i] = b[b.length - i - 1];
			
		}
		
		int t;
		
		System.out.println("a의 구성 요소는?? " + Arrays.toString(a));
	}
	
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("a의 요솟수는 : ");
		
		int num = stdIn.nextInt();
		
		int[] a = new int[num];
		
		for(int i = 0; i < a.length; i++) {
			
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("b의 요솟수는 : ");
		
		int num2 = stdIn.nextInt();
		
		int[] b = new int[num2];
		
		for(int i = 0; i < b.length; i++) {
			
			System.out.print("b[" + i + "] : ");
			b[i] = stdIn.nextInt();
		}
		
		
		
		rcopy(a , b);
		
		
	}

}
