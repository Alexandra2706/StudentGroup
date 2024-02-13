package Service;

import java.util.ArrayList;
import java.util.List;

import Model.Student;
import Model.Teacher;
import Model.User;

public class UserService implements DataService {
    private List<User> userList = new ArrayList<>();

    @Override
    public void create(User user) {
        int counterStudent = 0;
        int counterTeacher = 0;
        for (User elem : userList) {
            if (elem instanceof Student) {
                counterStudent++;
            } else {
                counterTeacher++;
            }
        }
        if (user instanceof Student) {
            ((Student) user).setStudentId(counterStudent + 1);
        } else {
            ((Teacher) user).setTeacherId(counterTeacher + 1);
        }
        userList.add(user);
    }

    @Override
    public User read(int id) {
        for (User user : userList) {
            if (user instanceof Student && ((Student) user).getStudentId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> readListStudent() {
        List<User> result = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Student) {
                result.add(user);
            }
        }
        return result;
    }

    @Override
    public User readTeacher(int id) {
        for (User user : userList) {
            if (user instanceof Teacher && ((Teacher) user).getTeacherId().equals(id)) {
                return user;
            }
        }
        return null;
    }
}
