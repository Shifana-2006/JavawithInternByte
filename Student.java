public class Student {
    private int rollNumber;
    private String name;
    private String email;
    private String department;

    // Constructor
    public Student(int rollNumber, String name, String email, String department) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.email = email;
        this.department = department;
    }

    // Getters
    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Display student info
    @Override
    public String toString() {
        return "Roll No: " + rollNumber +
               ", Name: " + name +
               ", Email: " + email +
               ", Department: " + department;
    }
}


