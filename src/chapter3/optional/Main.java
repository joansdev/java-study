package chapter3.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Camp camp = new Camp();
        // 1. student = null
        Student yohan = new Student("yohan"); // 학생 데이터 입력
        System.out.println(yohan);

        // Optional 객체 활용
        Optional<Student> studentOptional = camp.getStudent(); //Student객체를 옵셔널로 감싸 -> 저 객체엔 null이 담길 수 있겠구나
        boolean flag = studentOptional.isPresent(); // isPresent는 안에 데이터 있는지, null인지 반환

        if (flag) {
            Student student = studentOptional.get();
            String studentName = student.getName();
            System.out.println("studentName = " + studentName);
        } else {
            System.out.println("학생 데이터 없음");
        }


        // 직접적인 null 처리방법
//        String studentName;
//        if (student != null){
//            studentName = student.getName();
//        } else {
//            studentName = "등록된 학생이 아님";
//        }
//        System.out.println("studentName = " + studentName);

        // 2. NullPointerException
//        String studentName = student.getName();
//        System.out.println("student = " + student);


    }
}
