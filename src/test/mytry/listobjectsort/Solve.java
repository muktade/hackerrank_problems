package test.mytry.listobjectsort;

import java.util.ArrayList;
import java.util.List;

public class Solve {
    List<User> add() {
        List<User> userList = new ArrayList<User>();
        User u1 = new User(1, "aa", "am@gamil.com");
        User u2 = new User(1, "aab", "ac@gamil.com");
        User u3 = new User(1, "aaa", "ama@gamil.com");
        User u4 = new User(2, "abb", "amae@gamil.com");
        User u5 = new User(2, "aba", "aacm@gamil.com");
        User u6 = new User(4, "aac", "abam@gamil.com");
        User u7 = new User(2, "aca", "aavm@gamil.com");
        userList.add(u1);
        userList.add(u2);
        userList.add(u4);
        userList.add(u3);
        userList.add(u5);
        userList.add(u7);
        userList.add(u6);
        return userList;
    }

    public static void main(String[] args) {
        List<User> list = new ArrayList<User>();
        Solve sl = new Solve();
        list = sl.add();
        ///sorting
        list.sort((u1,u2)->(u1.getId()- u2.getId())!=0? u1.getId()- u2.getId() : u1.getName().compareTo(u2.getName()));
        /////
        for (User u : list) {
            System.out.println(u.getId()+" "+u.getName()+" "+u.getEmail());
        }
    }
}
