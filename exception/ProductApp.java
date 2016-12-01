import java.io.*;

public class ProductApp {

	// 상품정보 텍스트 한 줄을 전달받아서 잘 잘라서 Product에 담아서 반환하는 메소드
	public static Product parseData(String text) {
		String[] a = text.split(",");
		String brand = a[0];
		String maker = a[1];
		int price = Integer.parseInt(a[2]);
		double discount = Double.parseDouble(a[3]);
		
		Product p = new Product();
		p.setBrand(brand);
		p.setMaker(maker);
		p.setPrice(price);
		p.setDiscount(discount);
		
		return p;

	}

	public static void main(String[] args) throws Exception {
		Product[] products = new Product[4];

		BufferedReader reader = new BufferedReader(new FileReader("Product.txt"));
		String text1 = reader.readLine();
		String text2 = reader.readLine();
		String text3 = reader.readLine();
		String text4 = reader.readLine();
		products[0] = parseData(text1);
		products[1] = parseData(text2);
		products[2] = parseData(text3);
		products[3] = parseData(text4);

		for (Product a : products) {
			System.out.println("제품명: " + a.getBrand() + "\t회사: " + a.getMaker() + "\t가격: " + a.getPrice() + "\t할인률: " + a.getDiscount());
		}



	}
}