public class AccountApp {
	public static void main(String[] args) {
		Account a = new Account("ȫ�浿", "111-222-3333", 1234 , 10000000);

//		System.out.println("������ : " + a.owner);
/*  �����̺� �޼ҵ��̱⋚���� ���� �߻�
---------- ������ ----------
AccountApp.java:5: error: owner has private access in Account
		System.out.println("������ : " + a.owner);
		                               ^
1 error
*/


		a.info();
/*  �ۺ� �޼ҵ��̱⋚���� ���� ����
---------- ���� ----------
 ȫ�浿 111-222-3333 1234 10000000
 */


		System.out.println("������ : " + a.getOwner() );
/*  get������� ����Ѱ��� ȣ����.
    �̰� geter seter ����̶���.
*/	

	}
}
