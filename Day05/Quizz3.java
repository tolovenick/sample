import java.util.*;

public class  Quizz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		// ������ ���� 3���� ������ �迭
		int[] numbers = new int[3];
		int position = 0;
		for ( ;; ) {
			int number = ran.nextInt(10);
			boolean isExist = false;
			for(int i=0;i<position; i++) {
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

		// ����ڰ� �Է��� ���� ������ �迭	
		// �ڸ������� ���ڵ� ������ ��Ʈ����ũ
		// ���ڴ� ������ �ڸ��� �ٸ��� ��
		// Tip : ����for ����� , answer , ���ڶ� �ε����� ���Ұ�
		// ���Ѱ��� ���� ball �̶� strike �� ������ų��.
		// 10���ȿ� ���� / ���а� ��µǵ��� �Ұ�.
		// ������ 3��Ʈ����ũ�� �Ǿ� �����̴�.

		int[] answer = new int[3];

		boolean inSuccess = false;  // �����ϸ� inSuccess �� ���� true�� �ٲٰ� Ż���ų��

		for (int a=1; a<=10; a++) { // a�� Ƚ��
		int strike = 0;
		int ball = 0;
		
		if ( strike == 3 ) { 
			inSuccess = true;
			break;
		}
		
	}
		
		if (inSuccess) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}


	}
}