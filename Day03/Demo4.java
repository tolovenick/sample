public class Demo4 {
	public static void main(String[] args) {
		// ��Ʈ ������
		int a = 4;
		int b = 6;

		int result = a & b;
		System.out.println(result);  // ��� 4
		result = a | b ;
		System.out.println(result);  // ��� 6
		result = a ^ b ;
		System.out.println(result);  // ��� 2
		result = ~a ;
		System.out.println(result);  // ��� -5

		int c = -4;
		result = c >> 2;
		System.out.println(result);  // ��� -1

		result = c << 2;
		System.out.println(result);  // ��� -16

		result = c >>> 2;
		System.out.println(result);  // ��� 1073741823
	}

}

