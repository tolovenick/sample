public class Demo1 {
	public static void main(String[] args) {
		// ���� Ÿ��
		byte b1 = 23;
		byte b2 = -126;
		// byte b3 = 128;
		// b3�� �ڷ����� ������ �ʰ�

		int a1 = 128;
		int	a2 = -128;

		long c1 = 10000;

		// ������ ������ int�� ������ ����� ���ϰ�� �ݵ�� L ���ϰ�.
		long c2 = 100000000000L;

		int m1 = 10;
		int m2 = 012;
		int m3 = 0xA;

		// �տ� 0 �� ������ 8������ �ν���(m2)
		// �տ� 0x �� ������ 16������ �ν�(m3)

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);

		int m4 = 100_000_000;
		int m5 = 5;
		System.out.println(m4 * m5);
		// java7 ���� m4ó�� _ �� �̿��ؼ� �ڸ��� ǥ�� ����

	}

}