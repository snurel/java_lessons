import Car.*;

import java.lang.reflect.Array;
import java.util.*;

public class MainUnit {
    public static void main(String[] args) {
        User user1 = new User(1, "samet", 35, "developer");
        User user2 = new User(2, "hakan", 30, "engineer");
        User user3 = new User(3, "zehra", 22, "student");

        ArrayList<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        for (User user: userList){
            System.out.println(String.format("user name is %s and age is %d | status is %s", user.getName(), user.getAge(), user.getAgeStatus()));
        }

        int comingId = 3;
        int comingScore = 10;

        for (User user: userList){
            if (user.getId() == comingId){
                user.setScore(comingScore);
            }
        }

        HashMap<Integer, User> users = new HashMap<Integer, User>();
        users.put(user1.getId(), user1);
        users.put(user2.getId(), user2);
        users.put(user3.getId(), user3);

        users.get(comingId).setScore(comingScore);
    }
}