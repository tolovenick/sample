public class Score {
	String name;
	int kor;
	int eng;
	int math;


	// 생성자 사용
	public Score() {
		name = "홍길동";
		kor = 65;
		eng = 70;
		math = 80;
	}

	// 생성자의 중복정의 ( 생성자의 오버로딩 )
	public Score(String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng = e;
		math = m;
	}

	public int total() {
		return kor + eng + math;
	}

	public double average() {
		return total()/3.0;
	}
}