package View;

import java.util.List;

import Model.User;

public class ListView {
    public void printList(List<? extends User> list) {
        System.out.println("Общий список:");
        for (User elem : list) {
            System.out.println(elem);
        }
    }
}
