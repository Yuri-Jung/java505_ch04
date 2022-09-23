import newPackage1.B;

public class GetterSetterEx {
    public static void main (String[] args){
        Bmi gildong = new Bmi();
        gildong.name = "홍길동";
        gildong.height = 180;
        gildong.weight = 75;
//        bmi는 private로 설정되어 있어 외부 접근불가
//        gildong.bmi=22;

        System.out.println(gildong.name + "의 키는 " + gildong.height + "\n"
        + gildong.name + "의 몸무게는 " + gildong.weight + "kg");
        gildong.setMyInfo(180,75);
        System.out.println(gildong.name + "의 bmi는 " + gildong.getBmi());


        GetSet gs = new GetSet();
//        public으로 되어있기 때문에 외부에서 마음대로 접근 가능. 수정가능.
        gs.value1 = "public 멤버 변수";
        System.out.println(gs.value1);
        gs.setValue2("private 멤버 변수");
        System.out.println(gs.getValue2());
    }
}
