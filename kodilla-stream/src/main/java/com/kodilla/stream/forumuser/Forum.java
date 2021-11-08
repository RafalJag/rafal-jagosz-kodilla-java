package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();
    public Forum(){
        forumUsers.add(new ForumUser(1,"Name LastName1", 'M',
                1991, 1, 11, 0));
        forumUsers.add(new ForumUser(2,"Name LastName2", 'M',
                2010, 2, 12, 20));
        forumUsers.add(new ForumUser(3, "Name LastName3",'M',
                1993, 3, 13, 30));
        forumUsers.add(new ForumUser(4, "Name LastName4", 'F',
                1994, 4, 14, 40));
        forumUsers.add(new ForumUser(5, "Name LastName5",'F',
                1995, 5, 15, 50));
    }

    public List<ForumUser> getForumUsers() {
        return forumUsers;
    }
}