package subject;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        문제1
//        Song mySong = new Song("Nesson Dorma");
//        Song yourSong = new Song("공주는 잠 못 이루고");
//        System.out.println("내 노래는 " + mySong.getTitle());
//        System.out.println("네 노래는 " + yourSong.getTitle());


//        문제 2

//        Phone phone1;
//        Phone phone2;
//
////        for(int i =0; i<2; i++){
////            Scanner scanner = new Scanner(System.in);
////            Phone phone1;
////            Phone phone2;
////        }
//        System.out.print("이름과 전화번호 입력 >>> ");
//        phone1 = new Phone(scanner.next(), scanner.next());
//        System.out.print("이름과 전화번호 입력 >>> ");
//        phone2 = new Phone(scanner.next(), scanner.next());
//
//        System.out.println(phone1.getName() + "의 번호" + phone1.getTel());
//        System.out.println(phone2.getName() + "의 번호" + phone2.getTel());


//        문제3
//        1. Rect 클래스의 배열 생성
//        2. 반복문으로 4번 데이터 입력 받기
//        3. 넓이의 전체 합을 출력(반복문)
//        Rect rectArray[] = new Rect[4];
//
//        for (int i=0; i< rectArray.length; i++){
//            System.out.println((i + 1) + "너비와 높이 >> ");
//            int width = scanner.nextInt();
//            int height = scanner.nextInt();
//            rectArray[i] = new Rect(width, height);
////            rectArray[i] = new Rect(scanner.nextInt(), scanner.nextInt());
//        }
//        System.out.println("저장하였습니다..");
//
//        int total = 0;
//
//        for(int i = 0; i< rectArray.length; i++){
//            total += rectArray[i].getArea();
//        }
//        System.out.println("사각형의 전체 합은 " + total);


        //4번
//        1. 사용자 입력을 통해서 전화번호를 저장할 배열 크기를 입력받음
//        2. 지정한 크기 만큼의 사용자 정보 입력받음
//        3. 사용자가 입력한 사용자 이름이 있는지 반복문을 통해서 배열 안의 내용과 비교
//        4. 있으면 정보 출력, 없으면 없습니다 출력
//        5. exit를 입력 받으면 프로그램 종료

//        System.out.println();
//        System.out.print("인원 수 >> ");
//        int size = scanner.nextInt();
////      phone2 클래스 타입의 배열 생성, 사용자가 입력한 크기 만큼 돌면서 배열의 값 넣어줌
//        Phone2 phoneBook[] = new Phone2[size];
////        배열 생성
//
//        for (int i=0; i<phoneBook.length; i++){
//            System.out.println("이름과 전화번호(번호는 연속적으로 입력)>>>");
////            phoneBook[i] = new Phone2()
//
////            phoneBook[i].setName(scanner.next());
////            phoneBook[i].setTel(scanner.next());  //이렇게 두 개 써도 되고 한줄로 써도되고
//
////            지정한 위치에 새로운 phone2 타입의 객체를 생성하여 저장
//            phoneBook[i] = new Phone2(scanner.next(), scanner.next());
////            phone2 객체 생성
//        }
//        System.out.println("저장되었습니다.");
////      사용자 이름 검색하는 부분 , 무한 반복
//        while (true){
//            System.out.println("검색할 이름 >>");
//            String searchName = scanner.next();
//            int index=-1;  //배열의 index번호를 저장할 변수.검색불가:-1, 검색완료 :검색된 index 번호
//
////            입력된 문자열이 exit와 같으면 프로그램 종료
//            if(searchName.equals("exit")){
//                System.out.println("프로그램 종료합니다.");
//                break;
//            }
//
////            검색어로 입력한 이름과 전화번호부에 저장된 이름이 같은지 확인
//            for(int i =0; i< phoneBook.length; i++){
//                if (searchName.equals(phoneBook[i].getName())){
//                 index =i;  //해당 index 번호를 변수 index에 저장
//                 break;
//                }
//            }
//
////            검색어로 검색한 결과 확인
//            if (index > -1) {
////                저장된 index번호를 기반으로 전화번호부에 있는 정보를 출력
//                System.out.println(phoneBook[index].getName() + "의 번호 " + phoneBook[index].getTel());
//            }
//            else {
////                없으면 없다고 출력
//                System.out.println(searchName + " 이 없습니다.");
//            }
//          }
//        문제1 사칙연산을 할 수 있는 클래스Calculator를 생성하고 정수를 2개 입력받아
//        계산하는 프로그램을 작성하세요
//        조건 2/ 멤버 변수 : int num1, num2, result
//        멤버 메서드 : sum, sub, multi, div
//        모든 결과는 int 데이터 타입으로 사용, 메서드의 4가지 형태 중 아무꺼나 사용

