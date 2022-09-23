//package package2;
//
////import package1.A;
//import package1.A;
//import package1.B;
//
//// class A는 접근 제한자를 default를 사용하고 있어 다른 패키지에서 사용할 수 없음.
//// class B는 접근제한자를 public으로 사용하고 있어 다른 패키지에서 사용할수 있다이아아아
////public class C {
//////    A a; //A는 PUBLIC아니니까 오류남.
////    B b;
////}
////다른 패키지에서 있는 클래스A를 사용하여 객체 생성
////public class C {
//////    클래스 A의 public을 사용한 생성자로 객체 생성
//////    public을 사용하여 다른 패키지에서 사용 가능
////    A a1 = new A(true);
//
////   클래스 A의 default 사용한 생성자로 객체 생성
////    default는 동일한 패키지 내에서만 사용 가능 다른 패키지에서는 사용불가
////    A a2 = new A(1);
//
////    클래스 A의 private 사용한 생성자로 객체 생성
////    private 해당 클래스 내에서만 사용가능
////    A a3 = new A("문자열");
//
////}
//
////멤버 변수와 접근 제한자
////public class A{
//////    public을 사용하여 외부에서 접근가능
////    public int value1;
//////    default를 사용하여 동일한 패키지 내에서만 접근 가능
////    int value2;
//////    private를 사용하여 해당 클래스 내에서만 가능
////    private int value3;
////
////
////public A(){
//////    생성자는 해당 클래스 내에서 동작
//////    접근제한자에 상관없이 모든 멤버 변수에 접근이 가능
////    value1=1;
////    value2=1;
////    value3=1;
////}
////
////public void method(){}
////void method2(){}
////private void method3(){}
////}