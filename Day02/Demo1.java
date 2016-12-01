public class Demo1 {
	public static void main(String[] args) {
		// 정수 타입
		byte b1 = 23;
		byte b2 = -126;
		// byte b3 = 128;
		// b3은 자료형의 범위를 초과

		int a1 = 128;
		int	a2 = -128;

		long c1 = 10000;

		// 숫자의 범위가 int의 범위를 벗어나는 값일경우 반드시 L 붙일것.
		long c2 = 100000000000L;

		int m1 = 10;
		int m2 = 012;
		int m3 = 0xA;

		// 앞에 0 을 적으면 8진수로 인식함(m2)
		// 앞에 0x 를 적으면 16진수로 인식(m3)

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);

		int m4 = 100_000_000;
		int m5 = 5;
		System.out.println(m4 * m5);
		// java7 부터 m4처럼 _ 를 이용해서 자리수 표시 가능

	}

}