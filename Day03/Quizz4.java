import java.util.Scanner;

public class Quizz4 {
	public static void main(String[] args) {
		// 임의의 두자리 숫자를 받아서 그 숫자에 해당하는 한글로 변환하기
		// 예) 23 -> 이십삼
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요");
		int number = sc.nextInt();
		int numberA = number / 10;
		int numberB = number - (numberA * 10);
		if (numberA == 1){
			System.out.print(" ");
		} else if (numberA ==2) {
			System.out.print("이");
		} else if (numberA ==3) {
			System.out.print("삼");
		} else if (numberA ==4) {
			System.out.print("사");
		} else if (numberA ==5) {
			System.out.print("오");
		} else if (numberA ==6) {
			System.out.print("육");
		} else if (numberA ==7) {
			System.out.print("칠");
		} else if (numberA ==8) {
			System.out.print("팔");
		} else if (numberA ==9) {
			System.out.print("구");
		} else if (numberA ==0) {
			System.out.print(" ");
		}

		System.out.print("십");

		if (numberB == 1){
			System.out.println("일");
		} else if (numberB ==2) {
			System.out.println("이");
		} else if (numberB ==3) {
			System.out.println("삼");
		} else if (numberB ==4) {
			System.out.println("사");
		} else if (numberB ==5) {
			System.out.println("오");
		} else if (numberB ==6) {
			System.out.println("육");
		} else if (numberB ==7) {
			System.out.println("칠");
		} else if (numberB ==8) {
			System.out.println("팔");
		} else if (numberB ==9) {
			System.out.println("구");
		} else if (numberB ==0) {
			System.out.println(" ");
		}
	}
}

