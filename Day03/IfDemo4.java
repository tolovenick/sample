import java.util.Scanner;

public class IfDemo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("�ݾ��� �ӷ��ϼ��� : ");
		int money = sc.nextInt();

		System.out.println("1:Ŀ��(1500��) 2:�����꽺(2000��) 3:�̿�����(1000��) ");
		System.out.print("���Ḧ ������ (��ȣ) : ");
		int no = sc.nextInt();	
		int result = 0;

		if (no == 1 ) {
				int coffee = 1500;
				result = money - coffee;
				System.out.println("Ŀ�Ǹ� �޾ư����� ~ ");
		}	else if (no == 2) {
				int juce = 2000;
				result = money - juce;
				System.out.println("�꽺�� �޾ư����� ~ ");
		}	else if (no == 3) {
				int eon = 1000;
				result = money - eon;
				System.out.println("Ŀ�Ǹ� �޾ư����� ~ ");
		}	else {
				System.out.println("�´� ��ȣ�� ����ּ��� ");
		}	
		System.out.println("�Ž������� :" + result);

	}
}


