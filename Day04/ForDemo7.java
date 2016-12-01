import java.util.Scanner;
public class ForDemo7 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	for (;;) {					// 무한루프 사용
		System.out.println("[1]조회 [2]등록 [3]삭제 [0]종료");
		System.out.println("메뉴를 선택하세요");
		int menuNo = sc.nextInt();
		if (menuNo == 1) { 
			System.out.println( " 정보를 조회합니다 " );
		}	else if (menuNo == 2) {
			System.out.println( " 정보를 등록합니다 " );
		}	else if (menuNo == 3) {
			System.out.println( " 정보를 삭제합니다 " );
		}	else if (menuNo == 0) {
			System.out.println( " 종료합니다 " );
			break;
		}
		}
	}
}
