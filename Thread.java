package oop0907;

class MyThread1{
	private int num;
	private String name;
	
	public MyThread1() {}
	public MyThread1(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public void start() {
		run();
	}//start() end
	public void run() {
		for(int a=0; a<num; a++) {
			System.out.println(name + ":" + a);
		}//for end
	}//run() end
	
}//class end (쓰레드를 사용하지 않는 경우)

public class Test01_Thread {

	public static void main(String[] args) {
		//[교재] Chapter 14 고급 프로그래머로 나아가기 - SECTION 03 스레드
		
		//Thread 클래스
		//->하나의 프로그램이나 하나의 메소드가 CPU 자원을 전부 점유하는 것을 막을 수 있다
		
		//1)쓰레드를 사용하지 않는 경우
		MyThread1 t1 = new MyThread1(1000, "*");
		MyThread1 t2 = new MyThread1(1000, "**");
		MyThread1 t3 = new MyThread1(1000, "***");
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}//main() end
}//class end
