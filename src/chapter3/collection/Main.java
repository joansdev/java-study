package chapter3.collection;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        // 배열의 한계
        // 선언과 동시에 -> 길이 설정 필요
//        int[] numbers = new int[3];
//        numbers[0] = 10;
//        numbers[1] = 10;
//        numbers[2] = 10;
//        // 배열의 정적인 한계
//        numbers[3] = 10; // 4번째부터 오류 발생

        // 컬렉션
        ArrayList<Integer> arrayList = new ArrayList<>();

        ArrayList<String> names = new ArrayList<>();

        // 순서 보장, 중복 허용
        names.add("yohan");
        names.add("yohan");
        names.add("jihee");
        names.add("...");
        System.out.println(names);

        // 단건조회 허용
        System.out.println(names.get(0));

        // 데이터 삭제
        names.remove("jihee");
        System.out.println("names = " + names);
        
        // - - - - - //
        
        // HashSet 사용
        HashSet<String> uniqueNames = new HashSet<>();
        
        // 데이터 추가
        uniqueNames.add("1");
        uniqueNames.add("2");
        uniqueNames.add("3");
        uniqueNames.add("4");
        uniqueNames.add("5");
        uniqueNames.add("6");

        // 순서 보장X -> get() 사용 불가
        System.out.println("uniqueNames = " + uniqueNames);
        
        // 중복데이터 불가
        uniqueNames.add("1"); // 1이 또 들어가서 2개가 되지 않는다
        System.out.println("uniqueNames = " + uniqueNames);
        
        // 데이터 제거
        uniqueNames.remove("3");
        System.out.println("uniqueNames = " + uniqueNames);


        // - - - - -


        // HashMap 활용: <키, 값> -> 저장
        HashMap<String, Integer> memberMap = new HashMap<>();

        // 데이터 추가
        memberMap.put("one", 1);
        memberMap.put("two", 2);
        memberMap.put("three", 3);
        memberMap.put("four", 4);
        memberMap.put("five", 5);
        System.out.println("memberMap = " + memberMap);

        // "키" 중복 불가 - 값이 덮어 씌워짐
        memberMap.put("one", 5555);
        
        // 단건 조회 - 키를 입력하면 값이 들어온다
        Integer memberValue = memberMap.get("three");
        System.out.println("memberValue = " + memberValue);

        // 삭제
        memberMap.remove("five");
        System.out.println(memberMap);

        // 키 확인
        Set<String> ketSet = memberMap.keySet();
        System.out.println("ketSet = " + ketSet);

        // 값 확인
        Collection<Integer> values = memberMap.values();
        System.out.println("values = " + values);
    }
}
