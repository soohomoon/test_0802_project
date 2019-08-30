package ch0_OT;

enum EngineType{ gasoline, gas, hybrid}
enum Transmission { auto_6, auto_8}
enum EngineSize{
    Theta(2.4), GDI(3.0), GDI_(3.3);
    double value;
    private EngineSize(double value){
        this.value = value;
    }
    public double getValue(){
        return value;
    }
}
 

public class variable_Location {
	
	public static int LENGTH = 4930;
	public static int HEIGTH = 1470;
	public static int WIDTH = 1865;
	public static int WHEELBASE = 1845;
	
	EngineType eningetype;
	Transmission transmission;
	EngineSize eningesize;
	
	variable_Location(){
		this.eningetype = EngineType.gasoline;
		this.transmission = Transmission.auto_6;
		this.eningesize = EngineSize.Theta;
	}
	
	variable_Location(EngineType eningetype, Transmission transmission, EngineSize enginesize){
		this.eningetype = eningetype;
		this.transmission = transmission;
		this.eningesize = enginesize;
	}
	

	public String toString() {
		return "그랜저IG 의 전장은 " + LENGTH + " 전폭은 " +WIDTH+ " 전고는 " +HEIGTH+ " 축거는 " +WHEELBASE+ " 입니다\n"
				+"그랜저IG 의 엔진타입은 " + eningetype + " 미션은 " +transmission+ " 엔진크기는 " +eningesize+ +eningesize.getValue() + " 입니다";
	}
	
	
	

	public static void main(String[] args) {
		variable_Location car1 = new variable_Location();
		System.out.println(car1.toString());
		variable_Location car2 = new variable_Location(EngineType.gasoline, Transmission.auto_8, EngineSize.GDI);
		System.out.println(car2.toString());
	}
}

