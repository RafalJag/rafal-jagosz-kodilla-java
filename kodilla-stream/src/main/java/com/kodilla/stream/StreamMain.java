package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum forumUsers = new Forum();
        Map<Integer, ForumUser> newUserList = forumUsers.getForumUsers().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> LocalDate.now().getYear() - forumUser.getYearOfBirth() > 20)
                .filter(forumUser -> forumUser.getPostsQuantity()>1)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));
        newUserList.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}