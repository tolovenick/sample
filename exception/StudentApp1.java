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

		System.out.println("�̸�: " + s.getName() + "\n�г�: " + s.getGrade() + "\n��������: "+ s.getKor() + "\n��������: " + s.getEng() + "\n��������: " + s.getMath());

		
	}
}