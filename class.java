package oop0830;		//현재 클래스의 저장위치
						//<-한번만 선언한다

//클래스를 사용하려면 저장위치(package)를 선언하고 사용한다
import java.io.*;
import java.sql.*;
import java.util.Arrays;		//해당 클래스 직접 선언
import java.util.*;
import java.awt.*;				//Chapter 13 GUI 프로그래밍 참조
import javax.swing.*;			//Chapter 13 GUI 프로그래밍 참조	
import oop0827.*;

/*
 		Access Modifier 접근제어, 접근수정
 		->private		비공개, 클래스 내부에서만 접근 가능하다. 은폐
 		->package		생략한다. 현재 package(oop0830)내에서만 접근가능하다
 		->protected		상속관계에 있는 클래스가 다른 패키지에 있는 경우
 		->public		공개. basic01_java 프로젝트 내에서 모두 접근 가능
 */


class Sungjuk { //package 생략되어 있음
				//package class Sungjuk
				//클래스명의 첫 글자는 대문자로 한다
		//멤버변수 field
		public String name;		//클래스 외부에서 접근 가능하다
		int kor, eng, mat;		//package가 생략되어 있다
		private int aver;		//Sungjuk 클래스 내부에서만 접근 가능하다
		//private은 class 내부에서만 사용 가능 !!
		
		
		//멤버함수 method
		private void view() {}//view() end
		
		void calc() {//package 생략 가능
			//클래스 내부의 멤버들 간에는 Access Modifier와 상관없이 접근 가능하다
			//view();
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



public class Test01_class {

	public static void main(String[] args) {
		//[교재] Chapter 11 객체지향 프로그래밍의 기초
		//		SECTION 01 클래스
		//		SECTION 02 생성자
		
		
		//클래스 class
		//->클래스명의 첫 글자는 대문자로 한다
		//->구성멤버 : 멤버변수(field) + 멤버함수(method)
		
		//System.out.println(Math.PI);  		//멤버변수
		//System.out.println(Math.abs(-3));  	//멤버함수
		
		//new 연산자
		//->클래스를 사용하려면 메모리를 할당하고 사용한다
		//->형식) new 생성자함수()
		//->객체(Object)라 한다
		
		
		//객체 지향 프로그램 (Object Oriented Program)
		
		//기본 자료형
		//int a=3; 기본 자료형으로 a 변수를 선언하고 3을 저장
		//		   int는 메모리 4바이트 할당
		
		
		//참조(reference) 자료형 -> 클래스
		//Random Access Memory(RAM)의 heap 영역에 메모리가 할당되고 주소값이 발생된다
		new Sungjuk();		//객체선언
//------------------------------------------------------------------------------
		
		//Sungjuk 클래스는 사용자 정의 자료형
		//sj 참조변수 (reference)
		Sungjuk sj = new Sungjuk();  //번지 수 발생
		
		//. 연산자
		//->참조 변수를 통해 객체에 접근하는 연산자
		sj.name = "손흥민";
		sj.kor = 100;
		sj.eng = 95;
		sj.mat = 90;
		
		System.out.println(sj.name);
		System.out.println(sj.kor);
		System.out.println(sj.eng);
		System.out.println(sj.mat);
		
		sj.calc();
		sj.disp();
		
		//sj.aver() 에러!
		//->private 속성은 클래스 외부에서 접근 불가능
		
		//sj.view() 에러!
		//->private 속성은 클래스 외부에서 접근 불가능
//------------------------------------------------------------------------------
		
		//c는 참조변수
		Sungjuk c = new Sungjuk(); //#200번지를 참조하고 있음
		c.name = "홍길동";
		c.kor = 70;
		c.eng = 75;
		c.mat = 90;
		c.calc();
		c.disp();
		
//------------------------------------------------------------------------------
		
		//참조변수가 가지고 있는 객체의 주소값
		System.out.println(sj.hashCode());
		System.out.println(c.hashCode());
		
		Sungjuk tmp = sj;
		System.out.println(tmp.hashCode());
		
		tmp.disp();
		
		
	}//main() end
}//class end
