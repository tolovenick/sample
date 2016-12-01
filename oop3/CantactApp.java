import java.util.Scanner;

public class CantactApp {
	public static void main(String[] args) {
	// 연락처 정보를 입력받는 화면 관련 클래스
	// 사용자의 입력을 읽어오는 Scanner 객체 생성하기
	Scanner sc = new Scanner(System.in);
	
	Contact[] contact = new Contact[100];
	int currentPosition = 0;

	for (;;) {
			System.out.println("1:등록 || 2:조회 || 0:종료");
			System.out.print("번호를 입력해주세요 :");
			int menuNo = sc.nextInt();

			if(menuNo == 1) {
			// 배열에 등록하기
			// 배열에 currentPosition이 가르키는 위치에 Contact를 저장하고
			// currentPosition의 값을 1증가시킨다.

			} else if (menuNo == 2) {
			// 배열에 저장된 모든 연락처 정보 표시하기
			// enhanced for문 사용하지 말고 구현 ( 꺼냈는데 null 이 아닐떄만 표현 )
			// currentPosition이 가르키는 위치 앞까지 반복 출력
			
				
			} else if (menuNo == 3) {


			}


		}
	

	}
}