package day10;

class Snack { 
//	int price;
//	void info() {
//		System.out.println("과자의 가격은" + price + "입니다."); 
	
	int price;
	Snack(int p){
		// 생성자 선언 : 생성자의 이름은 반드시 클래스의 이름과 같아야 한다.
		// 생성자 역할 : 객체가 생성될 떄 필요한 초기값 설정 
		price = p; 
	}
	void info() {
		System.out.println("과자의 가격은" + price + "입니다.");
	}
}

public class _03_Snack {

	public static void main(String[] args) {
//		Snack chip = new Snack();
//		chip.price = 2000;
//		chip.info();
		
		Snack chip = new Snack(5000);
		chip.info();
				
	}

}
