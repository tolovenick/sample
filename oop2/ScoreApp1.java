public class ScoreApp1 {
	public static void main(String [] args) {
		Score s = new Score();
		
		s.name = "ȫ�浿" ;
		s.kor = 50;
		s.eng = 70;
		s.math = 80;

		System.out.println(s.total());
		System.out.println(s.average());

	}

}