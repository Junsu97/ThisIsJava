package ch06.sec07.exam05;

public class CarExample {
    public static void main(String[] args) {
        //1번 생성자 호출
        Car car1 = new Car("자가용");
        System.out.println("car1.compay : "  + car1.conpany);
        System.out.println("car1.model : " + car1.model);
        System.out.println();
        
        Car car2 = new Car("자가용","빨강");
        System.out.println("car2.compay : "  + car2.conpany);
        System.out.println("car2.model : " + car2.model);
        System.out.println("car2.color : " + car2.color);
        System.out.println();

        Car car3 = new Car("택시","검정", 200);
        System.out.println("car3.compay : "  + car3.conpany);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println("car3.maxSpeed : " + car3.maxSpeed);
    }
}
