package oop0831;

class Score{
	//멤버변수 field
	private String name ="손흥민";
	private int kor, eng, mat;
	private int aver;
	
	//생성자 함수 constructor  //클래스명과 이름이 동일함
	//생성자 함수를 오버로딩(하나 더 만들기)를 하면 기본 생성자 함수는
	//자동으로 생성되지 않는다
	//그래서 기본 생성자 함수는 수동으로 생성할 것을 추천 !!
	public Score() {}
	
	public Score (String name, int kor, int eng, int mat) {
		//this.멤버변수 = 지역변수
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.aver = (kor+eng+mat) / 3;
	}
	
	
	//멤버함수 method
	public void disp() {
		//지역변수의 우선순위가 가장 높다
		String name ="박지성";		//disp 함수에서만 사용 가능
		System.out.println(name);
		
		//this.멤버변수
		System.out.println(this.name);	//손흥민
		System.out.println(this.kor);
		System.out.println(this.eng);
		System.out.println(this.mat);
		System.out.println(this.aver);
	}//disp() end
}

public class Test01_this {

	public static void main(String[] args) {
		// this
		//->클래스가 자신을 가리키는 대명사
		//->일반 지역변수와 멤버변수를 구분하기 위함
		
		//this()
		//->자신의 생성자 함수를 호출
//------------------------------------------------------------------------------
		//new Score(); 객체 Object 선언
		//one 참조변수(reference)
		/*
		Score one = new Score();		//변수 선언과 형태가 비슷
		one.disp();
		
		Score two = new Score("김연아", 100, 95, 80);	//객체 선언과 동시에 초기값 설정 가능
		two.disp();
		
		Score three = new Score("무궁화", 40, 30, 50);
		three.disp();
		
		//객체 지향 프로그램 특징 : 은폐, 캡슐화
		
		//객체가 참조하고 있는 주소
		System.out.println(one.hashCode());
		System.out.println(two.hashCode());
		System.out.println(three.hashCode());
		
		//객체 생성(메모리할당)의 여부를 확인
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		
		//메모리에 값을 없앰(null)
		one = null;
		System.out.println(one);
		*/
//------------------------------------------------------------------------------
		/*
		Score kim = new Score("봉선화", 70, 85, 100);
		Score lee = new Score("라일락", 60, 65, 30);
		Score park = new Score("봉선화", 40, 20, 90);
		*/
		
		//객체 배열
		Score[] score = {
				new Score("봉선화", 70, 85, 100), //100번지
				new Score("라일락", 60, 65, 30),	//200번지
				new Score("진달래", 40, 20, 90)	//300번지
		};
		
		/*
        +---------+---------+--------+
        |  #100   |  #200   |  #300  |
        +---------+---------+--------+
         score[0]   score[1]  score[2]
		*/
		
		int size = score.length;	//size = 3;
		
		score[0].disp();
		score[1].disp();
		score[2].disp();
		
		for (int i=0; i<size; i++) {
			score[i].disp();
		}//for end
		
		
	}//main() end
}//class end
