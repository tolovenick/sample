public class Demo11 {

	public static void main(String[] args) {
		// ���������
		int a = 10;
		int b = 5;
		// ���� ����� �� ������ ������		
		int c = a + b;
		int g = a%b;
		System.out.println(g);


		String x = "�����ٶ�";
		String y = "hello";
	 	String z = x + y;
		// �����ϋ��� �����ٶ�hello ��� �̾�ٿ���
		System.out.println(z);
		
		// + �������� �翷�� ���ڰ� �������� �������� ����
		// + �����ڿ��� �ϳ��� ���ڰ� ������ �̾���̱�
		System.out.println( 3 + 6 + "hello" );  // ��� : 9hello
		System.out.println( "hello" + 3 + 6 );  // ��� : hello36

		int kor = 60;
		int eng = 70;
		int math = 30;

		System.out.println("���� :" + (kor + eng + math));

	}
}