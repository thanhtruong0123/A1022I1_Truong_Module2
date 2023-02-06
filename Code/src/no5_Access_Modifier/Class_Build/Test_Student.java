package no5_Access_Modifier.Class_Build;

public class Test_Student {
    public static void main(String[] args) {
        Student.setName("Trường");
        Student.setClasses("A1022I1");

        System.out.println(Student.getName());
        System.out.println(Student.getClasses());
    }
}