//        System.out.println("정수를 2개 입력하세요");
//        int num1=scanner.nextInt();
//        int num2=scanner.nextInt();
//


//        문제2(중복가능)
//        1~45까지의 임의의 숫자 6개를 생성하여 그 결과를 출력하는 프로그램을 작성하세요
//        조건 1) 배열을 사용하여 랜덤으로 생성된 데이터를 저장해야
//        Math.random()를 사용
//        int intArray[];
//        intArray = new int[6];
//        int i = 0;
//        for (; i < intArray.length; i++) {
//            intArray[i] = (int) (Math.random() * 45 + 1);
//            System.out.print(intArray[i] + "\t");
//        }


//        선생님
//        int lotto1[] = new int[7];
//        for(int i =0; i<lotto1.length; i++){
//            int rnd = (int)((Math.random()*45)+1);
//            lotto1[i] = rnd;
//        }
//        for(int i =0; i<lotto1.length; i++){
//            System.out.print(lotto1[i]);
//        }

//        문제 3(중복 금지)
//        문제 2를 여러번 실행 시 중복되는 배열에 저장되는 숫자가 중복되는 상황이 발생됨,
//        중복되는 숫자를 제외하고 총 6개의 숫자를 저장하고 출력하는 프로그램을 작성하시오

//        int intArr[];
//        intArr = new int[6];
//        int a = 0;
//        for (; a < intArr.length; a++) {
//            intArr[a] = (int) (Math.random() * 45 + 1);
//            for (int b = 0; b < intArr.length; b++) {
//                if (intArr[a] == intArr[b]) {
//                    intArr[b] = (int) (Math.random() * 45 + 1);
//                }
//            }
//            System.out.print(intArr[a] + "\t");
//        }

//        선생님

//        int lotto2[] = new int[7];
//
////        로또 번호 생성
//        for (int i = 0; i < lotto2.length; i++) {
////            랜덤숫자 생성 0.0
//            int rnd = (int)((Math.random() * 45) + 1);
//
////            중복제거
//            for (int j = 0; j < i; j++) {
////                동일한 값이 있는지 확인
//                if (rnd == lotto2[j]) {
////                    동일한 값이 있을 경우 현재 루프를 다시 한 번 더 실행
//                    i--;  //현재 카운트변수의 값을 먼저 1 감소시켜서, 나중에 자동으로 올린다.
////                    나중에 자동을 1 증가할 카운트변수를 먼저 1감소시켜서 동일한 값이 나올 수 있도록 변경함.
////                    동일한 번호의 루프를 돌 수 있게 됨.
//                    break;
//                }
////                동일한 값이 아니면 배열에 저장
//                lotto2[i] = rnd;
//            }
////          첫번째 루프의 경우, 중복 제거 루틴으로 빠지지 않기 때문에 데이터가 저장되는 부분이 없으므로 0번 루프 때만 동작되는
////            if문을 실행한다.
//            if (i == 0) {
//                lotto2[i] = rnd;
//            }
//        }
////화면 출력
//        Arrays.sort(lotto2);
//        for (int i = 0; i < lotto2.length; i++) {
//            System.out.print(lotto2[i] + " ");
//        }

//        5번
//        Circle pizza = res.5;
//        Circle waffle = res1;
//
//        boolean res =
//                if(res==true)
//                    System.out.println("pizza와 waffle 크기 같다");
//                else
//                    System.out.println("pizza와 waffle 크기 다름");
//        CircleManager.copy(pizza,waffle);
//        res =
//           if(res==true)
//               System.out.println("pizza와 waffle 크기 같다");
//           else
//               System.out.println("pizza와 waffle 크기 다름");

//        6번

    }
}



