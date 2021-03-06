public class Product {
	// 속성
	// 상품번호, 상품명, 가격, 제조사, 할인율(실수), 판매여부

	int no;
	String productName;
	int price;
	String manufacturer;
	double discountRate;
	boolean Availability;

	// 생성자
	// 기본생성자,매개변수 있는 생성자

	public Product(){
	}

	public Product(int a, String b, int c, String d, double e, boolean f){
		no = a;
		productName = b;
		price = c;
		manufacturer = d;
		discountRate = e;
		Availability = f;
	}
	
	// 기능
	// 할인된 가격을 반환하는 메소드 ( 할인된 결과가 정수로 나옴 (리턴) )
	// 상품정보를 표시하는 메소드( 할인가 포함 )

	public int discount() {
		double discountPrice = price * discountRate;
		return (int) discountPrice;
	}

	public void infoView() {
	System.out.printf("번호 : %2d || 이름 : %s || 가격 : %4d || 제조사 : %s || 할인율 : %1.0f || 판매여부 : %s  || 할인가 : %4d \n",no,productName,price,manufacturer,discountRate*100,Availability,price-discount());
	}
}