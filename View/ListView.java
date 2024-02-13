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

    public void printListId(List<Integer> list) {
        if (list == null) {
            System.out.println("Такой группы нет");
        } else {
            System.out.println("Общий список Id:");
            for (Integer elem : list) {
                System.out.printf("%d ", elem);
            }
        }
    }
}
