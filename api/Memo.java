import java.util.*;

public class Memo {
	
	public static void main(String[] args) throws Exception {
	
/*		String text = "";
		text += "학교종이 땡땡땡" + System.lineSeparator();
		text += "어서 모이자"; + System.lineSeparator();
		text += "선생님이 우리를"; + System.lineSeparator();
		text += "기다리신다."; + System.lineSeparator();
		
		FileWriter writer = new FileWriter("a.txt");
		writer.write(text);
		writer.close();
		*/

		//배열 복사하기
		String[] src = {"이순신", "강감찬", "김유신", "홍길동", "일지매", "임꺽정"};
		String[] dest = new String[10];
/*
		System.arraycopy(src, srcPosition, dest, destPosition, length)
			src: 원본 배열
			srcPosition : 원본 배열에서 복사할 항목의 시작 위치
			dest : 새 배열
			destPosition : 새 배열에서 복사할 항목을 붙여넣을 시작 위치
			length : 원본 배열에서 복사할 항목의 갯수
*/
		System.arraycopy(src, 3, dest, 1, 6);
		System.out.println(Arrays.toString(dest));
	}
}
