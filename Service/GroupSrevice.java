package Service;

import java.util.List;

import Model.Student;
import Model.StudyGroup;
import Model.Teacher;

public interface GroupSrevice {

    /**
     * Метода создает Группу(Преподаватель, студенты)
     * 
     * @param teacher      - Преподаватель
     * @param studentsList - Список студентов группы
     */
    public void createGroup(Teacher teacher, List<Student> studentsList);

    /**
     * Метода возвращает Группу(Преподаватель, студенты)
     * 
     * @param id - id группы
     * @return - группу
     */
    public StudyGroup readGroup(int id);
}
