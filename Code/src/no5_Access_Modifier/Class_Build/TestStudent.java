package no5_access_modifier.class_build;

public class TestStudent {
    public static void main(String[] args) {
        Student.setName("Trường");
        Student.setClasses("A1022I1");

        System.out.println(Student.getName());
        System.out.println(Student.getClasses());
    }
}
