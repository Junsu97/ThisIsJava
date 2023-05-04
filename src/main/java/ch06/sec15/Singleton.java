package ch06.sec15;


/*
싱글톤 패턴의 핵심은 생성자를 private 접근 제한해서
외부에서 new 연산자로 생성자를 호출 할수 없도록 막는것이다.

생성자를 호출할 수 없으니 외부에서 마음대로 객체를 생성하는것이 불가능해지지만,
싱글톤 패턴이 제공하는 정적 메소드를 통해 간접적으로 객체를 얻을 수 있다.

* */
public class Singleton {
    //private 접근 권한을 갖는 정적 필드 선언과 초기화
    private static Singleton singleton = new Singleton();

    //private 접근 권한을 갖는 생성자 선언
    private Singleton(){}

    //public 접근 권한을 갖는 정적 메소드 선언
    static Singleton getInstance(){
        return singleton;
    }
}
