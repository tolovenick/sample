import java.util.Scanner;

public class IfDemo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("금액을 임력하세요 : ");
		int money = sc.nextInt();

		System.out.println("1:커피(1500원) 2:과일쥬스(2000원) 3:이온음료(1000원) ");
		System.out.print("음료를 고르세요 (번호) : ");
		int no = sc.nextInt();	
		
		int retrunCoin = 0;
		if (no == 1) {
			System.out.println("커피를 받아가세요.");
			retrunCoin = money - 1500;
		} else if ( no == 2) {
			System.out.println("과일쥬스를 받아가세요.");
			retrunCoin = money - 2000;
		} else if ( no == 3) {
			System.out.println("이온음료를 받아가세요.");
			retrunCoin = money - 1000;
		} else {
			System.out.println("잘못눌렀습니다..");
		}
		System.out.println("거스름돈 : " + retrunCoin + "원" );
		
		returnCoinA = retrunCoin / 100;
		retrunCoinB = (retrunCoin - ( retrunCoinA * 100 )) /10;
		retrunCoinC = (retrunCoin - (retrunCoinA * 100) -  (retrunCoinB * 10));
		

	}

}

