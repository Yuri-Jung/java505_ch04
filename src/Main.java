public class Main {
    public static void main(String[] args) {
//      Circle 클래스 타입의 변수 pizza 생성
        Circle pizza;
//      생성된 Circle 클래스 타입의 변수 pizza에 Circle 클래스 객체의 주소를 저장.
//       new : 힙 메모리 영역에 지정한 클래스의 객체 메모리 공간을 할당, 메모리 주소 반환.
//        Circle(): Circle 클래스 타입의 객체를 생성
        pizza = new Circle();

//        Circle 클래스는 설계도이기 때문에 혼자서는 데이터를 사용할 수 없다.
//        혼자서는 어떠한 생성도 할 수 없다.
//        객체를 생성함으로써 Circle 클래스의 실체가 생성됨
//        객체가 생성되면 해당 클레스에 포함된 멤버들을 사용할 수 있음
        pizza.radius = 10;
        pizza.name = "자바피자";

        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle donut = new Circle();
        donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);

        //        class를 통해 객체 생성
//        Car car1=new Car();
//        car1.stop();
//        System.out.println(car1.gas);
//        System.out.println(car1.name);

        Car car2 = new Car("토레스", "SUV", "가솔린", "준중형");
        System.out.println(car2.name);
        System.out.println(car2.type);
        System.out.println(car2.gas);
        System.out.println(car2.size);

        System.out.println("\n-------메소드 사용하기====\n");
//        method1();

//
//        public static void method1 () {
//            System.out.println("method1 실행");
//        }

//        public static int average(int a, int b, int c) {
//            int grade[] = new int[0];
//            int sum=0;
//            for(int i=0;i<2;i++){
//                sum=sum+i;
//            }
//            System.out.println("총점은 "+sum+"입니다.");
//            int n=grade[0].length;
//            System.out.println("평균은 "+sum/n+"입니다.");
//            return sum;
//        }

    }
}