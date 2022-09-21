public class Method01 {
    public static void main(String[] args) {
        //        메서드:함수와 동일한 개념, 클래스의 멤버로 포함되어 있는 경우 메서드라고 함.
//        사용자가 원하는 특정 결과를 얻기 위한 연산 식을 하나의 이름으로 묶어둔 것
//        사용자가 원하는 결과를 얻기 위한 소스코드를 한 번 입력할 때는 문제 없지만 여러번 사용할 경우
//        소스코드의 중복이 발생함.
//
//        매개변수: 해당 메서드 내의 연산 시 필요한 데이터를 외부에서 전달하는 변수
//        반환값: 해당 메서드의 연산 후 그 결과값을 메서드를 호출한 위치로 다시 되돌려주는 것.
//        반환값에는 키워드 return이 들어있다.

//        메서드 사용법
//        선언:
//        접근제한자 반환타입 메서드명(매게변수1, 매게변수2,...){
//        실행할 소스코드...
//        }
//
//        사용(호출):
//        메서드명(매개변수1, 매개변수2, ...);
//        변수명 = 메서드명(매개변수1, 매개변수2, ...);

//        메서드의 4가지 형태
//        1. 매개변수와 반환값이 모두 없는 형태
//          연산에 필요한 변수를 메서드 내부에서 선언하고, 사용하고, 삭제함(입력되는 데이터 동일=출력되는 데이터 동일)
//          연산 후 결과를 메서드 내부에서 표현함 (return없으니)
//          연산의 결과가 동일함.
//        2. 매개변수는 존재하고, 반환값은 없는 형태
//          연산 필요한 데이터를 메서드 외부에서 전달받음
//          연산 후 결과를 메서드 내부에서 표현함
//          연산의 결과가 입력되는 데이터에 따라 변경됨
//        3. 매개변수는 없고 반환값은 존재하는 형태
//        연산에 필요한 데이터를 매서드 내부에서 선언하고 사용하고 삭제함
//        연산 후 그 결과를 매서드 외부로 되돌려줌
//        연산 결과를 다른 곳에서 활용할 수 있다.
//        연산의 결과가 동일하다.(입력되는 데이터가 메서드 내부에서 고정되어 있으니)
//        4. 매개변수와 반환값이 모두 존재하는 형태
//        연산에 필요한 데이터를 메서드 외부에서 전달받는다.
//        연산 후 그 결과를 메서드 외부로 되돌려줌.
//        연산 결과를 다른 곳에서 활용할 수 있다.
//        연산의 결과가 입력되는 데이터에 따라 변경된다.




        int a=10;
        int b=20;

        int c=a+b;
        System.out.println("a+b="+c);

        a=20;
        b=10;
        c=a-b;
        System.out.println("a-b="+c);

        a=100;
        b=200;
        c=a+b;
        System.out.println("a+b="+c);
        System.out.println("\n----함수를 이용한 실행----\n");
        sum();
        sum();
        sum();
        sum();
        sum();
        sub();
        sub();
        sub();

        multi(10,20);

        div(10,3);

        System.out.println("\n----메서드의 4가지 형태-----\n");
        sumType1();
        sumType1();
        sumType1(); //1번은 언제나 같은 결과

        sumType2(10,20);
        sumType2(30,50); //결과값이 달라짐. 연산식은 동일하지만 출력값이 달라짐.

        int result=multiType3(); //이 자리에 결과값이 돌아온다.
        System.out.println("두 수의 곱셈은: "+result);
//        result=result+100;
//        System.out.println(result+result);

        double dResult=divType4(10,3);
        System.out.println("두 수의 나눗셈은 : "+dResult);

    }

    public static void sum(){
        int a=10;
        int b =20;
        System.out.println("두수의 덧셈은 : "+(a+b));
    }

    public static void sub(){  //void =null 반환될 값이 없다
        int a=10;
        int b=20;
        System.out.println("두 수의 뺄셈은 : "+(a-b));
    }

    public static void multi(int a, int b){
        int result = a*b;
        System.out.println("두 수의 곱셈은 : "+result);
    }
    public static void div(double a,double b){
        int result = (int)(a/b);
        System.out.println("두 수의 나눗셈은 : "+result);
    }

//    1번 형태(매개변수, 반환값 모두 없는 형태)
    public static void sumType1(){
        int a=10;
        int b=10;
        int result=a+b; //a는 언제나 10. b는 언제나 10. 결과는 항상 20.
        System.out.println("두 수의 덧셈은 "+result);
    }
//    2번 매개변수 존재 반환값없다
    public static void sumType2(int a, int b){  // 두개의 매개변수 입력받을 수 있게 되어있다.
        int result=a-b;
        System.out.println("두 수의 뺄셈은 : "+result);//return이 없기 때문에 sout만들어줘야한다.
    }
//    매개변수 없고 반환값 존재
//    return 키워드 사용시 반환되는 값의 데이터 타입은
//    해당 메서드의 반환 타입과 동일해야 함
    public static int multiType3(){
        int a=10;
        int b=20;
        int result=a*b; //연산 결과값동일
        return result;  //return:반환
    }
//
//    매개변수 반환값 둘다 있다
    public static double divType4(int a, int b){
        double result=a/b;
        return  result;
    }
}

