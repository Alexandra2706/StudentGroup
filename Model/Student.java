package Model;

public class Student extends User {
    private Integer studentId;

    public Student(String name, String birthday, int studentId) {
        super(name, birthday);
        this.studentId = studentId;
    }

    public Student() {
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Студент Id=" + studentId + ", " + super.name + ", дата рождения: " + super.birthday + ";";
    }
}
