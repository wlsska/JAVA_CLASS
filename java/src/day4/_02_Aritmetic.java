package day4;

import java.util.Scanner;

public class _02_Aritmetic {

	public static void main(String[] args) {
		/*
		 * 분을 정술 입력받아서 몇시간 몇분 으로 환산하는 프로그램 만들기
		 * 
		 */
		
		Scanner Input = new Scanner(System.in);
		System.out.println("분 입력 : ");
		int inMunute = Input.nextInt();
		Input.close();
		
		
		int hour =  inMunute / 60;
		int minute = inMunute % 60;
		System.out.printf("%d 분은 %d 시간 %d분 입니다",inMunute,hour,minute);
				
	}

}
