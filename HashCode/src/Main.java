import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a = 42;
        System.out.println(((Integer) a).hashCode());
        int b = -42;
        System.out.println(((Integer) b).hashCode());

        double c = 3.1415926;
        System.out.println(((Double) c).hashCode());

        String d = "imooc";
        System.out.println(d.hashCode());

        Student student = new Student(3, 2, "bobo", "liu");
        System.out.println(student.hashCode());

        HashSet<Student> set = new HashSet<>();
        set.add(student);

        HashMap<Student, Integer> scores = new HashMap<>();
        scores.put(student, 100);

        Student student2 = new Student(3, 2, "BOBO", "Liu");
        System.out.println(student2.hashCode());
    }
}
