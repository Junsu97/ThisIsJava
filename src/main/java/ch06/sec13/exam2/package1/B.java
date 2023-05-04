package ch06.sec13.exam2.package1;

public class B {
    //필드선언
    A a1 = new A(true);
    A a2 = new A(1); // 같은 패키지에 있기 때문에 default 접근 제한자를 참조할 수 있음.
    //A a3 = new A("문자열");  //private 생성자기 때문에 접근 불가
}
