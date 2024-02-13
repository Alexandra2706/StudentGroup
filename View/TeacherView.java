package View;

import Model.Teacher;

public class TeacherView {
    public void print(Teacher teacher) {
        System.out.println(teacher);
    }

    public void printId(Integer id) {
        if (id == null) {
            System.out.println("Такой группы нет");
        } else {
            System.out.println(id);
        }
    }
}
