public class Product {
	int no;
	String name;
	String maker;
	int price;
	double discountRate;

	public Product() {
	}

/*
	public Product(int a, String b, String c, int d, double e) {
		no = a;
		name = b;
		maker = c;
		price = d;
		discountRate = e;
	}
  위와같이 적었을떄 a , b , c , d , e 가 정확히 뭘 뜻하는지 모르겠음.
*/
		public Product(int no, String name, String maker, int price, double discountRate) {
		this.no = no;
		this.name = name;
		this.maker = maker;
		this.price = price;
		this.discountRate = discountRate;
		}
// 위와같이 적으면 가독성이 높아짐 , 생성자를 만들떄 꼭 사용할것.
//	this.no = no;
// Product클래스의 no 에 Product생성자의 no 를 대입
	
	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public String getMaker() {
		return maker;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public int getDiscountPrice() {
		return (int) (price * (1-discountRate));
	}


	public void info() {
		System.out.printf("%d %s %s %d %f \n",no,name,maker,price,discountRate);
	}
// info 메소드 안에는 같은이름을 갖는 속성이 없으니까 this 를 붙이지 않아도 됩니다.
}
