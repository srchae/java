package oop0830;

import java.util.GregorianCalendar;


class School {
		//멤버변수 field
		private String name;	//private을 사용함으로써 외부 접근을 차단 
		private int kor, eng, mat;
		private int aver;
		
		//생성자 함수 constructor
		//->클래스명과 동일한 함수
		//->리턴형이 없다
		//->public void School() {} 주의 !!
		
		//변수는 private이 붙고 함수는 public이 붙는 것이 일반적 !!

		public School() {//괄호안에 매개변수가 x -> 기본 생성자 함수 default constructor
						 //자동으로 생성된다
			System.out.println("School()...");
		}//end
		
		//생성자 함수도 오버로딩(함수명 중복성의)이 가능하다
		public School(String n) {
			name = n;
		}//end
		
		public School(int k, int e, int m) {
			kor = k;
			eng = e;
			mat = m;
			
		}//end
		
		
		public School(String n, int k, int e, int m) {
			name = n;
			kor = k;
			eng = e;
			mat = m;
		}//end
		
		
		
		
		//멤버함수 method
				
		public void calc() {//package 생략 가능
			aver = (kor+eng+mat) / 3;
		}//calc() end
				
		public void disp() {
			System.out.println(name);
			System.out.println(kor);
			System.out.println(eng);
			System.out.println(mat);
			System.out.println(aver);
		}//disp() end
		
		
		
}//class end


public class Test02_constructor {

	public static void main(String[] args) {
		//생성자 함수 constructor
		//->클래스명과 동일한 함수
		//->new 연산자 함께 메모리 할당할 때 사용한다
		//->오버로딩이 가능하다
		
		//소멸자 함수 destructor -> 자바에는 없음 !!
		//가비지 콜렉팅(Garbage Collecting)
		//->JVM이 자동으로 메모리 회수를 함
		
		/*
		GregorianCalendar today = new GregorianCalendar();
		if(today.isLeapYear(2020)) {
			System.out.println("윤년");
		}
		else {
			System.out.println("평년");
		}//if end
		
		//문)서기 1년~서기 2021년까지 윤년의 갯수를 구하시오
		//1)GregorianCalendar클래스 활용
		int count1 = 0;
		for (int y=1; y<=2021; y++) {
			if(today.isLeapYear(y)) {
				count1++;
			}//if end
		}//for end
		System.out.println(count1);// 502
		
		//2)윤년 구하는 공식
		int count2 = 0;
		for (int y=1; y<=2021; y++) {
			if (y%4==0 && y%100!=0 || y%400==0) {
				count2++;
			}
		}
		
		System.out.println(count2); //490
		*/
//------------------------------------------------------------------------------
		
		//new School();	//객체 Object 선언
		//new School();	
		/*
		School one = new School();
		System.out.println(one.hashCode()); //주소값
		one.calc();
		one.disp();
		
		//null 비어있는 값
		String a = "";		//빈 문자열
		String b = null;	//메모리 할당은 하지 않고 b라는 참조변수 선언만 해 놓음
		System.out.println(a.length());		//글자갯수 0
		System.out.println(b.length());		//NullPointerException
		
		System.out.println("null");		//문자열상수
		System.out.println(true);		//boolean형
		System.out.println("true");		//문자열상수
		*/
//------------------------------------------------------------------------------
		
		//생성자 함수의 전달값은 객체 선언과 동시에 초기값을 전달해 주는 역할을 한다
		School two = new School("개나리");
		two.calc();
		two.disp();
		
		School three = new School(70, 80, 90);
		three.calc();
		three.disp();
		
		School four = new School("진달래", 10, 20, 30);
		four.calc();
		four.disp();
		
//------------------------------------------------------------------------------
		
		String str1 = "손흥민";
		String str2 = new String("박지성"); //메모리할당과 동시에 변수에 저장해줌
		System.out.println(str1);
		System.out.println(str2);
		
		
		
		
	}//main() end
}//class end
