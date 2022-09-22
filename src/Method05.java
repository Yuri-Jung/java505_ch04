//실행용 클래스
public class Method05 {
    public static void inCall(){
        System.out.println("Method05 클래스의 멤버 매서드");
    }
//    프로그램을 실행하기 위한 메인 메서드 존재.
    public static void main(String[] args) {
//       메서드 호출하기
//       1. 클래스 내부 호출 : 동일한 클래스의 멤버끼리 호출하는 것.
//       2. 클래스 외부 호출 : 다른 클래스의 객체를 생성하고 해당 객체의 멤버를 호출하는 것.
        inCall();

//        Car2 클래스 타입의 변수 avante를 선언
        Car2 avante;
//        new : 메모리 공간에 생성자를 통해 생성된 객체를 등록, 등록된 메모리주소를 반환
//        생성자 : 지정한 클래스를 기반으로 객체를 생성
        avante = new Car2();
//       Car2클래스 객체가 생성되고 클래스 타입의 변수 대입되어 사용 준비가 완료 됨.=>사용관계가 맺어짐
//        Car car;
//        car = new Car2() 같은 타입이 아니기 때문에 오루

//        클래스 외부호출
//        avante를 생성하고 난뒤 아벤테 클래스의 run, sound, stop는 객체의 멤버다.
//        클래스 외부 호출, 객체의 멤버 호출
        avante.name = "아반테";
        avante.run();
        avante.sound();
        avante.stop();

//        Car2 클래스 타입의 객체 생성

        Car2 sonata = new Car2();
        sonata.name = "소나타";
        sonata.run();
        sonata.stop();
        sonata.sound();
//      동일하게 출력된다. 동일하게 이름을 가지고 있지만 다른 멤버다.

        Car3 car = new Car3();
        car.run();
        car.stop();
        car.info();

        Car4 toress = new Car4("토레스","SUV");
        toress.info();

        Car4 sanatafe = new Car4("산타페","SUV");
        sanatafe.info();

//        오류 발생(10)
//        Car4 carnival = new Car4();
//
//        Car4 carnival = new Car4();
//        carnival.name ="카니발";
//        carnival.type = "SUV";

        Car05 grander1 = new Car05();
        grander1.getInfo();

        Car05 grander2 = new Car05("K7","세단","준대형");
//        K7.getInfo();

        Car05 K7 = new Car05("K7","세단","준대형");
        K7.getInfo();
        K7.getInfo("전기");
        K7.getInfo("가솔린",4000);
        K7.getInfo("가솔린","4000");
        K7.getInfo(4000,"경유");

//        sum(10,20);
//        sum(3.14,5.28);
    }
    public static void iSum(int a, int b){
        int result = a+b;
        System.out.println("두 수의 덧셈은 " + result + "입니다");
    }
//    새로 만든 경우
    public static void dSum(double a, double b){
        double result = a+b;
        System.out.println("두 수의 덧셈은 " + result + "입니다");
    }

    public static void sum(int a, double b){

    }

    public static void sum(double a, int b){

    }
}
