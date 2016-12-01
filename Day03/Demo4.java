public class Demo4 {
	public static void main(String[] args) {
		// 비트 연산자
		int a = 4;
		int b = 6;

		int result = a & b;
		System.out.println(result);  // 결과 4
		result = a | b ;
		System.out.println(result);  // 결과 6
		result = a ^ b ;
		System.out.println(result);  // 결과 2
		result = ~a ;
		System.out.println(result);  // 결과 -5

		int c = -4;
		result = c >> 2;
		System.out.println(result);  // 결과 -1

		result = c << 2;
		System.out.println(result);  // 결과 -16

		result = c >>> 2;
		System.out.println(result);  // 결과 1073741823
	}

}

