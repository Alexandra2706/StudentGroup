package Controller;

import java.util.Arrays;
import java.util.List;

import Model.Student;
import Model.StudyGroup;
import Model.Teacher;
import Model.User;
import Service.StudyGroupService;
import Service.UserService;
import View.GroupView;
import View.ListView;
import View.StudentView;
import View.TeacherView;

public class Controller {
    private UserService service;
    private StudentView studentView;
    private TeacherView teacherView;
    private ListView listView;
    private GroupView groupView;
    private StudyGroupService studyService;

    public Controller() {
        service = new UserService();
        studentView = new StudentView();
        teacherView = new TeacherView();
        listView = new ListView();
        studyService = new StudyGroupService();
        groupView = new GroupView();
    }

    public void run() {
        System.out.println("----------Студенты и преподаватели----------");
        Student student1 = new Student("Иванов Петр", "01.01.1999", 1);
        Student student2 = new Student("Петров Дмитрий", "04.02.1998", 2);
        Student student3 = new Student("Сидоров Михаил", "12.06.1999", 2);
        Teacher teacher1 = new Teacher("Иванов Иван Иванович", "02.05.1981", 1);
        Teacher teacher2 = new Teacher("Петров Петр Петрович", "09.11.1988", 1);
        service.create(student1);
        service.create(student2);
        service.create(student3);
        service.create(teacher1);
        service.create(teacher2);
        Student result = (Student) service.read(1);
        studentView.print(result);
        Teacher resultTeacher1 = (Teacher) service.readTeacher(1);
        teacherView.print(resultTeacher1);
        List<User> resultList = service.readListStudent();
        listView.printList(resultList);
        System.out.println("--------Группы----------");
        studyService.createGroup(teacher1, Arrays.asList(student1, student3));
        studyService.createGroup(teacher1, Arrays.asList(student2));
        studyService.createGroup(teacher2, Arrays.asList(student1, student3));
        StudyGroup group1 = studyService.readGroup(1);
        groupView.groupPrint(group1);
        StudyGroup group2 = studyService.readGroup(2);
        groupView.groupPrint(group2);
        StudyGroup group3 = studyService.readGroup(3);
        groupView.groupPrint(group3);
    }

}
