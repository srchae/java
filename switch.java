package oop0820;

public class Test03_switch {

	public static void main(String[] args) {
		//switch~case문
		//-> 목록중에서 동일한 값을 찾아서 수행
		//break : switch문을 빠져나옴
		
		/* switch(10) {
		case 10 : System.out.println("SEOUL"); break;
		case 20 : System.out.println("JEJU");  break;
		case 30 : System.out.println("BUSAN"); break;
		} */
		
		//default : 목록에 없으면 무조건 수행
		//case값은 반드시 순차적이지 않아도 된다
		/*
		switch(50) {
		case 10 : System.out.println("SEOUL");  break;
		case 20 : System.out.println("JEJU");   break;
		case 30 : System.out.println("BUSAN");  break;
		default : System.out.println("기타...");  break;
		}
		*/
		
		//break문이 없으면 계속해서 switch안에서 수행된다
		switch(20) {
		case 10 : System.out.println("SEOUL");  break;
		case 20 : System.out.println("JEJU");  
		case 30 : System.out.println("BUSAN");  break;
		default : System.out.println("기타...");  break;
		}
	
	}//main() end
}//class end
