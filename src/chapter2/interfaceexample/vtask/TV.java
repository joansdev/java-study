package chapter2.interfaceexample.vtask;

public class TV implements Function {
    @Override
    public void turnOn() {
        System.out.println("전원 킴");
    }

    @Override
    public void turnOff() {
        System.out.println("전원 끔");
    }

    void channelChange() {
        System.out.println("채널 변경");
    }
}
