package ch06.sec11.exam01;

public class Korean {
    /*
    final필드는 초기값이 저장되면 이것이 최종적인 값이 되어서 프로그램 실행 도중에 수정할 수 없게 된다.
    final필드에 초기값을 줄 수 있는 방법은 두가지다
    1. 필드 선언 시에 초기값 대입
    2. 생성자에서 초기값 대입
    * */
    
    //인스턴스 final 필드선언
    final String nation = "대한민국";
    final String ssn;

    //인스턴스 필드 선언
    String name;

    //생성자 선언
    public Korean(String ssn, String name){
        this.ssn = ssn;
        this.name = name;
    }
}
