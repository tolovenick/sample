import java.util.Scanner;

public class Quizz4 {
	public static void main(String[] args) {
		// ������ ���ڸ� ���ڸ� �޾Ƽ� �� ���ڿ� �ش��ϴ� �ѱ۷� ��ȯ�ϱ�
		// ��) 23 -> �̽ʻ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ���");
		int number = sc.nextInt();
		int numberA = number / 10;
		int numberB = number - (numberA * 10);
		if (numberA == 1){
			System.out.print(" ");
		} else if (numberA ==2) {
			System.out.print("��");
		} else if (numberA ==3) {
			System.out.print("��");
		} else if (numberA ==4) {
			System.out.print("��");
		} else if (numberA ==5) {
			System.out.print("��");
		} else if (numberA ==6) {
			System.out.print("��");
		} else if (numberA ==7) {
			System.out.print("ĥ");
		} else if (numberA ==8) {
			System.out.print("��");
		} else if (numberA ==9) {
			System.out.print("��");
		} else if (numberA ==0) {
			System.out.print(" ");
		}

		System.out.print("��");

		if (numberB == 1){
			System.out.println("��");
		} else if (numberB ==2) {
			System.out.println("��");
		} else if (numberB ==3) {
			System.out.println("��");
		} else if (numberB ==4) {
			System.out.println("��");
		} else if (numberB ==5) {
			System.out.println("��");
		} else if (numberB ==6) {
			System.out.println("��");
		} else if (numberB ==7) {
			System.out.println("ĥ");
		} else if (numberB ==8) {
			System.out.println("��");
		} else if (numberB ==9) {
			System.out.println("��");
		} else if (numberB ==0) {
			System.out.println(" ");
		}
	}
}

