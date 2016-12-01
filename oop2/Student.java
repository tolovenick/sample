public class Student {
	int no;		  // 학번
	String name;
	int kor;
	int eng;
	int math;

	// 기본 생성자
	public Student() {
		}

	// 모든 필드를 초기화하는 생성자
	public Student(int a, String b, int c, int d, int e) {
		no = a;
		name = b;
		kor = c;
		eng = d;
		math = e;
		}

	// 총점을 반환하는 기능                         ==> total
	public int total(){
		int out = kor + eng + math;
		return out;
		}

	// 평균을 반환하는 기능                         ==> avg
	public int avg(){
		int out = total() / 3;
		return out;
		}
	
	// 학생정보를 출력하는 기능(총점과 평균도 포함) ==> info
	public void info(){
		System.out.printf(" %d 번 %s 의 국어점수: %d , 영어점수: %d , 수학점수: %d , 총합:%d , 평균:%d \n",no,name,kor,eng,math,total(),avg());
		}
}