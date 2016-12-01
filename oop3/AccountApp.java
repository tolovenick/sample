public class AccountApp {
	public static void main(String[] args) {
		Account a = new Account("홍길동", "111-222-3333", 1234 , 10000000);

//		System.out.println("예금주 : " + a.owner);
/*  프라이빗 메소드이기떄문에 에러 발생
---------- 컴파일 ----------
AccountApp.java:5: error: owner has private access in Account
		System.out.println("예금주 : " + a.owner);
		                               ^
1 error
*/


		a.info();
/*  퍼블릭 메소드이기떄문에 정상 실행
---------- 실행 ----------
 홍길동 111-222-3333 1234 10000000
 */


		System.out.println("예금주 : " + a.getOwner() );
/*  get방식으로 사용한것을 호출함.
    이걸 geter seter 방식이라함.
*/	

	}
}
