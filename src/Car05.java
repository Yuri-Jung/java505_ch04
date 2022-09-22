public class Car05 {
    public String name;
    public String type;
    public String size;
    public String size1;
    public String color;

//    this() : 생성자가 자신의 다른 생성자를 호출하는 명령어

    public Car05(String carName, String carType, String carSize, String carColor){
        name = carName;
        type = carType;
        size = carSize;
        color = carColor;
    }

    public Car05(String carName, String carType, String carSize){
        this(carName,carType,carSize,"white");
        name = carName;
        type = carType;
        size = carSize;
        color = "white";
    }

    public Car05(String carName, String carType){
//        this(carName,carType,"대형","white");

//        name = carName;
//        type = carType;
//        size = "대형";
//        color = "white";
    }
    public Car05(String carName){
        this("그랜저","세단");
//        this(carName,"세단","대형","그랜저");
//        name = carName;
//        type = "세단";
//        size = "대형";
//        color = "white";
    }
    public Car05(){
//        생서자 호출하면서 실행
//        this("그랜저","세단","대형","white");

        this("그랜저"); //위에 꺼에 넣는다.
//        name = "그렌저";
//        type = "세단";
//        size = "대형";
//        color = "white";
    }



// 메서드 오버로딩 : 이름이 같은 메서드를 여러개 선언하는 것.
//    조건 : 매개변수의 타입, 개수, 순서 중 하나라도 다르면 된다.
//    메서드 오버로딩 사용하는 이유 : 비슷한 기능을 제공하는 메서드를 여러 개 생성시
//    각각 다른 이름을 제공하는 것보다 동일한 이름을 사용하는 것이 편리하기 때문
    public void getInfo(){
        System.out.println("이름 : " + name + "\n차종 : " + type + "\n크기 :" +
                size + "\n색상 : " + color);
        System.out.println("--------");
    }
    public void getInfo(String gas){
        System.out.println("이름 : " + name + "\n차종 : " + type + "\n크기 :" +
                size + "\n색상 : " + color + "\n연료 : "+ gas);
        System.out.println("--------");

    }
    public void getInfo(String gas, int price){
        System.out.println("이름 : " + name + "\n차종 : " + type + "\n크기 :" +
                size + "\n색상 : " + color + "\n연료 : "+ gas + "\n가격 : " + price);
        System.out.println("--------");

    }

    public void getInfo(String gas, String price){
        System.out.println("이름 : " + name + "\n차종 : " + type + "\n크기 :" +
                size + "\n색상 : " + color + "\n연료 : "+ gas + "\n가격 : " + price);
        System.out.println("--------");

    }

    public void getInfo(int price, String gas){
        System.out.println("이름 : " + name + "\n차종 : " + type + "\n크기 :" +
                size + "\n색상 : " + color + "\n연료 : "+ gas + "\n가격 : " + price);
        System.out.println("--------");

    }
}
