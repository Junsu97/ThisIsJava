package ch06.sec08.exam02;

public class Computer {
    //가변길이 매개변수를 갖는 메소드 선언
    //가변길이 매개변수는 메소드 호출 시 매개값을 쉼표로 구분해ㅓ 개수와 상관 없이 제공할 수 있다.
    //호출시 크기가 정해지는 배열과 같은 느낌
    int sum(int... values){
        int sum = 0;

        //가변길이 매개변수는 배열처럼 활용이 가능하다.
        for(int i = 0; i < values.length; i++){
            sum+=values[i];
        }
        // 합산 결과 리턴
        return sum;
    }
}
