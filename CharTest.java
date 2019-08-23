package ch0_OT;

public class CharTest {
	
	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = '\u0041';
		
		System.out.println("print latter : " + c1 + '\t' + c2 + '\n');
		
		int i = c1 +1;
		System.out.println(i);
		System.out.println((char)i);
		
		boolean b1 = true;
		
		if(b1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		
	}

}
