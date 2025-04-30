package practice;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Product onion = new Product("양파", 1);
        Product apple = new Product("사과", 1);
        Product fish = new Product("생선", 1);
        Product tofu = new Product("두부", 1);

        // 상품 추가
        System.out.println("장바구니 상품 추가");
        cart.addProduct(onion);
        cart.addProduct(apple);
        cart.addProduct(fish);
        cart.addProduct(tofu);
        System.out.println();

        // 목록 출력
        System.out.println("장바구니 목록 출력");
        cart.printCart();
        System.out.println();

        // 상품 삭제
        System.out.println("상품 삭제");
        cart.removeProduct("양파");
        System.out.println();

        // 총 가격 조회
        System.out.println("총 가격 조회");
        cart.totalCost();
        System.out.println();

    }
}
