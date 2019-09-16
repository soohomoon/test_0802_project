
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
	
	}
	

	public String toString1() {
		return "child's class" + " name : " + this.name + " number : " + this.number;
		
	}
	
	
	public static void main(String[] args) {
		
	}

}
