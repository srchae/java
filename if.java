package oop0820;

public class Test02_if {

	public static void main(String[] args) {
		//제어문
		//-> 프로그램의 흐름을 제어
		//-> 조건문 (boolean으로 판단 => T/F) : 
		// if문, switch~case문
		//-> 반복문 : for문, while문, do~while문
		//-> break문, continue문
		
		
		//if 조건문 형식
		/*
		 	if(조건) {	조건이 true이면 처리 	}
		 	
		 	if(조건) {	조건이 true이면 처리		}
		 	else {	 조건이 false이면 처리	}

		 	if(조건1) {		조건1이 true이면 처리		}
		 	else if(조건2) {		조건2이 true이면 처리	}
		 	else if(조건3) {		조건3이 true이면 처리	}
		 	else if(조건4) {		조건4이 true이면 처리	}
		 	else {	조건1~4까지 만족하지 않으면 무조건 처리	}
		 */
//-------------------------------------------------------------
		
		//성적 프로그램
		String name="코로나";
		int kor=30, eng=100, mat=100;
		
		//평균 구하기
		int aver=(kor+eng+mat)/3;
		
		//출력
		System.out.printf("이름:%s\n", name);
		System.out.printf("국어:%d\n", kor);
		System.out.printf("영어:%d\n", eng);
		System.out.printf("수학:%d\n", mat);
		System.out.printf("평균:%d\n", aver);
		
		//문1)평균이 95점이상이면 "장학생"
        if (aver>=95) {
        	System.out.println("장학생");
        }
        //문2)국어점수가 70점이상이면 "합격" 아니면 "불합격"
        if (kor>=70) {
        	System.out.println("합격");
        }
        else {
        	System.out.println("불합격");
        }
        //문3)수학점수가 90점이상이면 "A"
        //           80점이상이면 "B"
        //           70점이상이면 "C"
        //           60점이상이면 "D"
        //           나머지 "F"
        if (mat>=90) {
        	System.out.println('A');
        }
        else if (mat>=80) {
        	System.out.println('B');
        }
        else if (mat>=70) {
        	System.out.println('C');
        }
        else if (mat>=60) {
        	System.out.println('D');
        }
        else {
        	System.out.println('F');
        }
System.out.println("---------------------------------------------");
       
		//문4)과락
        // 평균이 70점 이상이면 결과는 합격
        // (단, 국영수 세 과목 중에서 한 과목이라도 40점 미만이 나오면 결과는 재시험)
        // 평균이 70점 미만이면 결과는 불합격
        
		// 내가 짠 코드 
        /*if (aver>=70) {
        	System.out.println("합격");
        	if (kor<40 || eng <40 || mat <40) {
        		System.out.println("재시험");
        	}
        }
        else if(aver<70) {
        	System.out.println("불합격");
        }*/
		



		// OR 연산자를 활용한 코드
		/*if(aver>=70) {
			if(kor<40 || eng<40 || mat<40) {
				System.out.println("결과는 재시험");
			}
			else {
				System.out.println("결과는 합격");
			}
		}
		else {
				System.out.println("결과는 불합격");
		}*/
		
		// AND 연산자를 활용한 코드
		if(aver>=70) {
			if(kor>40 && eng>40 && mat>40) {
				System.out.println("합격");
			}
			else {
				System.out.println("재시험");
			}
		}
		else {
			System.out.println("불합격");
		}
        
        
        
        
		
	}//main() end

}//class end
