package chapter2.capsulation;

public class Person {

    // 속성
    private String name;
    private String secret;

    // 생성자
    public Person(String name, String secret) {
        this.name = name;
        this.secret = secret;
    }

    // 기능
    private void methodA() {}
    private void methodB() {}

    // 게터
    public String getName() {
        return name;
    }

    // 세터
    public void setName(String name){
        this.name = name;
    }
}
