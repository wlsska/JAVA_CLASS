package day2;

public class _03_DataType {

	public static void main(String[] args) {
		/*
		 * 정수형
		 * 1.byte / short / int / long 
		 * 
		 * 실수형
		 * float / double 
		 * 
		 * 문자형 
		 * char
		 * 
		 * 논리형 
		 * boolean
		 */
		
		byte num1 = 127;
		short num2 = 300;
		int num3 = 1000;
		long num4 = 50; 
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		double marathon = 42.195; 
		float halfMarthon = 21.0975f;
		
		System.out.println("마라톤은" + marathon + "km를 달린다");
		System.out.println("하프마라톤은" + halfMarthon + "km를 달린다");
		
		
		//문자형
		char ga = '가';
		char na = '나';
		char alphabet1 = 'a';
		char alphabet2 = 'b';
		
		System.out.println(ga);
		System.out.println(na);
		System.out.println(alphabet1 + "," + alphabet2);
		
		
		boolean isStdent = false; 
		System.out.println(isStdent);
		
		if(isStdent) {
			System.out.println("저는 학생입니다.");
		} else {
			System.out.println("저는 학생이 아닙니다.");
			
		}
	}

}
