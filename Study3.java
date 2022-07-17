package study0421;
import java.util.Scanner;
public class Study3 {
	int a=100;
	String name = "홍길동";	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int a=100;
		String name = "홍길동";		
		Test test = new Test();
		Test test2 = new Test();
		Study3 study3 = new Study3();
		System.out.println("Test클래스이 값 a : " + test.a);
		System.out.println("Test클래스이 값 name : " + test.name);		
	}
}
class Test
{
	int a=100;
	String name = "홍길동";
}
class Test2
{
	int a=200;
	String name = "홍길동2";
}