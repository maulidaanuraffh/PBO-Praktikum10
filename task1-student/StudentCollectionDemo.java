import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class StudentCollectionDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("S001", "Rina", "Computer Science", "Bandung"));
        students.add(new Student("S002", "Andi", 10, "Cimahi"));
        students.add(new Student("S003", "Dewi", "Information Systems", "Garut"));
        students.add(new Student("S004", "Budi", "Computer Science", "Bandung"));
        students.add(new Student("S005", "Citra", 20, "Sumedang"));

        System.out.println("=== Sebelum Sort ===");
        for (Student s : students) {
            System.out.println(s);
        }

        // Step 4: Sort berdasarkan name
        Collections.sort(students, Comparator.comparing(Student::getName));

        System.out.println("\n=== Setelah Sort by Name ===");
        for (Student s : students) {
            System.out.println(s);
        }

        // Step 5: Eksperimen operasi List
        students.add(new Student("S006", "Zaki", "Computer Science", "Jakarta"));
        System.out.println("\nSetelah tambah S006 (tidak otomatis terurut): " + students.get(students.size() - 1));
        System.out.println("Elemen index ke-1: " + students.get(1));
        System.out.println("Size sebelum remove: " + students.size());
        students.remove(0);
        System.out.println("Size sesudah remove index 0: " + students.size());

        // Step 6: Simpan 5 Student pada Vector
        Vector<Student> vector = new Vector<>();
        vector.add(new Student("V001", "Alya", "Computer Science", "Bandung"));
        vector.add(new Student("V002", "Raka", "Accounting", "Cimahi"));
        vector.add(new Student("V003", "Sinta", "Computer Science", "Bandung"));
        vector.add(new Student("V004", "Dimas", "Mechanical Engineering", "Garut"));
        vector.add(new Student("V005", "Nadia", "Computer Science", "Sumedang"));

        // Step 7: Filter Computer Science
        System.out.println("\n=== Filter Computer Science (Vector) ===");
        for (Student s : vector) {
            if (s.getDepartment() instanceof String 
                    && ((String) s.getDepartment()).equalsIgnoreCase("Computer Science")) {
                System.out.println(s);
            }
        }
    }
}