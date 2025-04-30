package chapter2.interitance;

public class Child  extends Parent{

    public String familyName = "yohan";

    public Child() {
        super();
        System.out.println("자식 생성자");
    }

    // super -> 부모클래스 요소에 직접 접근
    public void superTest() {
        System.out.println("super.familyName = " + super.familyName);
    }

    public void showSocialMedia(){
        System.out.println("SNS에서 우리 가문을 소개해드립니다");
    }

    @Override
    public void introduceFamily() {
        System.out.println("오버라이드");
    }

}
