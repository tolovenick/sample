public class ArrayDemo1 {
	public static void main(String[] args) {
	// 정수 5개를 가진 배열 만들기
	int[] numbers = {1,5,8,10,4};

	// 배열에서 값 가져오기
	// numbers[인덱스번호]
	int x = numbers[0];
	int y = numbers[1];

	System.out.println("배열의 0번째 값 :" + x);
	System.out.println("배열의 1번째 값 :" + y);

	//배열의 크기 알아내기
	// numbers.length;
	int size = numbers.length;
	System.out.println("크기 :" + size);

	//모든 숫자의 합계를 구하기
	int total = 0;
	for (int a=0; a<numbers.length; a++) {
	 total += numbers[a];
	}
	System.out.println("합계 :" + total);
	
	// 인핸스드 for 문
	// 오른쪽 배열의 개수만큼 자동적으로 실행문 실행
	int total2 = 0;
	for( int num : numbers) {
		System.out.println("인핸스드for문 각각 뽑기 :" + num);
		total2 = total2 + num;
		System.out.println("인핸스드for문 합계 :" + total2);
		}
	}
}