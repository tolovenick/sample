import java.text.DecimalFormat;

public class Student {
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;

	public Student() {
	}

	public Student(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getNo() { return no; }
	public String getName() { return name; }
	public int getKor() { return kor; }
	public int getEng() { return eng; }
	public int getMath() { return math; }

	public void setNo(int no) { this.no = no; }
	public void setName(String name) { this.name = name; }
	public void setKor(int kor) { this.kor = kor; }
	public void setEng(int eng) { this.eng = eng; }
	public void setMath(int math) { this.math = math; }

	public int getTotal() {
		return kor + eng + math;
	}
	
	public double getAvg() {
		return this.getTotal() / 3;
	}

	public String getAverageForRound() {
		DecimalFormat df = new DecimalFormat("##.00");
		return df.format(getAvg());
	}
}

