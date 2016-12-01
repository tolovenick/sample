public class ForDemo6 {
	public static void main(String[] args) {
		// 1 ~ 100 까지의 합을 구하기
		// 단, 합계가 3000 을 넘어가는 순간의 숫자 구하기
		int total = 0;
		for (int a=1 ;a<=100; a++) {
			total = total + a;
			if ( total > 3000 ) {
				System.out.println(a);
				break;
			}
		}
	}
}
