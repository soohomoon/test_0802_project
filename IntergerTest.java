package ch0_OT;

public class IntergerTest {

	public static void main(String[] args) {
		
		float f2 = 3.14f;
		double d1 = 3.14;
		double d2 = 3.14e2;//e2는 *10^2
		System.out.println(d1);
		System.out.println(d2);
		
		double d3 = 3.14e-2;// e-2 는 * 10^-2
		System.out.println(d3);
		
		float f3 = 0.1234567890123456789f; //소수점 10자리까지만 표현 가능 10^-10 ~ 10^10 -1
		double d4 = 0.1234567890123456789; 
		System.out.println(f3);
		System.out.println(d4);
		
		
	}

}
