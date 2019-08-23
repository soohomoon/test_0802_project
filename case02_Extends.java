package ch0_OT;

enum Engine{ diesel, gasoline, gas}
enum Transmission { auto, manual}
enum GearSpeed {seepd_6, speed_8}

class parent {
	
	private boolean choice;
	
	private Engine eType;
	private Transmission mType;
	private GearSpeed gSpeed;
	
	parent(){
		eType = Engine.gasoline;
		mType = Transmission.manual;
		gSpeed =GearSpeed.seepd_6;
		
	}
	
	
	
	/*
	parent(Engine eType, Transmission mType, GearSpeed gSpeed){
		this.mType = mType;
		this.eType = eType;
		this.gSpeed = gSpeed;
	}
	*/
	
	public void applyYourChoice(Engine eType, Transmission mType, GearSpeed gSpeed) {
		if(isChoosed()) {
			changeOption(eType, mType,gSpeed);
		}else {
			returnOriginal();
		}
	}
	
	private void changeOption(Engine eType, Transmission mType, GearSpeed gSpeed) {
		this.mType = mType;
		this.eType = eType;
		this.gSpeed = gSpeed;
	}
	
	private void changeOne(Transmission mType){
		this.mType = mType;
	}
	
	private void changeOne(Engine eType){
		this.eType = eType;
	}
	
	private void changeOne(GearSpeed gSpeed){
		this.gSpeed = gSpeed;
	}
	
	private void returnOriginal() {
		eType = Engine.gasoline;
		mType = Transmission.manual;
		gSpeed =GearSpeed.seepd_6;
	}
	
	public void turnChoice() {
		if(choice) {
			choice = false;
		}else {
			choice = true;
		}
	}
	
	public String toString(){
				
		return "This vehicle's information : " + eType.name() +", "+  mType.name() +", " + gSpeed.name();
	}
	
	public boolean isChoosed() {
		return choice;
	}
	
}

public class case02_Extends extends parent {
	
	



	
	
	
	public static void main(String[] args) {
		parent pa = new parent();
		System.out.println(pa.toString());
	}

}
