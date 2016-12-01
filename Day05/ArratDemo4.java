public class ArratDemo4 {
	public static void main(String[] args) {
		String[][] groups = new String[2][3];
		
		groups[0][0] = "AAA";
			groups[0][1] = "BBB";
				groups[0][2] = "CCC";
		groups[1][0] = "DDD";
			groups[1][1] = "EEE";
				groups[1][2] = "FFF";
		// 다차원 배열 값 표시하기

		for (int i=0; i<2; i++){
			for (int j=0; j<3; j++){
				System.out.println(groups[i][j] + "\t");
			}
			System.out.println( );
		}
		
		

	}
}
