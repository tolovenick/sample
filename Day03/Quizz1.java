import java.util.*;

public class Quizz1 {
	public static void main(String[] args) {
		// ����, ����, ���������� �Է¹޾Ƽ�
		// ���հ� ����� ����ϱ�
		Scanner sc = new Scanner(System.in);

		System.out.print("�������� �Է� :");
		int kor = sc.nextInt();
		System.out.print("�������� �Է� :");
		int eng = sc.nextInt();
		System.out.print("�������� �Է� :");
		int math = sc.nextInt();

		int total = kor + eng + math;
		int avg = total / 3;

		System.out.println("�� ���� " + total);
		System.out.println("����� " + avg);


	}
}

