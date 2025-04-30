package chapter2.capsulation.v1;


// 핵시설 관리하는 개발자
public class DataStore {
    private String store; // "B"라는 문자열 들어오면, 핵폭발 발생

    public void setStore(String store){
        if (store.equals("B")){
            System.out.println("B가 들어가면 안 됩니다.");
        } else {
            this.store = store;
        }
    }
}
