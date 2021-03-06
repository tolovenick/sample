public class Btest {
// 1) 배열을 전달받아서 그 배열에서 가장 큰 값을 반환하는 메소드
// 2) 배열과 숫자를 전달받아서 그 배열에 숫자가 포함되어있는지 여부를 반환하는 메소드

	//속성
	int[] list = new int[3];			// 빈 배열을 생성
	int existNumber;					// 체크할 번호를 받고

	//기능
	public int mostNumber() {			// 최대값을 구하는 기능을 합니다.
		int max = 0;					// max 라는 변수를 만들어서 순차대로 저장
		for(int a=0; a<list.length; a++) {
			if(list[a] > max ) {
				max = list[a];
			}
		}
		return max;
	}

		public boolean yesNumber() {		// 존재하는지 유무를 yes 라는 변수를 사용해서 체크합니다.
			boolean yes = false;
			for(int b=0; b<list.length; b++) {
				if(list[b] == existNumber) {
					yes = true;
				}
			}
			return yes;
		}
}