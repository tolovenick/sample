public class Demo3 {
	public static void main(String[] args) {
		// 삼항 연산자
		//  조건삭 ? 참일떄 연산식 혹은 값 : 거짓일떄 연산식 혹은 값
		int score = 67;
		String result1 = score >= 60 ? "합격" : "불합격";
		System.out.println("판정 결과: " + result1);
		
		int price = 25000;
		int creditPrice = price >= 50000 ? price : price + 2500;

}
