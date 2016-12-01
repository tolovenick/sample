import java.util.Random;
import java.util.Scanner;

// 주사위를 두개 던지는 게임
// 두 주사위의 합이 7이 되면 무인도행
// 무인도에 갇힌 경우 같은숫자 조합일 떄만 무인도 탈출
// 무인도에 갇힌 경우 주사위를 3번 굴렸다면 무인도에서 탈출
// 무인도에 갇히지 않은 경우에는 주사위의 합만큼 칸을 이동
// 무인도에 가둔다는 생각은 잘못된 접근법입니다. (?)

public class Quizz4 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int island = 0;			// 무인도면 1 , 무인도 아니면 0
		int count = 3;			// 무인도 탈출 카운트
		int condition = 0;		// 어디까지 왔나 ?
		int conditionMax = 100;	// 어디까지 가나 ?
		int conditionRemain = conditionMax - condition; 
								// 얼마나 남았나 ?
		int gameTry = 0;		// 얼마나 시도했니 ?
		int gameMu = 0;			// 얼마나 무인도 다녀왔니 ?
		
		
		for ( ; ; ) {
			System.out.printf("############################################\n");
			System.out.printf("##----------------------------------------##\n");
			System.out.printf("##1. 주사위 굴리기         0.종료         ##\n");
			System.out.printf("##----------------------------------------##\n");
			System.out.printf("############################################\n");
			System.out.printf("#선택하세요 :");

			int no = sc.nextInt();
			if ( no == 1 ) {
				int first = random.nextInt(6) + 1;
				int second = random.nextInt(6) + 1;
				gameTry = gameTry + 1;

				if ( island == 0 ) {  // 무인도가 아닙니다.
					if ( ( first + second ) == 7 ) {
						count = 3;
						island = island + 1;
						gameMu = gameMu + 1;
						System.out.printf("#############################################\n");
						System.out.printf("#첫번쨰숫자:%2d,     두번쨰 숫자:%2d        #\n",first,second);
						System.out.printf("#            무.인.도.                      #\n");
						System.out.printf("#                           당신의 위치 %2d #\n",condition);
						System.out.printf("#                           남은 칸 %2d     #\n",conditionRemain);
					} else {
						condition = condition + ( first + second );
						conditionRemain = conditionMax - condition;
						System.out.printf("#############################################\n");
						System.out.printf("#  첫번쨰숫자: %2d,   두번쨰 숫자: %2d       #\n",first,second);
						System.out.printf("#  %2d 칸만큼전진                           #\n",first + second);
						System.out.printf("#                           당신의 위치 %2d #\n",condition);
						System.out.printf("#                           남은 칸 %2d     #\n",conditionRemain);

							if ( condition >= conditionMax ) {
							System.out.printf("##########################################################\n");
							System.out.printf("#                 모두의 마블 끝!!                       #\n");
							System.out.printf("# 당신의 위치 : %2d    || 이 게임의 끝 : %2d             #\n",condition,conditionMax);
							System.out.printf("# 당신의 시도회수 : %2d || 무인도에 다녀온회수 : %2d     #\n",gameTry,gameMu);
							System.out.printf("##########################################################\n");	
							break;
							}
					}
				}  else {  // 무인도 입니다.
					if ( first == second ) {
						island = island - 1;
						System.out.printf("############################################\n");
						System.out.printf("# 첫번쨰숫자:%2d,  두번쨰 숫자:%2d         #\n",first,second);
						System.out.printf("#           무.인.도.탈.출.  (더블)        #\n");
						System.out.printf("#                          당신의 위치 %2d #\n",condition);
						System.out.printf("#                          남은 칸 %2d     #\n",conditionRemain);
					}	else  {
							if ( count == 1 ) {
						island = island - 1;
						System.out.printf("############################################\n");
						System.out.printf("# 첫번쨰숫자:%2d,  두번쨰 숫자:%2d         #\n",first,second);
						System.out.printf("#           무.인.도.탈.출.  (3회 충족)    #\n");
						System.out.printf("#                          당신의 위치 %2d #\n",condition);
						System.out.printf("#                          남은 칸 %2d     #\n",conditionRemain);
								count = 3;
							} else {
						count = count - 1;
						System.out.printf("##############################################\n");
						System.out.printf("# 첫번쨰숫자:%2d, 두번쨰 숫자:%2d ==>탈출불가#\n",first,second);
						System.out.printf("# 다른수가 3번이면 탈출 ==> 현재 %2d 회      #\n",count);
						System.out.printf("#                           당신의 위치 %2d  #\n",condition);
						System.out.printf("#                           남은 칸 %2d      #\n",conditionRemain);
							}
					}
				}
			}	else  {
				System.out.printf("프로그램을 종료합니다.\n");
				break;
			}
		}
	}
}