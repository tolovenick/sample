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
  ���Ͱ��� �������� a , b , c , d , e �� ��Ȯ�� �� ���ϴ��� �𸣰���.
*/
		public Product(int no, String name, String maker, int price, double discountRate) {
		this.no = no;
		this.name = name;
		this.maker = maker;
		this.price = price;
		this.discountRate = discountRate;
		}
// ���Ͱ��� ������ �������� ������ , �����ڸ� ���鋚 �� ����Ұ�.
//	this.no = no;
// ProductŬ������ no �� Product�������� no �� ����
	
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
// info �޼ҵ� �ȿ��� �����̸��� ���� �Ӽ��� �����ϱ� this �� ������ �ʾƵ� �˴ϴ�.
}
