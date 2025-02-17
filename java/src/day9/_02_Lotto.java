package day9;

import java.util.Scanner;

public class _02_Lotto {

	public static void main(String[] args) {
		/*
		 * 2차원 배열 선언과 동시에 값을 채워줄거임
		 * 5행 6열에 원하는 숫자조합을 1 ~ 45까지 넣기 ! 
		 */
		 int [][] lotto = {
				 {1,2,3,4,5,6},
				 {7,8,9,10,11,12},
				 {13,14,15,16,17,18},
				 {19,20,21,22,23,24},
				 {25,26,27,28,29,30}
		 };
		 
		 Scanner scan = new Scanner(System.in); 
		 String myNum = "";
		 System.out.println("숫자 6개를 연속으로 입력 : ");
		 myNum = scan.nextLine();
		 
		 //배열과 문자열을 비교하기 위해 배열을 문자열로 변환 
		 String[] inputNumbers = myNum.split(" ");
		 // split : 특정 문자를 기준으로 잘라서 문자열 배열로 만들어줌
		 // 2 6 11 13 33 24 42 -> ["2", "6", "11", "13", "33", "24" "42"]
		 
		 myNum = String.join("" , inputNumbers);
		 //join : 배열에 저장된 문자열을 하나의 문자열로  합침 
		 // "" : 문자열을 합칠떄 사이에 넣을 구분사를 넣는 공간인데 현재 그냥 연결한것 
		 // inputNumbers : 합칠 문자열이 들어있는 배열 
		 
		 boolean isWin = false;
		 for(int i = 0; i < lotto.length; i ++) {
			 String lottoNumber = ""; 
			 for(int j = 0; j < lotto[i].length; j++) {
				 lottoNumber += lotto[i][j]; 
				 //{2,6,11,13,33,24,42} -> 26111334244
			 }
			 if(myNum.equals(lottoNumber)) { 
				 //myNum : 사용자가 입력한 값
				 //equals : 두 문자열을 비교하는 메서드 ( 같으면 true / 다르면 false를 도출 )
				 isWin = true;
				 break;
				 
				 }
		 		}
		 		if(isWin) {
		 			System.out.println(myNum + "번호 당첨!");
		 		}else {
		 			System.out.println(myNum + "번호는 당첨되지 않았습니다!");
		 		
		 		}
		 		scan.close();
		 		}
			}
