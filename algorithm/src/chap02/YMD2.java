package chap02;

import java.util.Scanner;


public class YMD2 {

		int y;
		int m;
		int d;
	
		YMD2(int y, int m, int d){
			this.y = y;
			this.m = m;
			this.d = d;
		}
		
		YMD2 after(int n) {
			
			
			return null;
		}
		
		YMD2 before(int n) {
			return null;
		}
		
	
	
	public static void main(String[] args) {

		Scanner std = new Scanner(System.in);
		
		System.out.println("날짜를 입력하세요.");
		System.out.println("년 : ");
		int year = std.nextInt();
		System.out.println("월 : ");
		int month = std.nextInt();
		System.out.println("일 : ");
		int day = std.nextInt();
		
		YMD2 plmi = new YMD2(year, month, day);
		
		System.out.println("며칠 전/후의 날짜를 구할까요? : ");
		int afbe = std.nextInt();
		
		plmi.after(afbe);
		plmi.before(afbe);
		
		System.out.println("5일 후의 날짜는 " );
		System.out.println("5일 전의 날짜는 ");
		
		
	}

}
