import java.util.Scanner;
public class Method02 {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
//        문제1) 사칙연산을 하기위한 메서드를 메서드의 4가지 형태로 각각 생성하여
//        실행하는 프로그램을 작성하시오.
//        1.더하기, 빼기, 곱하기, 나누기 를 각각 4가지 형태로 생성
//        2. 1번타입의 함수 이름: sum1,sub1,multi1,div1
//           2번 타입 함수이름:sum2,sub2,multi2,div2
//           3번 타입 함수이름:sum3,sub3,multi3,div3
//           4번 타입 함수이름:sum4,sub4,multi4,div4

        //1번 출력
        System.out.println("\n----1번타입----\n");
        sum1();
        sub1();
        multi1();
        div1();

        //2번 출력
        System.out.println("\n----2번타입----\n");
        sum2(10,20);
        sub2(10,20);
        multi2(10,20);
        div2(10,20);

        //3번 출력
        System.out.println("\n----3번타입----\n");
        int result1=sum3();
        System.out.println("3번 두 수의 덧셈은: "+result1);
        result1=sub3();
        System.out.println("3번 두 수의 뺄셈은: "+result1);
        result1=div3();
        System.out.println("3번 두 수의 곱셈은: "+result1);
        result1=multi3();
        System.out.println("3번 두 수의 나눗셈은: "+result1);

        //4번 출력
        System.out.println("\n----4번타입----\n");
        double dResult=sum4(10,3);
        System.out.println("두 수의 덧셈은 : "+dResult);
        dResult=sub4(10,3);
        System.out.println("두 수의 뺄셈은 : "+dResult);
        dResult=multi4(10,3);
        System.out.println("두 수의 나눗셈은 : "+dResult);
        dResult=div4(10,3);
        System.out.println("두 수의 나눗셈은 : "+dResult);





//        3.각각의 함수를 모두 실행하여 결과를 확인할 수 있게 하시오

//        문제2) 사용자 입력을 통해서 (2-9)숫자를 입력받아 해당하는 단수의 구구단을
//        출력하는 프로그램을 작성하세요
//        1. 구구단을 출력하는 부분을 함수로 구현(함수명:gugudan)
//        2. 사용자 입력 부분은 함수로 구현해도 되고 안해도 된다. 형태는 상관없다.
        System.out.println("보고싶은 단을 입력하세요(2-9)");
        int num= scanner.nextInt();
        int num1=0;
        gugudan(num,num1);




//        문제3) 사용자 입력을 통해서 국어, 영어, 수학의 점수 3개를 입력받고
//        해당하는 총점과 평균, 등급을 출력하는 프로그램을 작성하시오.
//        1. 등급 계산부분을 함수로 구현(함수명:scores/ as if문)
//        2. 총점과 평균 계산 부분을 함수로 구현(함수명: average)

        int kor=0;
        int eng=0;
        int math=0;
        int total=0;
        double avg=0;
        String level="F";

        System.out.println("국어점수입력해주세요");


        System.out.println("국어, 영어, 수학 점수를 입력하시오");


//        int sum=average(grade);
//
//        int average=scores(average);


    }

    public static void sum1() {
        int a = 10;
        int b = 10;
        int result = a + b; //a는 언제나 10. b는 언제나 10. 결과는 항상 20.
        System.out.println("1번 타입 두 수의 덧셈은 " + result);
    }

    public static void sub1() {
        int a = 10;
        int b = 10;
        int result = a - b; //a는 언제나 10. b는 언제나 10. 결과는 항상 20.
        System.out.println("1번 타입 두 수의 뺄셈은 " + result);
    }

    public static void multi1() {
        int a = 10;
        int b = 10;
        int result = a * b; //a는 언제나 10. b는 언제나 10. 결과는 항상 20.
        System.out.println("1번 타입 두 수의 곱셈은 " + result);
    }

    public static void div1() {
        int a = 10;
        int b = 10;
        int result = a + b; //a는 언제나 10. b는 언제나 10. 결과는 항상 20.
        System.out.println("1번 타입 두 수의 나눗셈은 " + result);
    }

    //2번 타입
    public static void sum2(int a, int b) {
        int result = a + b;
        System.out.println("2번타입 두 수의 덧셈은 : " + result);
    }

    public static void sub2(int a, int b) {
        int result = a - b;
        System.out.println("2번타입 두 수의 뺄셈은 : " + result);
    }

    public static void multi2(int a, int b) {
        int result = a * b;
        System.out.println("2번타입 두 수의 곱셈은 : " + result);
    }

    public static void div2(int a, int b) {
        int result = a/b;
        System.out.println("2번타입 두 수의 나눗셈은 : " + result);
    }


    //3번 타입
    public static int sum3(){
        int a=10;
        int b=20;
        int result1=a+b; //연산 결과값동일
        return result1;  //return:반환
    }

    public static int sub3(){
        int a=10;
        int b=20;
        int result1=a-b; //연산 결과값동일
        return result1;  //return:반환
    }

    public static int multi3(){
        int a=10;
        int b=20;
        int result1=a*b; //연산 결과값동일
        return result1;  //return:반환
    }

    public static int div3(){
        int a=10;
        int b=20;
        int result1=a/b; //연산 결과값동일
        return result1;  //return:반환
    }

    //4번째
    public static double sum4(int a, int b){
        double result1=a+b;
        return  result1;
    }

    public static double sub4(int a, int b){
        double result1=a-b;
        return  result1;
    }

    public static double multi4(int a, int b){
        double result1=a*b;
        return  result1;
    }

    public static double div4(int a, int b){
        double result=a/b;
        return  result;
    }
//2번
    public static int gugudan(int num, int num1) {
        for (num1 = 1; num1 < 10; num1++) {
            int sum =  num*num1;
            System.out.println(num+"*"+num1+"="+sum);
        }
        return num;
    }

//    3번
//    문제3) 사용자 입력을 통해서 국어, 영어, 수학의 점수 3개를 입력받고
//        해당하는 총점과 평균, 등급을 출력하는 프로그램을 작성하시오.
//        1. 등급 계산부분을 함수로 구현(함수명:scores/ as if문) 평균의 등급
//        2. 총점과 평균 계산 부분을 함수로 구현(함수명: average)







    public static int average(int a, int b, int c) {
            int sum=0;
            for(int i=0;i<3;i++){
//                int grade[]= scanner.next();
//                sum=sum+grade[i];
            }
            System.out.println("총점은 " + sum + "입니다.");
//            int n=grade.length;
//            System.out.println("평균은 " + sum / n + "입니다.");
            return sum;
        }

        public static int scores(int average){
        if(average>=90){
            System.out.println("A");
        }
        else if(average>=80){
                System.out.println("B");
            }
        else if(average>=70){
            System.out.println("C");
        }
        else if(average>=60){
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
            return average;
        }
}

