import java.util.Scanner;

public class Quizz5 {
	public static void main(String[] args) {
		// ���� , ���� , ���� ������ �Է¹޾Ƽ� 
		// ���� , ��� , ������ ����ϱ�
		// ������ 90�̻�(A) , 80�̻�(B), 70�̻�(C),60�̻�(D),�׿ܴ� F
		Scanner sc = new Scanner(System.in);
		System.out.print(" ���� ������ �Է����ּ��� : ");
		int kor = sc.nextInt();
		System.out.print(" ���� ������ �Է����ּ��� : ");
		int eng = sc.nextInt();
		System.out.print(" ���� ������ �Է����ּ��� : ");
		int math = sc.nextInt();
		int result = kor + eng + math;
		int avg = result / 2;
		String grade = "";
		if ( avg >=90 ) {
			grade = "A";
		}	else if ( avg >= 80 ) {
			grade = "B";
		}	else if ( avg >= 70 ) {
			grade = "C";
		}	else if ( avg >= 60 ) {
			grade = "D";
		}	else				  {
			grade = "F";
		}
		System.out.println("����:" + result + "���:" + avg + "����:" + grade);
	}
}