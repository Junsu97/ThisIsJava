package ch06.sec08.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        /**
         *메소를 호출한다는 것은 메소드 블록을 실행한다는 것
         *클래스에서 메소드를 호출한다고 해서 바로 사용할 수 없다.
         * 메소드는 객체의 동작이므로 객체가 존재하지 않으면 메소드 호출이 불가능하기 때문이다.
         * **/

        //Calculator 객체 생성
        Calculator myCalc = new Calculator();

        //리턴 값이 없는 powerOn() 메소드 호출
        myCalc.powerOn();

        //plus 메소드 호출시 5와 6을 매개값으로 제공하고,
        //덧셈 결과를 리턴 받아 result1 변수에 대입
        int result1 = myCalc.plus(5,6);
        System.out.println("result1 : " + result1);

        int x = 10;
        int y = 4;
        //divide 메소드 호출시 x와 y를 매개값으로 제공하고,
        //나눗셈 결과를 리턴받아 result2 변수에 대입
        double result2 = myCalc.divide(x, y);
        System.out.println("result2 : " + result2);
        
        //매개값과 리턴 값이 없는 powerOff() 메소드 호출
        myCalc.powerOff();
    }
}
