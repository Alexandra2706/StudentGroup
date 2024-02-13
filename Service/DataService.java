package Service;

import java.util.List;

import Model.User;

public interface DataService {

    /**
     * Метод создает студента или преподавателя
     * и заносит их в общий список
     * 
     * @param user - студент или преподватеь
     */
    public void create(User user);

    /**
     * Метод возвращает студента из общего списка
     * 
     * @param id - id студента
     * @return студент
     */
    public User read(int id);

    /**
     * Метод возвращает преподавателя из общего списка
     * 
     * @param id - id преподавателя
     * @return преподавателя
     */
    public User readTeacher(int id);

    /**
     * Метод создает общий список студентов
     * 
     * @return список студентов
     */
    public List<User> readListStudent();

}
