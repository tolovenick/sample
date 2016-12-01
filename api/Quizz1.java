import java.util.Scanner;

public class Quizz1 {
	
	public static void main(String[] args) {
		// 이메일을 입력받아서 이메일에 포함된 아이디부분만 출력하기
		// 예> eungsulee@hanmail.net ----> eungsulee
		
		Scanner sc = new Scanner(System.in);

		System.out.print("이메일을 입력하세요:");
		String email = sc.next();

		int position = email.indexOf("@");
		String result = email.substring(0, position);
		String result1 = email.substring(position+1);
		System.out.println(result);
		System.out.println(result1);
		

		String[] arr = email.split("@");
		System.out.println("아이디: " + arr[0]);
	}
}