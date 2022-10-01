package oop0826;

public class Test02_method {

	//메소드 작성 영역
	//void : 리턴 값이 없다는 뜻
	public static void test1() {
		System.out.println("JAVA");
		test2();	//함수는 서로 호출할 수 있다
	}//test1() end
	
	
	
	public static void test2() {
		System.out.println("PYTHON");
		//함수는 호출한 시점으로 돌아간다 => return
		return;		//마지막 return 명령어는 생략 가능하다
	}//test2() end
	
	
	
	public static void test3(int a) {	//a는 매개변수
		System.out.println(a);
		return;
	}//test3() end
	
	
	
	public static void test4(int a, int b, int c){
		//매개변수는 개별적으로 선언한다
		System.out.println(a+b+c);
		return;
		
	}//test4() end 
	
	
	
	public static void test5(double a, double b) {
		System.out.println(a+b);
		return;
		
	}//test5() end
	
	
	//문) '#' 기호 100번 출력하기
	public static void test6(char ch, byte num) {
		for (int i=1; i<=num; i++) {
			System.out.print(ch + " ");
		}//for end
	}
	
	public static void main(String[] args) {
		//[교재]
		//Chapter 09 문자열과 메소드
		//			SECTION 02 메소드
		//			SECTION 04 메소드와 반환 결과 매개변수
		
		//Method *****
		//함수, function
		//-> 일정한 기능을 가지고 있는 것
		//-> 형식) 리턴형 함수명() {}
		
		/*
		  	식별자 : 프로젝트명 basic01_java
		  			패키지명 oop0826
		  			클래스명 Test02_method 첫 글자는 대문자로 한다 
		  			변수명, 함수명
		  			
		  	test	변수
		  	"test"	문자열 상수
		  	test() 	함수
		  	
		  	사용자 정의 함수 (user defined)
		  	-> 함수 작성 시 고려사항 : 매개변수(parameter), 리턴값
		  	-> 함수는 정의(작성)하고, 함수를 호출함으로써 수행된다
		  	//필요할 때마다 불러서 사용한다
		  	
		  	함수명 작성 규칙
		  	->is함수명() : 리턴값이 대부분 boolean형
		  	//is가 붙는 함수명은 묻는 함수명으로 사용된다.
		  	->get함수명() : 대부분은 리턴값이 있다
		  	->set함수명() : 대부분은 void형
		  	->to 함수명()
		  	 
		 */
//------------------------------------------------------------------------------

		//함수 호출
		/*
		System.out.println(); 				//콘솔창 출력
		System.out.println(Math.pow(2, 4)); //2의 4승
		System.out.println(Math.sqrt(4));   //4루트값
		*/

//------------------------------------------------------------------------------
		
		//1) 전달값(argument value)이 없는 경우
		/*
		test1();	//함수 호출
		
		test2();
		*/
		
//------------------------------------------------------------------------------
		
		//2) 전달값(argument value)가 있는 경우
		test3(10); 
		test3(50);
		test3(90);
		System.out.println("------");
		//전달값은 1개 이상 가능하다
		test4(7, 8, 9);
		test4(3, 2, 1);
		test5(1.2, 3.4);
		
		//문) '#' 기호 100번 출력하기
		byte num = 100;
		test6('#', num);
		
	}//main() end
}//class end
