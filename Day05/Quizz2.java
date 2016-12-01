import java.util.Scanner;

public class Quizz2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	 // 숫자를 입력받아서 그 숫자들의 합과 평균을 계산해서 출력하기
	 // 1. 학생 수를 입력받기
	 // 2. 학생 수 만큼의 크기를 가진 배열을 만들기
	 // 3. 학생 수 만큼 반복하면서 점수를 입력받고 배열에 담기
	 // 4. 배열에 저장된 값으로 합계와 평균을 계산해서 출력하기

	System.out.printf("국어 시험을 본 학생들의 수를 입력하세요 : ");
	int size = sc.nextInt();		// 학생의 수 == 배열의 크기
	int[] sizeBeyul = new int[size];// size로 받은것을 sizeBeyul에 바로 넣기
	int sum = 0;
	int avg = 0;

	for (int a=0; a<sizeBeyul.length; a++){
		System.out.printf("%d 번 학생의 점수를 입력하세요 : ",a+1);
		int jumsu = sc.nextInt();
		sizeBeyul[a] = jumsu;
		}

	for (int score : sizeBeyul) {  // 향상된 for문으로 처리할것.
			sum += score;          // 모든수를 훑어가니까 향상for문 사용가능
		}

	avg = sum / size;

	System.out.printf("학생들의 합계는 : %d , 평균은 : %d \n",sum,avg);

	}
}