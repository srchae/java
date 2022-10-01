package oop0823;

public class Test02_continue {

	public static void main(String[] args) {
		//continue  : 반복문 계속 실행
		//break		: 반복문 빠져나옴
		
		for(int a=1; a<10; a++) {
			if(a==5) {
				break;
			}//if end
			System.out.println(a + " ");
		}//for end
		
		System.out.println(); //줄바꿈
		
		for(int b=1; b<10; b++) {
			if(b==5) {
				continue;	//b가 5가 될 때 유턴해서 다시 조건 실행
			}//if end
			System.out.println(b + " ");
		}//for end
		
		
	}//main() end

}//class end
