import java.util.Scanner;

public class CantactApp {
	public static void main(String[] args) {
	// ����ó ������ �Է¹޴� ȭ�� ���� Ŭ����
	// ������� �Է��� �о���� Scanner ��ü �����ϱ�
	Scanner sc = new Scanner(System.in);
	
	Contact[] contact = new Contact[100];
	int currentPosition = 0;

	for (;;) {
			System.out.println("1:��� || 2:��ȸ || 0:����");
			System.out.print("��ȣ�� �Է����ּ��� :");
			int menuNo = sc.nextInt();

			if(menuNo == 1) {
			// �迭�� ����ϱ�
			// �迭�� currentPosition�� ����Ű�� ��ġ�� Contact�� �����ϰ�
			// currentPosition�� ���� 1������Ų��.

			} else if (menuNo == 2) {
			// �迭�� ����� ��� ����ó ���� ǥ���ϱ�
			// enhanced for�� ������� ���� ���� ( ���´µ� null �� �ƴҋ��� ǥ�� )
			// currentPosition�� ����Ű�� ��ġ �ձ��� �ݺ� ���
			
				
			} else if (menuNo == 3) {


			}


		}
	

	}
}