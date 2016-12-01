public class ScoreApp3 {
	public static void main(String[] args) {
	
	// 생성되자마자 "김유신", 40, 50, 60 값이 들어갑니다.
	Score s = new Score("김유신", 40, 50, 60);
	
	System.out.println("총점 :" + s.total());
	System.out.println("평균 :" + s.average());
	}
}
