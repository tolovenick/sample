import java.util.Random;
import java.util.Scanner;

// 주사위를 두개 던지는 게임
// 두 주사위의 합이 7이 되면 무인도행
// 무인도에 갇힌 경우 같은숫자 조합일 떄만 무인도 탈출
// 무인도에 갇힌 경우 주사위를 3번 굴렸다면 무인도에서 탈출
// 무인도에 갇히지 않은 경우에는 주사위의 합만큼 칸을 이동
// 무인도에 가둔다는 생각은 잘못된 접근법입니다. (?)

public class Sample02 {
	public static void main(String[] args) {
		Random random = new Random();

		for (int i=1; i<=10; i++) {

			int first = random.nextInt(6) + 1;
			int second = random.nextInt(6) + 1;

			System.out.printf("(%d, %d)\n", first, second);
		}
	}

}