package practice;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    // 속성
    private List<Product> cart = new ArrayList<>();

    // 생성자

    // 기능
    // 상품 추가
    public void addProduct(Product product) {
        cart.add(product);
    }

    // 목록 출력
    public void printCart() {
        if (cart.isEmpty()) {
            System.out.println("장바구니 비었음");
        } else {
            for (Product product : cart) {
                System.out.println(product.getName());
            }
        }
    }

    // 상품 삭제
    public void removeProduct(String removeProductName) {
        boolean removed = false;

        for (Product product : cart) {
            String findProduct = product.getName();
            if (findProduct.equals(removeProductName)) {
                cart.remove(product);
                removed = true;
                System.out.println(product.getName() + "가 장바구니에서 삭제");
                break;
            }
        }
        if (!removed) {
            System.out.println("장바구니 목록에 없습니다");
        }
    }

    // 총 가격 조회
    public void totalCost() {
        int total = 0;

        for (Product product : cart) {
            total += product.getCost();
        }
        System.out.println("총 상품가격은: " + total + "원입니다");
    }
}
