package Model;

import java.util.List;

public class StudyGroup extends Group {
    private Integer groupId;

    public StudyGroup(Integer groupId, Teacher teacher, List<Student> studentsList) {
        super(teacher, studentsList);
        this.groupId = groupId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "Группа номер: " + groupId + ", " + super.teacher + ",\nСтуденты: " + super.studentsList
                + "\n";
    }

}
