import java.util.Scanner;
public class Sample01 {
	public static void main(String[] args) {
	int sum = 0;

	for( ; ; ){
		System.out.println("----------------------------------");
		System.out.println("||1.예금||2.출금||3.잔고||4.종료||");
		System.out.println("----------------------------------");
		System.out.println("메뉴를 선택하세요.");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		if( number == 1) {
		System.out.printf("고객님의 예금은 %d 입니다. \n", sum);
		System.out.printf("입금 금액을 입력해주세요 \n");
		int in = sc.nextInt();
		sum = sum + in;
		System.out.printf("고객님의 예금은 %d 입니다. \n", sum);

			} else if ( number == 2) {
			System.out.printf("고객님의 예금은 %d 입니다. \n", sum);
			System.out.printf("출금 금액을 입력해주세요 \n");		
			int out = sc.nextInt();
			if ( out > sum ) {
				System.out.printf("고객님의 잔고가 부족합니다. 현재 잔고 %d \n", sum);
				} else {
				sum = sum - out;
				}
				System.out.printf("고객님의 예금은 %d 입니다. \n", sum);

					} else if ( number == 3) {
					System.out.printf("고객님의 잔액은 %d 입니다. \n", sum);

						} else if ( number == 4) {
						System.out.printf("종료합니다. \n");
						break;

						} else {
						System.out.printf("숫자를 1번에서 4번 사이로 입력해주세요 \n");
						}
			}	
	}
}