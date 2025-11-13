import java.util.*;

public class StudentManagementSystem {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // Add Student
    public void addStudent() {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();

        for (Student s : students) {
            if (s.getRollNumber() == roll) {
                System.out.println("Roll number already exists!");
                return;
            }
        }

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        students.add(new Student(roll, name, email, dept));
        System.out.println("Student Added!");
    }

    // View All
    public void viewStudents() {
        if (students.isEmpty()) 
            System.out.println("No records found!");
        else 
            students.forEach(System.out::println);
    }

    // Search
    public void searchStudent() {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        for (Student s : students) {
            if (s.getRollNumber() == roll) { 
                System.out.println("Found: " + s); 
                return; 
            }
        }
        System.out.println("Not Found!");
    }

    // Update
    public void updateStudent() {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt(); 
        sc.nextLine();
        for (Student s : students) {
            if (s.getRollNumber() == roll) {
                System.out.print("New Name: ");
                s.setName(sc.nextLine());
                System.out.print("New Email: "); 
                s.setEmail(sc.nextLine());
                System.out.print("New Dept: "); 
                s.setDepartment(sc.nextLine());
                System.out.println(" Updated!");
                return;
            }
        }
        System.out.println("Not Found!");
    }

    // Delete
    public void deleteStudent() {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        students.removeIf(s -> s.getRollNumber() == roll);
        System.out.println("Deleted (if existed)!");
    }
}
