public class Demo10 {
	public static void main(String[] args) {
		// 연산식에서의 형변환

		int a = 4;
		int b = 5;
		int c = a/b;

		// 연산에 참여한 값이 정수이기 떄문에 연산의 결과가 정수
		System.out.println(c);

		double d = a/(double)b;
		System.out.println(d);

	}

}