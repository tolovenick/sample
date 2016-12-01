public class Contact { 
	// 속성 정의하기
	// 순번 , 이름 , 연락처 , 이메일
	int no;
	String name;
	String number;
	String email;
	
	// 기능 정의하기
	// 전화하기 call()
	// 문자보내기 sendMessage()
	// 메일보내기 sendMail()
	public void call(){
		
		System.out.printf("%s(%s) 전화를 걸고있습니다 \n",name,number);
	}

	public void sendMessage(){

		System.out.printf("%s(%s) 연락처로 문자를 보냅니다 \n",name,number);
	}

	public void sendMail(){

		System.out.printf("%s(%s) 연락처로 전화를 걸고있습니다 \n",name,number);
	}

}