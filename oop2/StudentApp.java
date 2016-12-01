public class StudentApp {
	public static void main(String [] args) {

	// 생성자를 이용한 값 입력
	Student b = new Student(50,"강감찬",70,80,90);
	System.out.printf("합계는 %d\n",b.total());
	System.out.printf("평균은 %d\n",b.avg());
	b.info();

	// 빈 생성자를 만들고 추후에 값 입력
	Student s = new Student();
	s.no = 10;
	s.name = "홍길똥";
	s.kor = 44;
	s.eng = 55;
	s.math = 66;
	
	System.out.printf("합계는 %d\n",s.total());
	System.out.printf("평균은 %d\n",s.avg());
	s.info();

	}
}