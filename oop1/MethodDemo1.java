public class MethodDemo1 {
	
	public static void a() {   // �޼ҵ��� ����
		System.out.println("����ڰ� ������ a �޼ҵ��Դϴ�.");	
	}
	
	// �Ű������� �������ִ� �޼ҵ� ����
	// �Ű������� �޼ҵ� ���࿡ �ʿ��� ���� ���޹޾Ƽ� ��´�.
	public static void b(int x) {
		System.out.printf("����ڰ� ������ b �޼ҵ��Դϴ�. ���� %d \n",x);	
	}

	public static void c (String x) {
		System.out.printf("����ڰ� ������ c �޼ҵ��Դϴ�." + x + "\n" );	
	}
	
	public static void d (int d, int y) {
		System.out.printf("����ڰ� ������ d �޼ҵ��Դϴ�. ���� %d , %d \n",d,y);
	}

	public static void e (String name, String email, int age) {
		System.out.printf("����ڰ� ������ d �޼ҵ��Դϴ�. ���� : %s %s %d",name,email,age);
	}

	public static void main(String[] args) {
	a();     // �޼ҵ带 ȣ��
	b(100);  // �Ű������� �ִ� �޼ҵ� ȣ��
	int k = 20;
	b(k);
	
	c("ȫ�浿");
	c("�ȳ�, " + "���� ȫ�浿 �Դϴ�");

	d(1,2);

	e("�̸�ĭ" , "test@mail.com" , 99);

	}
}
