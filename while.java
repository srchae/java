package oop0823;

public class Test03_while {

	public static void main(String[] args) {
		//while 반복문
		//형식) while(조건) {		조건이 true이면 수행		}
		//while(true) {} 무한LOOP
		
		int a=1;
		while(a<=3) {
			System.out.println(a+"JAVA");
			a=a+1; //a가 증가하여 다시 while로 감
			
		}//while end
		/*
		 	while(1<=3) {1JAVA a=1+1}
		 	while(2<=3) {2JAVA a=2+1}
		 	while(3<=3) {3JAVA a=3+1}
		 	while(4<=3) -- X (코드 미실행)
		 */
		
//----------------------------------------------------
		
		//do-while 반복문
		/*
		 	do {
		 		조건이 true이면 수행
		 	}while(조건);
		 */
		int b=1;
		do {
			System.out.println(b+"Python");
			b=b+1;
		}while(b<=3);
		/*
		 	do { 1Python b=1+1 } while(2<=3)
		 */
		
		
		
		
//--------------------------------------------------
		//do~while 반복문

	}//main() end

}//class end
