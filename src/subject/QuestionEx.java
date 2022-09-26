package subject;
import java.util.Random;
import java.util.Scanner;

public class QuestionEx {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        //        문제 1
//        System.out.println("알파벳 하나를 입력하세요 : ");  //알파벳 하나를 입력하세요<- 이것도 15개의 배열
//        String str = scanner.next();  //next로 받으면 공백기호를 기준으로 문자를 가져옴
//        charAt() : String 타입의 데이터 중 지정한 index의 문자를 char 타입으로 변환.

//        char이 문자형이긴하지만 '정수형'이다!!
//        char c = str.charAt(0);   //변수 c는 charAt()문자열에서 문자의 배열.0부터 문자순서가 시작 됨.
//        //char 타입의 데이터 a는 문자로는 'a' 정수로는 97로 표현 b:98 c: 99 d:100 ... 아스키코드 문자로는 'a', 정수로는 97
//        for (char a = 97; a <= c; a++){  //'a'대신 숫자 97넣어도 동일
//            for (char b = a; b <= c; b++){   //처음부터 입력한데까지 넣어줘야하니까. 알파벳은 무조건 a부터니까 b=a넣는다.
//                System.out.print(b);
//            }
//            System.out.println();
//        }


//        문제 2 배열,반복문 / 입력값 받으니까 이중for문 필요없다. 하나만 있으면 됨.
//        int arrQuiz2[] = new int[10];
//
//
//        for(int i = 0; i<arrQuiz2.length; i++){
//            System.out.println("정수를 입력해주세요(현재" + (i + 1) + "번) : ");
//            arrQuiz2[i] = scanner.nextInt();
//        }
//        for(int i = 0; i<arrQuiz2.length; i++){
//            if(arrQuiz2[i]%3==0){
//                System.out.print(arrQuiz2[i] + " ");
//            }
//        }

//        3번
//        1) eng 배열을 전체 검색하여 사용자가 입력한 단어가 있는지 확인
//        2) 있으면 해당 index 번호 확인하고 검색 중지
//        3) kor 배열의 index 번호에 있는 단어 출력
//        4) 입력된 단어가 exit이면 프로그램 종료
//    String eng[] = {"student", "love", "java", "happy", "future"};
//    String kor[] = {"학생","사랑","자바","행복한","미래"} ;

//    while(true){} 무한반복. 조건식에 true, 탈출할 수 없게, 카운트 올릴수 없게. 주로 while문으로 무한반복문 많이 만든다.
//    for(;;){}무한반복

//        while(true){
//        System.out.println("영어단어를 입력하세요");
//            String quiz3Str = scanner.next();
//
//            if (quiz3Str.equals("exit")){
//                System.out.println("종료합니다...");
//                break;
//            }
//
//            int index = -1; //for문에만 넣어놓으면 for문이 끝나면 사라지니까.//index = -1 혹은 index=0 해도 괜찮다.
//            for(int i = 0; i<eng.length; i++){
//                if(quiz3Str.equals(eng[i])){
//                    index =i;
//                    break;   //찾으면 바로 멈춰
//                }
//            }
//            if(index>-1){
//                System.out.println(kor[index]);
//            }else{
//                System.out.println("그런 영어단어가 없습니다.");
//            }
//        }

//        문제 4
//        1. 0에서부터 99까지의 숫자를 컴퓨터가 랜덤 숫자 선택, 사용자가 키보드로 입력
//        2. 사용자 입력을 통해 얻은 데이터가 높은지 낮은지 판단(if else문), 반복실행
//        3. 정답을 맞춘 후 게임을 할 것인지 확인
//        Random r = new Random();  //랜덤 값 생성하기 위한 클래스
//        int card; //컴퓨터가 랜덤으로 생성한 데이터가 저장될 변수
//        int low;  //카드에 적힌 수의 범위를 설정할 변수 (0-99)에서 0
//        int high;  //카드 가장 큰 값
//
////        게임의 시작, 무한 반복
//        while(true){
//            int i = 1;  //몇 번 째 입력인지 확인하기 위한 변수
//            low = 0;    //게임 시작시 초기값을 가장 작은 0으로 설정함
//            high = 99;  //게임 시작시 초기값을 가장 큰 수인 99로 설정
//            card = r.nextInt(100); //0-99까지의 숫자 랜덤값 가져옴 100+1하면 1부터 시작됨
//            System.out.println("UP & DOWN게임입니다. 숨겨진 수를 맞추어 보세요");
//
//
////          사용자 입력을 반복하는 부분
//            while(true){
//                System.out.println(low +  "-"  + high);  //0-99
//                System.out.println(i + ">>");  //몇 번 째 입력인지 보여줌
//
//                int count = scanner.nextInt();   //사용자 입력
//
////                정상 범위 내의 입력인지 확인
//                if(count > high || count < low){
//                    System.out.println("범위를 벗어났습니다.");
//                } else {
////                    입력값이 컴퓨터의 랜덤 값과 같을 경우
//                    if(count == card){
//                        System.out.println("정답입니다.");
//                        break;    //내부 while문을 종료
//                    }
////                    사용자의 입력이 컴퓨터의 랜덤값보다 클 경우
//                    else if(count > card){
//                        System.out.println("더 낮게");
//                        high = count;  // 최대 크기의 범위를 사용자의 입력 데이터로 설정(입력하는 부분 줄어듦)
//                    }
////                    사용자 입력이 컴퓨터 랜덤값보다 작을 경우
//                    else{
//                        System.out.println("더 높게");
//                        low = count;  //최소 크기의 범위를 사용자의 입력 데이터로 설정
//                    }
//                }  //else문 끝남
//                i++;  //if문의 i의 값 올려준다
//            }
//            System.out.println("다시 하시겠습니까?(y/n)>>");
////            게임이 끝나고 새 게임을 시작할 것인지 확인
//            if(scanner.next().equals("n")){
//                break;  //외부 while문을 종료
//            }
//        }

//        보너스1
        int intArray [][];
        intArray = new int [3][4];
//      입력부분

        for(int i =0; i<3; i++){
            for(int j=0; j<4; j++){
//                Math.random() * 10 : 랜덤 숫자를 발생시키기 위한 수학 클래스의 함수
//                결과가 0.0~1.0까지의 숫자를 랜덤하게 출력한다 10곱하면 0.0~10.0의 숫자가 나옴 정수 부분이 나올 수 있도록 곱함
//                (INT)로 했으니까 소수점 뒷 자리 다 삭제됨. 정수니까.
//                (int) 를 사용하여 소수점 뒤의 숫자를 삭제하고 정수로 강제 형 변환
//
                intArray[i][j] = (int) (Math.random() * 10);
            }
        }

        for(int i = 0; i< intArray.length; i++){
            for (int j=0; j< intArray[i].length ; j++){
                System.out.print(intArray[i][j] + "\t");
            }
            System.out.println();
        }

        int i =0, sum=0;
        while(i<3){
//            for (int j = 0 ; i < intArray[i].length; j++){
//                sum = sum + intArray[i][j];
//            }
//            i++;
            int j = 0;
            while(j< intArray[i].length){
                sum += intArray[i].length;
                j++;
            }
            i++;
        }
//            sum = sum + intArray;
//            i++;
        System.out.println("합은 " + sum);
    }
}
