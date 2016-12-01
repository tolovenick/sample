import java.util.Scanner;

public class Quizz4 {
	
	// 아이디를 입력받아서 올바른 아이디인지 검사하기
	// 아이디 작성 규칙(길이가 6글자 이상, 영어소문자)
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("아이디를 입력하세요:");
		String userId = sc.next();
		boolean isLower =  true;

		// 검사하기
		

		// 아이디가 6글자 이상인지 검사하기

		if(userId.length()<6) {
			System.out.println("아이디는 6글자 이상입니다.");
		}

		// 아이디가 영어 소문자로만 구성되었는지 검사하기 <---- boolean
		

		for(int i=0; i<userId.length();i++) {
				int value = userId.charAt(i);

				if(value < 97 || value > 122) {
					isLower = false;
				}
		}

		if (!isLower) {
			System.out.println("소문자로 입력하세요.");
		}


	}
}