import java.util.Scanner;

public class Quizz5 {
	public static void main(String[] args) {
		// 국어 , 영어 , 수학 점수를 입력받아서 
		// 총점 , 평균 , 학점을 출력하기
		// 학점은 90이상(A) , 80이상(B), 70이상(C),60이상(D),그외는 F
		Scanner sc = new Scanner(System.in);
		System.out.print(" 국어 점수를 입력해주세요 : ");
		int kor = sc.nextInt();
		System.out.print(" 영어 점수를 입력해주세요 : ");
		int eng = sc.nextInt();
		System.out.print(" 수학 점수를 입력해주세요 : ");
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
		System.out.println("총점:" + result + "평균:" + avg + "학점:" + grade);
	}
}