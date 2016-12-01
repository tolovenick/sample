public class CarApp {
	public static void main(String[] args) {

	/*
	Car c 
		Car 라는 설계도를 사용해서 생성된 객체의 주소값을 담는 변수 c를 만든다.
		Car 타입(클래스타입 = 참조타입)의 변수 c(참조변수)를 만든다

	new Car();
		Car 설계도를 로드해서 객체를 생성하고,
		생성된 객체를 참조할 수 있는 주소값을 반환하는 코드다.
		
	Car c = new = Car();
		Car설계도를 로드해서 객체가 생성하고,
		생성된 객체를 참조할 수 있는 주소값을 Car타입의 변수 c 에 저장.
	*/
	
	Car c = new Car();

	System.out.println(c);
	// 결과 Car@15db9742 
	//  @ 앞쪽은 설계도의 이름 , @ 뒤쪽은 해시코드 값 ( 실제 참조값은 아님 ) ( 주소값도 아님 ) ( 레퍼런스 값 아님 )
	// 마치 시리얼번호와 비슷함.

	// 생성된 객체의 필드, 생성된 객체의 메소드를 사용하기
	System.out.println(c.speed);    // 출력 0

	c.speed = 10;

	System.out.println(c.speed);	// 출력 10
	
	c.speedUp();


	}
}
