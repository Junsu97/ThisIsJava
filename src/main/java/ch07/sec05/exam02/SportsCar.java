package ch07.sec05.exam02;

public class SportsCar extends Car {
    @Override
    public void speedUp(){
        speed += 10;
    }

    
    // 부모 메소드가 final 메소드이므로 오버라이딩을 할 수 없음
//    @Override
//    public void stop(){
//        System.out.println("스포르카를 멈춤");
//        speed = 0;
//    }
}
