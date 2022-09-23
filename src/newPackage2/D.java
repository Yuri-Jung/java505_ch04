package newPackage2;

public class D {
    public String model;
    public String type;
    public String fuel;
    private String color;
    private String size;
//    클래스 내부에서만 사용
//    클래스의 멤버끼리만 사용

    public void GetMyCarInfo(){
        System.out.println("색상 : " + this.color + "\n크기: " + this.size);
    }

    public void setMyCarInfo(String color, String size){
        this.color = color;
        this.size = size;
    }
}
