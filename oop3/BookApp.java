public class BookApp {
	public static void main(String[] args) {
		Book[] bookCart = new Book[5];
		
		bookCart[0] = new Book(1,"이것이 자바다","홍길동","한빛 미디어",35000,"2015-10-10");
		bookCart[1] = new Book(2,"자바 인 액션","MR.1","한1",45000,"2014-10-10");
		bookCart[2] = new Book(3,"스프링 프레임워크","MR.2","한2",25000,"2013-10-10");
		bookCart[3] = new Book(4,"스프링 시큐리티","강감찬","한3",15000,"2012-10-10");
		bookCart[4] = new Book(5,"자바 웹 프로그래밍","권률","한빛 미디어",65000,"2011-10-10");
		
		// 카트에 저장된 모든 책들의 제목을 표시하기
		for (int i=0; i<bookCart.length; i++) {
			System.out.println(bookCart[i].getTitle());
		}
		
/*		// 카트에 저장된 책들의 가격 총합을 표시하기
		int total = 0;
		for (int i=0; i<bookCart.length; i++) {
			total = total + bookCart[i].getPrice();
		} 	System.out.println("총합은 :" + total);
*/		
		int total = 0;
		for ( Book book : bookCart ) {
			total = total + book.getPrice();
		} 	System.out.println("총합은 :" + total);

/*		// 카트에 저장된 책중에서 가장 비싼 가격의 책 제목
		int maxPrice = 0;
		for (int i=0; i<bookCart.length; i++) {
			if 	( bookCart[i].getPrice() > maxPrice ){
				maxPrice = bookCart[i].getPrice();
			}
		}	System.out.println("제일 비싼 책은 :" + maxPrice);
*/		
		int maxPrice = 0;
		String maxTitle = "";
		for ( Book book : bookCart ) {
			if ( book.getPrice() > maxPrice ){
				maxPrice = book.getPrice();
				maxTitle = book.getTitle();
			}
		}System.out.println("제일 비싼 책은 :" + maxTitle);
	}
}