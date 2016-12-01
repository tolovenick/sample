import java.util.Scanner;

public class IfDemo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("금액을 임력하세요 : ");
		int money = sc.nextInt();

		System.out.println("1:커피(1500원) 2:과일쥬스(2000원) 3:이온음료(1000원) ");
		System.out.print("음료를 고르세요 (번호) : ");
		int no = sc.nextInt();	
		int result = 0;

		if (no == 1 ) {
				int coffee = 1500;
				result = money - coffee;
				System.out.println("커피를 받아가세요 ~ ");
		}	else if (no == 2) {
				int juce = 2000;
				result = money - juce;
				System.out.println("쥬스를 받아가세요 ~ ");
		}	else if (no == 3) {
				int eon = 1000;
				result = money - eon;
				System.out.println("커피를 받아가세요 ~ ");
		}	else {
				System.out.println("맞는 번호를 골라주세요 ");
		}	
		System.out.println("거스름돈은 :" + result);

	}
}


