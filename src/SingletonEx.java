public class SingletonEx {
    public static void main(String[] args){
//        Singleton singleton1 = new Singleton();
//        Singleton singleton2 = new Singleton();
        
//        싱글톤 디자인패턴 방식을 사용하여 객체를 생성 => 이렇게 하면 메모리 주소가 똑같이 출력됨.
//        객체가 같다라고 출력됨.
//        PRIVATE으로 해놨기 때문에 외부에서 NEW방식으로 넣는 것 불가.
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();


        System.out.println(singleton1); //메모리 주소가 다르게 출력됨
        System.out.println(singleton2);
        if (singleton1 == singleton2){
            System.out.println("두 객체가 같다.");
        }
        else{
            System.out.println("두 객체가 다르다");
        }
//        두 객체가 다르다라고 뜬다.
    }
}
