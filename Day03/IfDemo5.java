import java.util.Scanner;

public class IfDemo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�ݾ��� �ӷ��ϼ��� : ");
		int money = sc.nextInt();

		System.out.println("1:Ŀ��(1500��) 2:�����꽺(2000��) 3:�̿�����(1000��) ");
		System.out.print("���Ḧ �������� (��ȣ) : ");
		int no = sc.nextInt();	
		
		int retrunCoin = 0;
		if (no == 1) {
			System.out.println("Ŀ�Ǹ� �޾ư�����.");
			retrunCoin = money - 1500;
		} else if ( no == 2) {
			System.out.println("�����꽺�� �޾ư�����.");
			retrunCoin = money - 2000;
		} else if ( no == 3) {
			System.out.println("�̿����Ḧ �޾ư�����.");
			retrunCoin = money - 1000;
		} else {
			System.out.println("�߸��������ϴ�..");
		}
		System.out.println("�Ž����� : " + retrunCoin + "��" );
		
		returnCoinA = retrunCoin / 100;
		retrunCoinB = (retrunCoin - ( retrunCoinA * 100 )) /10;
		retrunCoinC = (retrunCoin - (retrunCoinA * 100) -  (retrunCoinB * 10));
		

	}

}
