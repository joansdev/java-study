package chapter2.interitance;

public class Main {
    public static void main(String[] args) {

        Child child = new Child();

        child.introduceFamily();
        System.out.println(child.familyName);
        child.superTest();
        child.showSocialMedia();
        child.introduceFamily();
    }
}
