public class Person {
//    final : 단 한 번만 데이터의 저장이 가능하고 더 이상 수정이 불가능.
    final String nation = "대한민국";
    final  String ssn;
    String name;

//    final 변수인 ssn은 생성자를 통해서 한 번 데이터 저장하고 더이상 수정 불가능
    public Person (String ssn, String name){
        this.ssn = ssn;  //여기서 한 번 초기화
        this.name = name;
    }
}
