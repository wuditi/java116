import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Homework {
    public static void main(String[] args) throws ParseException {
//        String s = "Hello World";
//        // System.out.println(s.charAt(4));
//        Date date = new Date();
//
//        Date date3 = new Date(System.currentTimeMillis());
//        System.out.println(date3);
//        DateFormat FORMATTER = new SimpleDateFormat("yyyy-MM-dd");
//        String a = FORMATTER.format(date3);
//        System.out.println(FORMATTER.parse(a));
//        Collection collection = new ArrayList();
        Map<String, Student> MAP = new HashMap<String, Student>();
        ArrayList<Map<String, Student>> school1 = new ArrayList<>();
        school1.add(MAP);
        MAP.put("2", new Student("aa", 11));
        MAP.put("1", new Student("bb", 13));
        MAP.put("3", new Student("qw", 12));
        Set<String> map = MAP.keySet();
        for (Map<String, Student> mapa : school1) {

            System.out.println(mapa);
            Set<Map.Entry<String, Student>> students = mapa.entrySet();
            for (Map.Entry<String, Student> student : students) {
                System.out.println(student.getValue());
            }
        }

//        Collection<Student> a = MAP.values();
//        for (Student Value : a) {
//
//            System.out.println();
//
//        }

    }

}

class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}
