package Service;

import java.util.ArrayList;
import java.util.List;

import Model.Student;
import Model.StudyGroup;
import Model.Teacher;

public class StudyGroupService implements GroupSrevice {
    private List<StudyGroup> studyList = new ArrayList<>();

    @Override
    public void createGroup(Teacher teacher, List<Student> studentsList) {
        int counterGroupId = 0;
        for (StudyGroup group : studyList) {
            if (group.getTeacher().equals(teacher) && group.getStudentsList().equals(studentsList)) {
                System.out.println("Такая группа уже существует");
                return;
            }
            counterGroupId++;
        }
        StudyGroup newStudyGroup = new StudyGroup(counterGroupId + 1, teacher, studentsList);
        studyList.add(newStudyGroup);
    }

    @Override
    public StudyGroup readGroup(int id) {
        for (StudyGroup group : studyList) {
            if (group.getGroupId().equals(id)) {
                return group;
            }
        }
        return null;
    }

    @Override
    public Integer readTeacherId(int id) {
        StudyGroup group = readGroup(id);
        if (group != null) {
            return group.getTeacher().getTeacherId();
        }
        return null;
    }

    @Override
    public List<Integer> readStudentId(int id) {
        StudyGroup group = readGroup(id);
        if (group == null) {
            return null;
        }
        List<Integer> listId = new ArrayList<>();
        List<Student> studentList = group.getStudentsList();
        for (Student student : studentList) {
            listId.add(student.getStudentId());
        }
        return listId;
    }
}
