public class Demo11 {

	public static void main(String[] args) {
		// 산술연산자
		int a = 10;
		int b = 5;
		// 연산 결과는 꼭 변수로 받을것		
		int c = a + b;
		int g = a%b;
		System.out.println(g);


		String x = "가나다라";
		String y = "hello";
	 	String z = x + y;
		// 문자일떄는 가나다라hello 라고 이어붙여짐
		System.out.println(z);
		
		// + 연산자의 양옆에 숫자가 있을떄만 덧셈으로 동작
		// + 연산자옆에 하나라도 문자가 있으면 이어붙이기
		System.out.println( 3 + 6 + "hello" );  // 결과 : 9hello
		System.out.println( "hello" + 3 + 6 );  // 결과 : hello36

		int kor = 60;
		int eng = 70;
		int math = 30;

		System.out.println("총점 :" + (kor + eng + math));

	}
}