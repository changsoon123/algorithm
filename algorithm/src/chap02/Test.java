package chap02;

public class Test {

	public static void main(String[] args) {

//		int[] a = new int[3];
		int[] a = {1, 2, 3};       
		
		int max;
		
		max = a[0];
		
		for(int i = 1; i < a.length; i++)
			if(a[i] > max) max = a[i];
		
		System.out.println(max);
		
	}

}
