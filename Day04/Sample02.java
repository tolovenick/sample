import java.util.Random;
import java.util.Scanner;

// �ֻ����� �ΰ� ������ ����
// �� �ֻ����� ���� 7�� �Ǹ� ���ε���
// ���ε��� ���� ��� �������� ������ ���� ���ε� Ż��
// ���ε��� ���� ��� �ֻ����� 3�� ���ȴٸ� ���ε����� Ż��
// ���ε��� ������ ���� ��쿡�� �ֻ����� �ո�ŭ ĭ�� �̵�
// ���ε��� ���дٴ� ������ �߸��� ���ٹ��Դϴ�. (?)

public class Sample02 {
	public static void main(String[] args) {
		Random random = new Random();

		for (int i=1; i<=10; i++) {

			int first = random.nextInt(6) + 1;
			int second = random.nextInt(6) + 1;

			System.out.printf("(%d, %d)\n", first, second);
		}
	}

}