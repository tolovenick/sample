import java.util.Scanner;

public class ContactApp2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContactMgr mgr = new ContactMgr();
	
	Contact[] contact = new Contact[100];


	for (;;) {
			System.out.println("1:��� || 2:��ȸ || 0:����");
			System.out.print("��ȣ�� �Է����ּ��� :");
			int menuNo = sc.nextInt();

			if(menuNo == 1) {
			// �迭�� ����ϱ�
			// mgr�� addContact(Contact contact)�޼ҵ忡 ����� Contact ��ü ����

			} else if (menuNo == 2) {
			// �迭�� ����� ��� ����ó ���� ǥ���ϱ�
			// mgr�� displayContact()�� �����Ű��
			
				
			} else if (menuNo == 3) {
				break;
			}


		}
	

	}
}