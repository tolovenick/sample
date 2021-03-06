import java.util.*;

public class Quizz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random(); // 임의의 숫자 3개를 저장할 배열
		int[] numbers = new int[3];
		int position = 0;
		for (;;) {
			int number = ran.nextInt(10);
			boolean isExist = false;
			for (int i = 0; i < position; i++) {
				if (numbers[i] == number) {
					isExist = true;
				}
			}
			if (!isExist) {
				numbers[position] = number;
				position++;
			}
			if (position == 3) {
				break;
			}
		}
		System.out.println(Arrays.toString(numbers));
		/*
		 1) 자리도같고 숫자도 같으면 스트라이크 
		 2) 숫자는 같은데 자리가 다르면 볼 
		 3) Tip : 이중for 문사용 ,answer , 숫자랑 인덱스도 비교할것 
		 4) 비교한값에 따라 ball 이랑 strike 를 증가시킬것. 
		 5) 0번안에 성공 실패가 출력되도록 할것
		 6) 정답은 3스트라이크가 되야 정답이다.
		 */
		int NumberOfMax = 10; // 최대 시도 회수
		int NumberOfTimes = 1; // 현재 시도 회수
		boolean inSuccess = false; // false: 탈출못함 , true: 탈출
		int out = 0; // 0: 아웃 , 그외에 아웃
		for (NumberOfTimes = 1; NumberOfTimes <= NumberOfMax; NumberOfTimes++) {
			System.out.printf("%d/%d)  당신이 생각한 3자리 숫자를 말해주세요 : ", NumberOfTimes, NumberOfMax);
			int answer = sc.nextInt();
			int[] answerList = new int[3];
			int strike = 0;
			int ball = 0;
			int answerHundredth = answer / 100; // 입력받은 숫자의 백의자리
			int answerTen = (answer - (answerHundredth * 100)) / 10; // 입력받은 숫자의 십의자리
			int answerOne = (answer - (answerHundredth * 100)) - (answerTen * 10) / 1; // 입력받은 숫자의 일의자리

			answerList[2] = answerOne; // 일의자리 숫자를 배열 2번에 넣기
			answerList[1] = answerTen; // 십의자리 숫자를 배열 1번에 넣기
			answerList[0] = answerHundredth; // 일의자리 숫자를 배열 0번에 넣

			for (int a = 0; a < 3; a++) { // 스트라이크 판독기
				if (answerList[a] == numbers[a]) {
					strike++;
					out++;
				}
			}

			if (answerList[0] == numbers[1]) {
				ball++;
				out++;
			} // 볼 판독기

			if (answerList[0] == numbers[2]) {
				ball++;
				out++;
			}

			if (answerList[1] == numbers[0]) {
				ball++;
				out++;
			}

			if (answerList[1] == numbers[2]) {
				ball++;
				out++;
			}

			if (answerList[2] == numbers[0]) {
				ball++;
				out++;
			}

			if (answerList[2] == numbers[1]) {
				ball++;
				out++;
			}

			if (out != 0) { // 중간결과를 나타냅니다.
				System.out.printf("스트라이크 %d개, 볼 %d개 입니다. \n", strike, ball);
			} else {
				System.out.printf("아웃입니다.\n");
			}
			if (strike == 3) { // 스트라이트 3개인 경우
				inSuccess = true;
				if (inSuccess) { // 게임이 성공적으로 끝임
					System.out.printf("게임에서 승리하셨습니다.\n");
					break;
				}
			}
		}

		if (!inSuccess) { // 10번 안되면 실패
			System.out.printf("게임에서 실패하셨습니다.\n");
		}
	}
}