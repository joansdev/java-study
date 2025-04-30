package chapter2.interitance.abstractexample;

abstract class Animal {

    public String name;

    public void sleep(){
        System.out.println("쿨쿨");
    }

    abstract void eat();
}
