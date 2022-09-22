public class Car3 {
    public String name;
    public String type;

//    이것 덕분에 이름 안넣어도 자동으로 들어감.
    public Car3(){  //클래스 이름과 동일하게 사용해야
        name = "토레스";
        type = "SUV";
    }

    public void run(){
        System.out.println(name + "가 달립니다");
    }

    public void stop(){
        System.out.println(name+"가 멈춥니다");
    }

    public void info(){
        System.out.println("차 이름은 " + name + "이고 차종은 " + type + "입니다");
    }
}
