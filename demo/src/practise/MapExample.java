package practise;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> studentMarks = new HashMap<>();

        studentMarks.put("John", 85);
        studentMarks.put("Jane", 92);
        studentMarks.put("Alice", 78);

        System.out.println("Student Marks: " + studentMarks);

        int johnMarks = studentMarks.get("John");
        System.out.println("John's Marks: " + johnMarks);
    }
}