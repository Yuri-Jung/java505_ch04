import java.util.Scanner;

public class Method03 {
    public static int input(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("출력할 구구단 단수를 입력하세요 : ");
        int dansu = scanner.nextInt();
        System.out.println(dansu);
        return dansu; //return dansu; void int로 고쳐줘야
    }
    public static void output(int dansu){
        for (int i = 1; i < 10; i++) {
            System.out.println(dansu + " * " + i + " = " + dansu * i);

        }
    }
    public static int inputScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력해주세요");
        int score= scanner.nextInt();
//        System.out.println(score);

        return score;
    }

    public static String calLevel(int score) {
        String level="F";

        if (score >= 90) {
            level = "A";
        } else if (score >= 80) {
            level = "B";
        } else if (score >= 70) {
            level = "C";
        } else if (score >= 60) {
            level = "D";
        }

//        System.out.println("level : " + level);
        return level;
    }

    public static void printResult(int score, String level){
        System.out.println("당신의 점수은 " + score + "점이고, 등급은 " + level + "입니다.");
    }


    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
////        input();
//        int dansu=input();
//        System.out.println(dansu);
//        output(dansu);
//         점수입력
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("점수를 입력해주세요");
//        int score= scanner.nextInt();
//        String level = "F";

//            if (score >= 90) {
//                level = "A";
//            } else if (score >= 80) {
//                level = "B";
//            } else if (score >= 70) {
//                level = "C";
//            } else if (score >= 60) {
//                level = "D";
//            }

//        System.out.println("당신의 점수은 " + score + "점이고, 등급은 " + level + "입니다.");
//    }
//}
//       input();
//        int score=inputScore();
//       String level=calLevel(score);
//       printResult(score,level);

        Scanner scanner = new Scanner(System.in);
//      데이터 저장하는 부분(배열가능 다른 방법 가능)
        int kor=0;
        int eng=0;
        int math=0;
        int total=0;
        double avg=0.0;
        String level="F";

        kor=scoreInput("국어");
        eng=scoreInput("영어");
        math=scoreInput("수학");

        System.out.println("국어점수 : " + kor);
        System.out.println("영어점수 : " + eng);
        System.out.println("수학점수 : " + math);

        total = totalCal(kor, eng, math);
        System.out.println("총합 : "+ total);
        avg = avgCul(total);
        System.out.println("평균 : " + avg);
        level = levelCal(avg);
        System.out.println("등급 : " + level);

        printResult(total, avg, level);



//        데이터 입력하는 부분 (하나)
//        System.out.print("국어 점수를 입력해주세요 : ");
//        kor = scanner.nextInt();
//        System.out.print("영어 점수를 입력해주세요 : ");
//        eng = scanner.nextInt();
//        System.out.print("수학 점수를 입력해주세요 : ");
//        math = scanner.nextInt();
//        총점계산(하나)
//       total=kor + eng + math;
//       평균 계산(하나)
//        avg = (double) total / 3; //강제형변환
//        등급 계산 (4)
//        if (avg >= 90) {
//                level = "A";
//            } else if (avg >= 80) {
//                level = "B";
//            } else if (avg >= 70) {
//                level = "C";
//            } else if (avg >= 60) {
//                level = "D";
//            }
//        결과 출력(5)
//        System.out.println("당신의 총점은 "+total+"점이고 "+"평균점수는 "+ avg + "점이며 등급은" + level + "입니다.");

        }
        public static int scoreInput(String courses){
            Scanner scanner = new Scanner(System.in); //여기가 더 필요하니
            System.out.print(courses + "점수를 입력해주세요 : ");
            int score = scanner.nextInt();
//
//            System.out.print("국어 점수를 입력해주세요 : ");
//            int kor = scanner.nextInt();
//            System.out.print("영어 점수를 입력해주세요 : ");
//            int eng = scanner.nextInt();
//            System.out.print("수학 점수를 입력해주세요 : ");
//            int math = scanner.nextInt();

//            System.out.println("국어 점수 : "+kor);
//            System.out.println("수학 점수 : "+math);
//            System.out.println("영어 점수 : "+eng);
              return score;
        }

        public static int totalCal(int kor, int eng, int math){
            return kor + eng + math;
        }
//
        public static double avgCul(int total){
            return (double) total / 3;
        }

        public static String levelCal(double avg){
           String level = "F";
            if (avg >= 90) {
                level = "A";
            } else if (avg >= 80) {
                level = "B";
            } else if (avg >= 70) {
                level = "C";
            } else if (avg >= 60) {
                level = "D";
            }
            return level;
        }

        public static void printResult(int total, double avg, String level){
            System.out.println("당신의 총점은 "+total+"점이고 "+"평균점수는 "+ avg + "점이며 등급은" + level + "입니다.");
        }
    }


