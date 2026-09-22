public class Student {
    private String id;
    private String name;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void showInfo() {
        System.out.println(id + " | " + name + " | GPA: " + gpa);
    }
}
ArrayList<Student> students = new ArrayList<>();

students.add(new Student("001", "Somchai", 3.25));
students.add(new Student("002", "Somsri", 3.75));

for (Student s : students) {
    s.showInfo();
}
