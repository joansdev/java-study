package chapter2.interfaceexample;

public class SpeedCar implements Car {
    
    @Override
    public void drive() {
        System.out.println("빠르게 이동");
    }

    @Override
    public void stop() {
        System.out.println("빠르게 정지");
    }
    
    void autoParking(){
        System.out.println("자동주행기능 탑재");
    }

//    void drive() {
//        System.out.println("빠르게 주행");
    }

