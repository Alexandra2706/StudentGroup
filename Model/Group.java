package Model;

import java.util.List;

public abstract class Group {
    protected Teacher teacher;
    protected List<Student> studentsList;

    public Group(Teacher teacher, List<Student> studentsList) {
        this.teacher = teacher;
        this.studentsList = studentsList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    @Override
    public String toString() {
        return "Group [teacher=" + teacher + ", studentsList=" + studentsList + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((teacher == null) ? 0 : teacher.hashCode());
        result = prime * result + ((studentsList == null) ? 0 : studentsList.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Group other = (Group) obj;
        if (teacher == null) {
            if (other.teacher != null)
                return false;
        } else if (!teacher.equals(other.teacher))
            return false;
        if (studentsList == null) {
            if (other.studentsList != null)
                return false;
        } else if (!studentsList.equals(other.studentsList))
            return false;
        return true;
    }

}
