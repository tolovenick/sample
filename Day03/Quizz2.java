import java.util.*;

public class Quizz2 {
	public static void main(String[] args) {
		// 3�ڸ��� ������ �Է¹޾Ƽ�
		// 10�� �ڸ� ����
		// 1�� �ڸ� ���ڸ� ���� ����ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print(" ���ڸ� ���ڸ� �Է����ּ��� : ");
		int number = sc.nextInt();
		if(number < 999 && number > 99) {
		int numberA = number / 100;
			int numberB = ( number - ( numberA * 100 ) ) / 10;
				int numberC = ( number - ( numberA * 100 ) - ( numberB * 10 ) ) / 1;
		System.out.println(" ���� �ڸ� " + numberA );
			System.out.println(" ���� �ڸ� " + numberB );
				System.out.println(" ���� �ڸ� " + numberC );
		}  else { 
			System.out.println(" 3�ڸ� ���ڸ� �־��ּ���");
		}
	}
}