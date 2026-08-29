import java.util.ArrayList;
import java.util.List;

public class StudentController {

    private List<String> students = new ArrayList<>();

    public void addStudent(String name) {
        students.add(name);
        System.out.println("Estudiante agregado: " + name);
    }

    public void removeStudent(String name) {
        students.remove(name);
        System.out.println("Estudiante eliminado: " + name);
    }

    public void listStudents() {
        System.out.println("Lista de estudiantes:");
        for (String student : students) {
            System.out.println("- " + student);
        }
    }
}
