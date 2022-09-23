public class StaticMember {
    public static void main(String[] args) {
//        객체 생성 후 객체의 멤버를 사용
        StaticClass sc1 = new StaticClass();
        sc1.getInfo(); //전체 값 출력
        System.out.println("나이 : " + sc1.age);
        System.out.println("이름 : " + sc1.name);

//        static이라는 건 이렇게 사용한다.
//        staticClass.name = "유인나"; 이러면 오류남
//        static 객체 생성없이 클래스로 바로 접근해 사용가능.(정적멤버)
        StaticClass.job = "가수";
        System.out.println(" static 직업 : " + StaticClass.job );
        StaticClass.getJob();

        System.out.println("\n-----------------\n");
//      Calc 클래스의 멤버 메서드인 abs, max, min이 모두 정적 멤버이기 때문에 객체 생성 없이 클래스 이름으로
//        직접 접근이 가능하다.
//        정적 멤버는 해당 클래스를 객체화하여 사용시 객체화된 모든 객체들과 함께 공유
//        하게 메모리 공간을 공유한다.
        System.out.println(Calc.abs(-5)); //무조건 정수로
        System.out.println(Calc.max(10,8)); //더 큰 값
        System.out.println(Calc.min(-3,-8)); //더 작은 값

//        정적 멤버도 객체 생성 후 사용이 가능하다.
        Calc c = new Calc();
        System.out.println(Calc.abs(-5));
        System.out.println(Calc.max(10,8)); //더 큰 값
        System.out.println(Calc.min(10,8));

        Calc c1 =new Calc();
        Calc c2 =new Calc();

//        일반 멤버를 사용한 연산
        c1.iNum1 = 10;
        c1.iNum2 = 20;
        c1.iResult = c.iNum1 + c1.iNum2;
        System.out.println("객체 c1의 iResult : " + c1.iResult);

        c2.iNum2 = 100;
        c2.iNum1 = 200;
        c2.iResult = c2.iNum1 + c2.iNum2;
//        iResult라는 똑같은 변수를 사용하지만 메모리 공간이 다르기 때문에
//        서로 다른 값이 출력이 된다. 서로 영향받지 않는다.
        System.out.println("객체 c2의 iResult : " + c2.iResult);
        System.out.println("객체 c1의 iResult : " + c1.iResult);

//        정적 멤버를 사용한 연산
        System.out.println();
        c1.sNum1 = 10;
        c1.sNum2 = 20;
        c1.sResult = c1.sNum1 + c1.sNum2;
        System.out.println("객체 c1의 sResult : " + c1.sResult);

        c2.sNum1 = 100;
        c2.sNum2 = 200;
        c2.sResult = c2.sNum1 + c2.sNum2;
        System.out.println("객체 c2의 sResult : " + c2.sResult);
        System.out.println("객체 c1의 sResult : " + c1.sResult);
        System.out.println("클래스 sResult : " + Calc.sResult); //sResult에 값 지정 없었는데 300으로 출력됨 => 빌린것.

        System.out.println("\n");

        Tv.info = Tv.company + Tv.model;

        System.out.println(Tv.info); //정적 초기화 블록

    }
}
