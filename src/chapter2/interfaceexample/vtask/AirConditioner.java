package chapter2.interfaceexample.vtask;

public class AirConditioner implements Function{
    @Override
    public void turnOn() {
        System.out.println("전원 킴");
    }

    @Override
    public void turnOff() {
        System.out.println("전원 끔");
    }

    void temUp() {
        System.out.println("온도 UP");
    }

    void temDown() {
        System.out.println("온도 Down");
    }
}
