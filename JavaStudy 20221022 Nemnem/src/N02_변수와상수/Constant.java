package N02_변수와상수;

public class Constant {

	public static void main(String[] args) {
		// 변수는 카멜 표기법 사용
		final int maxNum = 100;
		final int minNum = 0;
		
		
		// 상수는 모두 대문자를 사용.
		// 한 번 초기화한 이후에는 바꿀 수 없음.
		final int MAX_NUMBER = 100;
		final int MIN_NUMBER = 0;
		
		// 선언은 한 번만 함.
		int number = 10;
		number = 80; // 이렇게 재선언 가능.
		
		System.out.println("최소값 : " + MAX_NUMBER);
		System.out.println("최소값 : " + MIN_NUMBER);
		System.out.println("최소값 : " + number);

	}

}
