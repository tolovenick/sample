import java.util.Scanner;

public class Quizz3 {
	
	public static void main(String[] args) {
		// 임의의 숫자를 입력받아서 그수가 짝수인지 홀수인지
		// 삼항연산자를 이용해서 결과 표시하기
		Scanner sc = new Scanner(System.in);
		System.out.print(" 숫자를 입력해주세요 ");
	int number = sc.nextInt();
		String result = ( number % 2 ) > 0 ? " 홀수 " : " 짝수 ";
		System.out.println(" 판정결과 : " + result);
	}
}
