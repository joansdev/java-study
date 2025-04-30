package chapter3.optional;

import java.util.Optional;

public class Camp {
    // 속성
    private Student student;

    // 생성자

    // 기능 ** 이 부분만 잘 이해해도 ok
    public Optional<Student> getStudent() { // student에 null이 담길 수도 있다는 것을 명시
        return Optional.ofNullable(student);
//        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

}
