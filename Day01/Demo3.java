public class Demo3	{
	public static void main(String[] args) {

		// 정수담는 int타입의 그릇 a를 만들고 30을 대입해라
		int a = 30;
		int b = 40;

		// 화면에 a라는 이름을 가진 저장소를 출력해라
		System.out.println(a);
		// 화면에 b라는 이름을 가진 저장소를 출력해라
		System.out.println(b);
		// 화면에 a를 출력해라
		System.out.println("a");

		// a라는 저장소에 50 저장하기
		a = 50;
		// a값이 30에서 50으로 변경
		System.out.println(a);
	
		// a저장소에는 정수외의 값을 담을수 없다.
		// 아래코드는 에러.
		a = "가"

		// 가 라는 글자의 유니코드값이 담김
		a = '가'
	}
}
