import java.util.Scanner;
public class ContactApp2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Contact contact = new Contact();

		for (;;) {
			System.out.println("1.�̸���� 2.��ȭ��ȣ��� 3.�ּҵ�� 4.����");
			System.out.print("�޴��� �����ϼ���:");
			int no = sc.nextInt();
			if (no == 1) {
				// �̸��� �Է¹޾Ƽ� Contact�� �����մϴ�.
			} else if (no == 2) {
				// ��ȭ��ȣ ������ �Է¹޾Ƽ� Contact�� �����մϴ�.
				// Tel��ü ���� -> �� �Է¹޾Ƽ� ä��� -> Contact�� addTel(Tel tel)���� Tel ��ü �����ؼ� �迭�� ���
				
			} else if (no == 3) {
				// �ּ������� �Է¹޾Ƽ� Contact�� �����մϴ�.
				// Address��ü ���� -> �� �Է¹޾Ƽ� ä��� -> Contact�� setter �̿��ؼ� ����
			} else if (no == 4) {
				// ����ó ������ ȭ�鿡 ǥ���մϴ�.
			} else if (no == 0) {
				// ���α׷��� �����մϴ�.
			} 
		}
		
	}
}

/*
Datebase�� ������� �ϴ� �۾�
	Create			- �� ������ ����
	Retrieve		- ������ ��ȸ
	Update			- ������ ����
	Delete			- ������ ����
*/