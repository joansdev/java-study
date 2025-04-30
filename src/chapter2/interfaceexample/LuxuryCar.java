package chapter2.interfaceexample;

public class LuxuryCar implements Car{


    @Override
    public void drive() {
        System.out.println("차량 주행");
    }

    @Override
    public void stop() {
        System.out.println("차량 정지");
    }

    public void charge() {
        System.out.println("자동차 충전");
    }
}
