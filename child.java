package ch0_OT;




public class child extends pa {
	
	String name;
	int number;
	
	child(){
	
		System.out.println("Child's constractor is made.");
		System.out.println(this.name + " is made and age is " + this.number);
		System.out.println("Child is done");
	
		
	}
	
	child(String name, int number){
		super(name, number);
		this.name = name;
		this.number = number;
		System.out.println("Child's constractor is made.");
		System.out.println(this.name + " is made and age is " + this.number);
		System.out.println("Child is done");
		
	}
	
	
	child(String pname, int pnumber, String name, int number){
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
		//인스턴스변수를 바꾸는 메서드;
		//오버라이딩
	}
	

	public String toString1() {
		return "child's class" + " name : " + this.name + " number : " + this.number;
		
	}
	
	
	public static void main(String[] args) {
		
	//	child c1 = new child();
	//	c1.changeVariable("Alice", 59);
	//	System.out.println(c1.toString1());
	//	System.out.println(c1.toString());
		child c2 = new child("Bob", 34);
		
		//Print_ex01 new2 = new Print_ex01("bob", 32, "sunny", 6);
	//	  pa pnew2 = new pa();
		 // pa pnew1 = new pa("Alice", 45);
         // pnew2.changeVariable("Kim", 55);
		/* 
		 new1.changeLocalVariable("King", 45);
		 pnew2.changeLocalVariable("Queen", 33);
		 System.out.println(new1.name + " is made and age is " + new1.number);
		 System.out.println(pnew2.name + " is made and age is " + pnew2.number);
		 
		 new1.changeVariable("Ryan", 97);
		 pnew2.changeVariable("Queens Park", 53);
		 System.out.println(new1.name + " is made and age is " + new1.number);
		 System.out.println(pnew2.name + " is made and age is " + pnew2.number);
		*/
		  
		 

	}

}
