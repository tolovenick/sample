import java.util.Scanner;

public class Quizz4 {
	
	// ���̵� �Է¹޾Ƽ� �ùٸ� ���̵����� �˻��ϱ�
	// ���̵� �ۼ� ��Ģ(���̰� 6���� �̻�, ����ҹ���)
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���̵� �Է��ϼ���:");
		String userId = sc.next();
		boolean isLower =  true;

		// �˻��ϱ�
		

		// ���̵� 6���� �̻����� �˻��ϱ�

		if(userId.length()<6) {
			System.out.println("���̵�� 6���� �̻��Դϴ�.");
		}

		// ���̵� ���� �ҹ��ڷθ� �����Ǿ����� �˻��ϱ� <---- boolean
		

		for(int i=0; i<userId.length();i++) {
				int value = userId.charAt(i);

				if(value < 97 || value > 122) {
					isLower = false;
				}
		}

		if (!isLower) {
			System.out.println("�ҹ��ڷ� �Է��ϼ���.");
		}


	}
}