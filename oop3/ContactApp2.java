import java.util.Scanner;

public class ContactApp2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContactMgr mgr = new ContactMgr();
	
	Contact[] contact = new Contact[100];


	for (;;) {
			System.out.println("1:등록 || 2:조회 || 0:종료");
			System.out.print("번호를 입력해주세요 :");
			int menuNo = sc.nextInt();

			if(menuNo == 1) {
			// 배열에 등록하기
			// mgr의 addContact(Contact contact)메소드에 등록할 Contact 객체 전달

			} else if (menuNo == 2) {
			// 배열에 저장된 모든 연락처 정보 표시하기
			// mgr의 displayContact()를 실행시키기
			
				
			} else if (menuNo == 3) {
				break;
			}


		}
	

	}
}