package ch06.sec07.exam05;

public class Car {
    String conpany = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car(String model){
        //14라인 생성자 호출
        this(model,"은색");
    }

    Car(String model,String color){
        //19라인 생성자 호출
        this(model,color,250);
    }

    Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
