import java.util.Scanner;

public class Quizz2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	 // ���ڸ� �Է¹޾Ƽ� �� ���ڵ��� �հ� ����� ����ؼ� ����ϱ�
	 // 1. �л� ���� �Է¹ޱ�
	 // 2. �л� �� ��ŭ�� ũ�⸦ ���� �迭�� �����
	 // 3. �л� �� ��ŭ �ݺ��ϸ鼭 ������ �Է¹ް� �迭�� ���
	 // 4. �迭�� ����� ������ �հ�� ����� ����ؼ� ����ϱ�

	System.out.printf("���� ������ �� �л����� ���� �Է��ϼ��� : ");
	int size = sc.nextInt();		// �л��� �� == �迭�� ũ��
	int[] sizeBeyul = new int[size];// size�� �������� sizeBeyul�� �ٷ� �ֱ�
	int sum = 0;
	int avg = 0;

	for (int a=0; a<sizeBeyul.length; a++){
		System.out.printf("%d �� �л��� ������ �Է��ϼ��� : ",a+1);
		int jumsu = sc.nextInt();
		sizeBeyul[a] = jumsu;
		}

	for (int score : sizeBeyul) {  // ���� for������ ó���Ұ�.
			sum += score;          // ������ �Ⱦ�ϱ� ���for�� ��밡��
		}

	avg = sum / size;

	System.out.printf("�л����� �հ�� : %d , ����� : %d \n",sum,avg);

	}
}