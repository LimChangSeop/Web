package N02_변수와상수;

public class Cast {

	public static void main(String[] args) {
		
		// 업캐스팅 할 때 순서 문자 -> 정수 -> 실수
		char a = 'A';
		int b = a;
		double c = b;
		
		System.out.println(b);
		System.out.println(c);
		
		// 다운 캐스팅 할때는 명시를 해줘야 한다.
		int d = (int) c;
		char e = (char) d;
		
		System.out.println(d);
		System.out.println(e);
		
		// char은 바로 double로 넣지 못함. 무조건 int로만 가능.
	}
 
}
