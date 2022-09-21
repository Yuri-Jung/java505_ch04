public class Circle {
//    클래스 Circle 멤버변수(보통 클래스 바로 다음)
//    <선언>
//    멤버변수는 클래스 안에 선언(메서드 안에 선언하지 않음)
//    <사용>
//    메서드 내에서 사용함.(일반 변수 사용방법과 동일)
//    클래스의 멤버 변수 선언부에서 연산은 불가함.
//    해당 클래스 밖에서 클래스를 통한 객체 생성 후 '객체명.멤버변수명' 형태로 사용
    int radius;  //클래스 circle의 멤버변수
    String name;  //멤버변수(상태값, 고유특성값)
//   클래스 circle의 멤버 메서드

//    radius*3.14; 이렇게 밖에서 연산 안된다.메서드 안에서 계산해야.
    public double getArea(){    //<-circle의 멤버메서드(기능 / 특정 결과를 얻기 위한)
        return 3.14*radius*radius;
    }
    public static void main(String[] args) {

    }
}
