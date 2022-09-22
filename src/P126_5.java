import java.util.Arrays;
import java.util.Scanner;

public class P126_5 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("정수 10개 입력하세요 >> "); //입력받는 부분 메서드  // 출력하는부분 메서드

//        int num[]={10,50,80,70,20};
//        for (int i=0; i<num.length; i++){
//            System.out.print(num[i]+" ");
//
//            System.out.println();
//
//            Arrays.sort(num);
//        }
//        int num[]=new int[10];
        int num[];
        num = inputData();
        Arrays.sort(num);
        result(num);


        for(int i=0; i<num.length; i++)
            for(int j=0; j<num.length; j++){
                if(num[i]>num[j]){
                    int tmp = num[i];
                    num[i]=num[j];
                    num[j]=tmp;
                }
            }
    }


        public static int[] inputData(){
        //public static void(){}라고 많이 사용되는데 void라는 건 return할 값이 없을 때. 즉, 자신의 함수에서 리턴하는 값이 있을
//            경우 본인 함수에서 리턴하는 성질에 맞춰 설정
//            함수명()
            Scanner scanner = new Scanner(System.in);
            System.out.println("정수 10개 입력하세요 >> ");
            int num[];
            num = new int[10];
            for (int i = 0; i < num.length; i++) {
                num[i] = scanner.nextInt();
            }
            return num;
        }

        public static void result(int num[]){
            for(int i = 0;i<num.length;i++) {
            }

        }
}


