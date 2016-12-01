import java.io.*;

public class StudentApp1 {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("score.txt"));
		String text = reader.readLine();
		String[] a = text.split(",");

		Student s = new Student();
		s.setName(a[0]);
		s.setGrade(a[1]);
		int value1 = Integer.parseInt(a[2]);
		s.setKor(value1);
		s.setEng(Integer.parseInt(a[3]));
		s.setMath(Integer.parseInt(a[4]));

		System.out.println("이름: " + s.getName() + "\n학년: " + s.getGrade() + "\n국어점수: "+ s.getKor() + "\n영어점수: " + s.getEng() + "\n수학점수: " + s.getMath());

		
	}
}