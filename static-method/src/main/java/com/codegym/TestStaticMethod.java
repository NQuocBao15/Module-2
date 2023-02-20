package com.codegym;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change(); // gọi thay đổi phương thức(method)

        // tạo dối tượng
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");

        // gọi hiển thị phương thức(method)
        s1.display();
        s2.display();
        s3.display();
    }
}
