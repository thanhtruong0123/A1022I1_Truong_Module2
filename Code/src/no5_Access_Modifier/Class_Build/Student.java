package no5_access_modifier.class_build;

public class Student {
    private static String name = "John";
    private static String classes = "C02";

    Student() {
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Student.name = name;
    }

    public static String getClasses() {
        return classes;
    }

    public static void setClasses(String classes) {
        Student.classes = classes;
    }
}
