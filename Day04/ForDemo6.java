public class ForDemo6 {
	public static void main(String[] args) {
		// 1 ~ 100 ������ ���� ���ϱ�
		// ��, �հ谡 3000 �� �Ѿ�� ������ ���� ���ϱ�
		int total = 0;
		for (int a=1 ;a<=100; a++) {
			total = total + a;
			if ( total > 3000 ) {
				System.out.println(a);
				break;
			}
		}
	}
}
