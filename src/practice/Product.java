package practice;

public class Product {

    // 속성
    private String name;
    private int cost;

    // 생성자
    Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    // 기능
    public String  getName(){
        return this.name;
    }

    public int getCost(){
        return this.cost;
    }
}
