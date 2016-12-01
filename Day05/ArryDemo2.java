public class ArryDemo2 {
	public static void main(String[] args){
	// 배열 생성하기
	// int[] arr = {1, 2, 3, 4, 5 6};  <= 값을 가진 배열 생성
	
	// int[] arr = new int[3]          <= 값 3개를 담을수있는배열생성
	// 정수형은 0, 실수형은 0.0, 문자형은 \u0000, 불린형은 false, 참조형은 null
	int[] numbers = new int[3];
	System.out.println(numbers[0]); // 0 이 출력됨
	System.out.println(numbers[1]); // 0 이 출력됨
	System.out.println(numbers[2]); // 0 이 출력됨
	System.out.println(numbers);    // [I@15db9742 이 출력됨
									// 주소값이 아니라 객체를 식별하기위한 번호임(해시코드값)

	String[] st = new String[3];
	System.out.println(st[0]); // null 이 출력됨
	System.out.println(st[1]); // null 이 출력됨
	System.out.println(st[2]); // null 이 출력됨
	System.out.println(st);    // [Ljava.lang.String;@6d06d69c 이 출력됨

	}

}



