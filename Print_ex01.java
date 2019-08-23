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
		//Ŭ���������� �ٲٴ� �޼���;
	}
	
	public void changeLocalVariable(String name, int number){
		String localName = name;
		int localNumber = number;
		System.out.println(localName +" and " + localNumber + " are changed by this method but it is just local");
		//���������� �����ϰ� �ٷ�� �ż���
	}
	
	
	
	
	
}

public class Print_ex01 extends pa {
	
	String name;
	int number;
	
	Print_ex01(){
		//��ӵ� Ŭ������ �����ڸ� �����Ҷ��� �θ��� �����ڸ� �ڵ����� �����Ѵ�
		//super(); �� �����Ǿ� �ִ�
		//�����ھȿ��� Ŭ���������� ������ �ȵǾ� �ֱ⿡ name�� number�� ����Ʈ ���� ���´�
		System.out.println("Child's constractor is made.");
		System.out.println(this.name + " is made and age is " + this.number);
		System.out.println("Child is done");
		
	}
	
	Print_ex01(String pname, int pnumber, String name, int number){
		super(pname, pnumber);
		//�θ��� �����ڸ� �ڵ����� ȣ���ϴµ� ���� super(parameter) �� ���ٸ� ����Ʈ �����ڸ� ȣ���Ѵ�
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
		//Ŭ���������� �ٲٴ� �޼���;
		//�������̵�
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
