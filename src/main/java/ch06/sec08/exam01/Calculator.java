package ch06.sec08.exam01;

public class Calculator {
    /**
     *메소를 호출한다는 것은 메소드 블록을 실행한다는 것
     *클래스에서 메소드를 호출한다고 해서 바로 사용할 수 없다.
     * 메소드는 객체의 동작이므로 객체가 존재하지 않으면 메소드 호출이 불가능하기 때문이다.
     * **/

    //리턴값이 없는 메소드 선언
    void powerOn(){
        System.out.println("전원을 켭니다.");
    }
    void powerOff(){
        System.out.println("전원을 끕니다.");
    }

    //호출시 두 정수 값을 전달 받고,
    //호출한 곳으로 결과값 int를 리턴하는 메소드
    int plus(int x, int y){
        int result = x + y;
        return result;
    }

    //호출시 두 정수 값을 전달 받고,
    //호출한 곳으로 결과값 double를 리턴하는 메소드
    double divide(int x, int y){
        double result = (double) x / y;
        return result;
    }
}
