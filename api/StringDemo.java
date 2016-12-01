public class StringDemo {
	
	public static void main(String[] args) {
	
		/*
			String 클래스
				String 클래스는 문자열을 표현한다.
				String값은 불변값이다. 한번 만들어진 이후에는 변경할 수 없다.
				String은 객체를 생성하는 특별한 방법을 제공한다.
					String str = new String("abc");	// 생성자를 이용한 String객체 생성
					String str = "abc";				// 문자열 표현식을 이용한 String객체 생성

				Employee emp = new Employee();
		*/

		String str8 = "자바 프로그래밍 연습";
		
		// 문자열에서 지정된 문자열이 처음으로 등장하는 위치를 반환하는 메소드 : int indexOf(String str)
		int index = str8.indexOf("프");
		System.out.println("문자열에서 [프]이라는 글자가 처음으로 등장하는 위치는? " + index);

		// 문자열에서 내용을 지정된 문자열로 대체한 새로운 문자열을 반환하는 메소드 : String replace(String
		String str9 = str8.replace("자바", "파이썬");
		System.out.println("str8["+str8+"]");
		System.out.println("str9["+str9+"]");

		// 문자열에서 지정된 위치부터 끝까지 문자열을 잘라서 반환하는 메소드 : String substring(int beginIndex)
		String str10 = "abcdefghjklmn";
		String sub1 = str10.substring(5);
		System.out.println("5번째부터 잘라낸 문자열: " +sub1);

		// 문자열에서 지정된 구간의 문자열을 잘라서 반환하는 메소드 : String substring(int begin, int end)
		// 시작위치는 포함되고, 끝위치는 포함되지 않는다.
		String sub2 = str10.substring(0, 4);
		System.out.println("0번부터 4번앞까지 잘라낸 문자열: " + sub2);

		String name = "홍길동";
		String familyName = name.substring(0, 1);
		System.out.println("성: " + familyName);

		// 문자열을 지정한 구분자를 기준으로 잘라서 배열로 반환하는 메소드: String[] split(String delim)
		String text =  "서울, 경기,인천, 대전, 부산, 광주, 울산, 대구";
		String[] area = text.split(",");
		System.out.println(area[0]);
		System.out.println(area[2]);

		//문자열을 소문자/대문자로 변환한 새로운 문자열을 반환하는 메소드
		//String toUpperCase(), String toLowerCase()
		String str11 = "sony";
		String str12 = str11.toUpperCase();
		System.out.println("str11 ["+str11+"]");
		System.out.println("str12 ["+str12+"]");

		// 정수, 실수, 불린값, 기타 여러 종류의 값들을 문자열로 변환해서 반환하는 정적 메소드
		// String valueOf(int value), String valueOf(double value), String valueOf(boolean value)
		int number = 1234;
		// 숫자 123을 문자열 "123"으로 변환해서 반환한다.
		String str13 = String.valueOf(number);
		System.out.println("일의 자리수: " + str13.substring(str13.length()-1));\

		String str14 =1234 + "";

	}
}