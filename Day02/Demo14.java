public class Demo14 {
	public static void main(String[] args){
	// 증감 연산자
	// ++ 1 씩 증가   -- 1씩 감소
	int a = 3;
	a++;
	++a;
	System.out.println("a의 값: " + a);
	
	int x = 10;
	int y = 10;

	int m = x++;  // x 의 값을 m에 대입하고 증가
	int n = ++y;  // y 의 값을 증가하고 n에 대입

	System.out.println("m의 값 :" + m);
	System.out.println("n의 값 :" + n);
	System.out.println("x의 값 :" + x);
	System.out.println("y의 값 :" + y);

	}
}