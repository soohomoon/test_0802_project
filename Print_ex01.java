package ch0_OT;


class pa {
	String name;
	int number;
	
	
	
	pa(){
		System.out.println("Parent's constractor pa() is made.");
		System.out.println(this.name + " is made and age is " + this.number);
		System.out.println("Parent is done");
			
	}
	
	pa(String name, int number){
		this.name = name;
		this.number = number;
		System.out.println("Parent's constractor pa(parameter) is made.");
		System.out.println(this.name + " is made and age is " + this.number);
		System.out.println("Parent is done");
	}
	
	public void changeVariable(String name, int number){
		this.name = name;
		this.number = number;
		System.out.println(this.name +" and " + this.number + " are changed by this method");
		//클래스변수를 바꾸는 메서드;
	}
	
	public void changeLocalVariable(String name, int number){
		String localName = name;
		int localNumber = number;
		System.out.println(localName +" and " + localNumber + " are changed by this method but it is just local");
		//지역변수를 선언하고 다루는 매서드
	}
	
	
	
	
	
}

public class Print_ex01 extends pa {
	
	String name;
	int number;
	
	Print_ex01(){
		//상속된 클래스의 생성자를 생성할때는 부모의 생성자를 자동으로 생성한다
		//super(); 가 생략되어 있다
		//생성자안에서 클래스변수의 선언이 안되어 있기에 name과 number에 디폴트 값이 나온다
		System.out.println("Child's constractor is made.");
		System.out.println(this.name + " is made and age is " + this.number);
		System.out.println("Child is done");
		
	}
	
	Print_ex01(String pname, int pnumber, String name, int number){
		super(pname, pnumber);
		//부모의 생성자를 자동으로 호출하는데 따로 super(parameter) 가 없다면 디폴트 생성자를 호출한다
		this.name = name;
		this.number = number;
		System.out.println("Child's constractor is made.");
		System.out.println(this.name + " is made and age is " + this.number);
		System.out.println("Child is done");
	}
	
	public void changeVariable(String name, int number){
		this.name = name;
		this.number = number;
		System.out.println(this.name +" and " + this.number + " are changed by this method");
		//클래스변수를 바꾸는 메서드;
		//오버라이딩
	}
	
	
	public static void main(String[] args) {
		
		 Print_ex01 new1 = new Print_ex01();
		//Print_ex01 new2 = new Print_ex01("bob", 32, "sunny", 6);
		  pa pnew2 = new pa();
		// pa pnew1 = new pa("Alice", 62);
         // pnew2.changeVariable("Kim", 55);
		 
		 new1.changeLocalVariable("King", 45);
		 pnew2.changeLocalVariable("Queen", 33);
		 System.out.println(new1.name + " is made and age is " + new1.number);
		 System.out.println(pnew2.name + " is made and age is " + pnew2.number);
		 
		 new1.changeVariable("Ryan", 97);
		 pnew2.changeVariable("Queens Park", 53);
		 System.out.println(new1.name + " is made and age is " + new1.number);
		 System.out.println(pnew2.name + " is made and age is " + pnew2.number);
		

	}

}
