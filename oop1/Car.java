public class Car {
	// 속성(필드) 정의하기
	// 속성에는 내가 담고싶은 값 넣으면 됨
	int speed;

	// 기능(Method) 정의하기
	public void speedUp() {
		speed += 10;
		System.out.println("현재 속도 : " + speed + "Km");
	}

	public void speedDown() {
		speed -= 10;
		System.out.println("현재 속도 : " + speed + "Km");
	}

}