package newPackage2;

public class AccessEx {
    public static void main (String[]args){
        D avante = new D();

        avante.model = "아반테";
        avante.type = "세단";
        avante.fuel = "가솔린";
//        avante.color="dd"; 오류난다. private
    }
}
