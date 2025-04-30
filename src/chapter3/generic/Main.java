package chapter3.generic;

public class Main {
    public static void main(String[] args) {

        // 1. 재사용 불가
        ObjectBox box1 = new ObjectBox(1);
//        Box box2 = new Box("yohan");
//        Box box3 = new Box(0.1);

        // 2. 낮은 타입 안정성
        ObjectBox strBox = new ObjectBox("ABC");
        ObjectBox intBox = new ObjectBox(1);

        // item을 활용하기 위해 <down casting 필요> - 실수 발생 우려 (int를 String으로 다운캐스팅 하는 등..)
        String item = (String) strBox.getItem();


        // 제네릭 활용 **
        // 1.재사용성 보장 (타입소거: T -> Object로 변경)
        GenericBox<String> strGBox = new GenericBox<>("ABC");  // 처음 인스턴스화 할 때 타입 선언까지 함께 (String으로)
        GenericBox<Integer> intGBox = new GenericBox<>(1);
        GenericBox<Double> doubleGBox = new GenericBox<>(0.0005);
        
        String strGBoxItem = strGBox.getItem();
        System.out.println("strGBoxItem = " + strGBoxItem);
        
        Integer intGBoxItem = intGBox.getItem();
        System.out.println("intGBoxItem = " + intGBoxItem);
        
        Double doubleGBoxItem = doubleGBox.getItem();
        System.out.println("doubleGBoxItem = " + doubleGBoxItem);

        // 일반 메서드(String 기준으로 타입소거 발생)
        strGBox.printItem("ABC");
//        strGBox.printItem(1); -> Integer로 안된다

        // 제네링 메서드 (String과 상관 없다)
        strGBox.printBoxItem("yohan");
        strGBox.printBoxItem(1);
        strGBox.printBoxItem(0.0005);

        // 2. 타입 안정성 보장(타입소거: 자동으로 down casting 발생)

    }
}
