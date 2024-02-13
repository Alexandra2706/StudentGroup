package Model;

public class Teacher extends User {
    private Integer teacherId;

    public Teacher(String name, String birthday, int teacherId) {
        super(name, birthday);
        this.teacherId = teacherId;
    }

    public Teacher() {
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Преподаватель Id=" + teacherId + ", " + super.name + ", дата рождения: " + super.birthday + ";";
    }

    public Integer getTeacherId() {
        return teacherId;
    }

}
