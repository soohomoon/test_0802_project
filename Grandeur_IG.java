 

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

public class Grandeur_IG {
    
    public static int LENGTH = 4930;
    public static int HEIGTH = 1470;
    public static int WIDTH = 1865;
    public static int WHEELBASE = 2845;
    
    String result; 
    EngineType enginetype;
    Transmission transmission;
    EngineSize enginesize;
    
    Grandeur_IG(){
        this.enginetype = EngineType.gasoline;
        this.transmission = Transmission.auto_6;
        this.enginesize = EngineSize.Theta;
    }
    
    Grandeur_IG(EngineType enginetype, Transmission transmission, EngineSize enginesize){
        this.enginetype = enginetype;
        this.transmission = transmission;
        this.enginesize = enginesize;
    }
    

        public String toString() {
            String result = "그랜저IG 의 전장은 " + LENGTH + " 전폭은 " +WIDTH+ " 전고는 " +HEIGTH+ " 축거는 " +WHEELBASE+ " 입니다\n"
                +"그랜저IG 의 엔진타입은 " + enginetype + " 미션은 " +transmission
                + " 엔진크기는 " +enginesize+ +enginesize.getValue() + " 입니다";
        return result;
    }
}