package oop0824;

public class Test02_array {

	public static void main(String[] args) {
		//배열 Array
		//[교재] Chapter 08 배열
		/*
			- 연속성 자료형, 열거형
			- 하나의 변수에 1개 이상의 동일한 자료형의 값을 저장할 수 있는 공간
			- element, 요소, 원소
			- index, 순서, 색인 (0부터 시작해서 1씩 증가한다)
			- 1차원 배열 : [열]
			- 2차원 배열 : [행] [열]
			- 3차원 배열 : [면] [행] [열] 자바에는 없는 문법
			- 열, 칸, column
			- 행, 줄, row
			- new 연산자 : 메모리 할당(확보) 연산자
			
		 */
//--------------------------------------------------------------
		
		//배열 선언
		/*
		int [] kor = new int [3];	//4바이트 *3 -> 12바이트 메모리 할당
		kor[0] = 10;	//배열 요소의 인덱스는 0부터 시작된다
		kor[1] = 20;	//배열 요소의 인덱스는 1씩 증가한다
		kor[2] = 30;	//
		System.out.println(kor[0]);
		System.out.println(kor[1]);
		System.out.println(kor[2]);
		
		/*
		kor[3]=50;
		System.out.println(kor[3]); 에러! (kor의 3번째 요소는 존재하지 않음)
		 */
		
		/*
		//kor 배열 요소의 갯수
		System.out.println(kor.length); //3
		*/
//-----------------------------------------------------------
		
		//메모리 할당 및 초기값 지정
		int[] eng = {40, 50, 60}; // 알아서 메모리가 할당됨
		
		for (int i=0; i<eng.length; i++) {
			System.out.println(eng[i]);
		}
		
//-----------------------------------------------------------
		
		
		double[] ave = {1.2, 3.4, 5.6};
		for (int i=0; i<ave.length; i++) {
			System.out.println(ave[i]);
		}
		
//-----------------------------------------------------------
		

		char[] ch = {'H','E', 'L', 'L','O'};
		for (int i=0; i<ch.length; i++) {
			System.out.println(ch[i]);
		}
		
//-----------------------------------------------------------
		

		String[] name = {"진달래", "개나리", "무궁화"};
		for (int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		
		
		
		
		
	}//main() end
}//class end
