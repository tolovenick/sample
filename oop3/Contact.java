/* 연락처 관리 프로그램
1. 연락처를 등록할수 있다.
2. 등록된 연락처를 조회할 수 있다.

구상방법)
A. 연락처는 어떤데이터로 구성되어있을까 ?

1. 연락처정보 (번호,이름,전화번호,이메일)을 저장할수 있는 객체의 설계도 만들기
2. 구현할 기능 선정하기
 - 등록기능 : 배열에 Contact 객체를 저장하는것 구현하기
 - 조회기능 : 배열에 저장된 모든 Contact 객체의 정보를 표시하는 것 구현하기

B. 필요한 클래스
	Contact 클래스    - Contact 정보를 표현하는 클래스
	ContactApp 클래스 - Contact 진입점이 되는 클래스   
	

추가버전 : 	ContactMgr 클래스 존재	*/

public class Contact {
	private int no;
	private String name;
	private String phone;
	private String email;
	
	// 기본생성자

	// getter, setter 메소드


}
