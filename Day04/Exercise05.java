public class Exercise05 {
	public static void main(String[] args) {
		// 4x + 5y = 60의 모든 해를 구해보시게
		// 단 x는 1~10의 자연수
		for(int x=1; x<=10; x++){
			for(int y=1; y<=10; y++){
			if((4*x+5*y) == 60){
				System.out.printf("X의 값%2d, Y의 값%2d \n", x, y);
				continue;
				}
			}
		}
	}
}
