import java.util.HashSet;
import java.util.HashMap;

public class MainHashCode {

    public static void main(String[] args) {

        int a = 42;
        System.out.println(((Integer)a).hashCode());

        int b = -42;
        System.out.println(((Integer)b).hashCode());

        double c = 3.1415926;
        System.out.println(((Double)c).hashCode());

        String d = "java";
        System.out.println(d.hashCode());

        HashStudent student = new HashStudent(3, 2,"JAVA", "spring");
        System.out.println(student.hashCode());

        HashSet<HashStudent> set = new HashSet<>();
        set.add(student);

        HashMap<HashStudent, Integer> scores = new HashMap<>();
        scores.put(student, 100);
    }
}
