public class ForDemo8 {
	public static void main(String[] args) {
		System.out.println(" 브레이크.. ");
		for (int i=1; i<=10; i++) {
			if (i%3 == 0) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println(" 컨티뉴.. ");
		for (int i=1; i<=10; i++) {
			if (i%3 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
