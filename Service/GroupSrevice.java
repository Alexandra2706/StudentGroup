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

    /**
     * Метода возвращает преподавателя группы
     * 
     * @param id - id группы
     * @return - id Преподавателя
     */
    public Integer readTeacherId(int id);

    /**
     * Метода возвращает список студентов группы
     * 
     * @param id - id группы
     * @return - список id студентов
     */
    public List<Integer> readStudentId(int id);
}
