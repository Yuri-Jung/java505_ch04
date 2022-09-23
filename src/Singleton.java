public class Singleton {
//    private 접근 제한자 : private로 지정된 멤버는 해당 클래스 내에서만 사용가능.
//    static은 원래 외부에서 참고 가능했는데, public을 붙였기 때문에 참고 불가능.
//    아예 new키워드 사용 불가능

    private static Singleton singleton = new Singleton();
//    생성자의 접근제한자에 private를 사용하면 객체 생성 시 new 키워드 사용불가
//    그 뜻은 메모리에 저장 불가능 -> 객체 생성이 불가능하게 된다

    private Singleton(){}

//     getInstance() 공용으로 사용가능하댜
    public static Singleton getInstance(){
        return singleton;
    }
}

