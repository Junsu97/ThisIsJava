package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A {
    
    //상속을 통해 호출하는 것은 가능

    //생성자 선언
    public D(){
        //A() 생성자 호출
        super();
    }
    
    public void method1(){
        //A의 필드값 변경
        this.field = "value";
        //A의 메소드 호출
        this.method();
    }

    // 직접 객체를 생성해서 사용하는 것은 안됨
//    public void method2(){
//        A  a = new A();
//        a.field = "value";
//        a.method();
//    }
}
