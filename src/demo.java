import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        Student student = new Student("Kien", 30, "a");
        Student student1 = new Student("Nam", 26, "c");
        Student student2 = new Student("Anh", 38, "b" );
        Student student3 = new Student("Tung", 38, "e" );

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for(Student st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Student st : lists){
            System.out.println(st.toString());
        }
        AddressComparator addressComparator = new AddressComparator();
        Collections.sort(lists,addressComparator);
        System.out.println("so sanh theo dia chi");
        for (Student st: lists
             ) {
            System.out.println(st);
        }
    }
}
