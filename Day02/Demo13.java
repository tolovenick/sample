public class Demo13 {
	public static void main(String[] args) {

		int x = 10;
		int y = 0;

		// 나눗셈연산에서 0으로 나눌수 없다.
		// 아래의 코드는 실행시 오류가 발생됨
		int z = x / y;
		System.out.println("Z의 값 :" + z);
	}
}