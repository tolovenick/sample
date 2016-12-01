import java.util.*;

public class Quizz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random(); // ������ ���� 3���� ������ �迭
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
		 1) �ڸ������� ���ڵ� ������ ��Ʈ����ũ 
		 2) ���ڴ� ������ �ڸ��� �ٸ��� �� 
		 3) Tip : ����for ����� ,answer , ���ڶ� �ε����� ���Ұ� 
		 4) ���Ѱ��� ���� ball �̶� strike �� ������ų��. 
		 5) 0���ȿ� ���� ���а� ��µǵ��� �Ұ�
		 6) ������ 3��Ʈ����ũ�� �Ǿ� �����̴�.
		 */
		int NumberOfMax = 10; // �ִ� �õ� ȸ��
		int NumberOfTimes = 1; // ���� �õ� ȸ��
		boolean inSuccess = false; // false: Ż����� , true: Ż��
		int out = 0; // 0: �ƿ� , �׿ܿ� �ƿ�
		for (NumberOfTimes = 1; NumberOfTimes <= NumberOfMax; NumberOfTimes++) {
			System.out.printf("%d/%d)  ����� ������ 3�ڸ� ���ڸ� �����ּ��� : ", NumberOfTimes, NumberOfMax);
			int answer = sc.nextInt();
			int[] answerList = new int[3];
			int strike = 0;
			int ball = 0;
			int answerHundredth = answer / 100; // �Է¹��� ������ �����ڸ�
			int answerTen = (answer - (answerHundredth * 100)) / 10; // �Է¹��� ������ �����ڸ�
			int answerOne = (answer - (answerHundredth * 100)) - (answerTen * 10) / 1; // �Է¹��� ������ �����ڸ�

			answerList[2] = answerOne; // �����ڸ� ���ڸ� �迭 2���� �ֱ�
			answerList[1] = answerTen; // �����ڸ� ���ڸ� �迭 1���� �ֱ�
			answerList[0] = answerHundredth; // �����ڸ� ���ڸ� �迭 0���� ��

			for (int a = 0; a < 3; a++) { // ��Ʈ����ũ �ǵ���
				if (answerList[a] == numbers[a]) {
					strike++;
					out++;
				}
			}

			if (answerList[0] == numbers[1]) {
				ball++;
				out++;
			} // �� �ǵ���

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

			if (out != 0) { // �߰������ ��Ÿ���ϴ�.
				System.out.printf("��Ʈ����ũ %d��, �� %d�� �Դϴ�. \n", strike, ball);
			} else {
				System.out.printf("�ƿ��Դϴ�.\n");
			}
			if (strike == 3) { // ��Ʈ����Ʈ 3���� ���
				inSuccess = true;
				if (inSuccess) { // ������ ���������� ����
					System.out.printf("���ӿ��� �¸��ϼ̽��ϴ�.\n");
					break;
				}
			}
		}

		if (!inSuccess) { // 10�� �ȵǸ� ����
			System.out.printf("���ӿ��� �����ϼ̽��ϴ�.\n");
		}
	}
}