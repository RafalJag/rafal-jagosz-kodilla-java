package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {

    private List userNamesListGenerator(int usersQuanity) {
        List<String> userNames = new LinkedList<>();
        for (int i = 0; i < usersQuanity; i++) {
            userNames.add("User" + i);
        }
        return userNames;
    }

    @Mock
    private Statistics statisticsMock;


    @Test
    void test0Posts() {
        StatisticsCalculator statistics = new StatisticsCalculator();

        //Given
        List<String> userNames = userNamesListGenerator(10);
        int statsComments = 10;
        int statsPosts = 0;

        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(statsComments);
        when(statisticsMock.postsCount()).thenReturn(statsPosts);

        //When
        statistics.calculateAdvStatistics(statisticsMock);
        double averageCommentsPerPost = statistics.getAverageCommentsPerPost();
        double averageCommentsPerUser = statistics.getAverageCommentsPerUser();
        double averagePostPerUser = statistics.getAveragePostPerUser();


        //Then
        Assertions.assertEquals(0, averageCommentsPerPost);
        Assertions.assertEquals(1, averageCommentsPerUser);
        Assertions.assertEquals(0, averagePostPerUser);
    }

    @Test
    void test1000Posts() {
        StatisticsCalculator statistics = new StatisticsCalculator();

        //Given
        List<String> userNames =userNamesListGenerator(50);
        int statsComments = 50;
        int statsPosts = 1000;

        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(statsComments);
        when(statisticsMock.postsCount()).thenReturn(statsPosts);

        //When
        statistics.calculateAdvStatistics(statisticsMock);
        double averageCommentsPerPost = statistics.getAverageCommentsPerPost();
        double averageCommentsPerUser = statistics.getAverageCommentsPerUser();
        double averagePostPerUser = statistics.getAveragePostPerUser();


        //Then
        Assertions.assertEquals(0.05,averageCommentsPerPost);
        Assertions.assertEquals(1,averageCommentsPerUser);
        Assertions.assertEquals(20,averagePostPerUser);
    }

    @Test
    void test0Comments() {
        StatisticsCalculator statistics = new StatisticsCalculator();

        //Given
        List<String> userNames =userNamesListGenerator(10);
        int statsComments = 0;
        int statsPosts = 10;

        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(statsComments);
        when(statisticsMock.postsCount()).thenReturn(statsPosts);

        //When
        statistics.calculateAdvStatistics(statisticsMock);
        double averageCommentsPerPost = statistics.getAverageCommentsPerPost();
        double averageCommentsPerUser = statistics.getAverageCommentsPerUser();
        double averagePostPerUser = statistics.getAveragePostPerUser();


        //Then
        Assertions.assertEquals(0,averageCommentsPerPost);
        Assertions.assertEquals(0,averageCommentsPerUser);
        Assertions.assertEquals(1,averagePostPerUser);
    }

    @Test
    void testLessCommentsThanPosts() {
        StatisticsCalculator statistics = new StatisticsCalculator();

        //Given
        List<String> userNames = userNamesListGenerator(10);
        int statsComments = 5;
        int statsPosts = 10;

        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(statsComments);
        when(statisticsMock.postsCount()).thenReturn(statsPosts);

        //When
        statistics.calculateAdvStatistics(statisticsMock);
        double averageCommentsPerPost = statistics.getAverageCommentsPerPost();
        double averageCommentsPerUser = statistics.getAverageCommentsPerUser();
        double averagePostPerUser = statistics.getAveragePostPerUser();


        //Then
        Assertions.assertEquals(0.5,averageCommentsPerPost);
        Assertions.assertEquals(0.5,averageCommentsPerUser);
        Assertions.assertEquals(1,averagePostPerUser);
    }

    @Test
    void testMoreCommentsThanPosts() {
        StatisticsCalculator statistics = new StatisticsCalculator();

        //Given
        List<String> userNames =userNamesListGenerator(10);
        int statsComments = 10;
        int statsPosts = 5;

        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(statsComments);
        when(statisticsMock.postsCount()).thenReturn(statsPosts);

        //When
        statistics.calculateAdvStatistics(statisticsMock);
        double averageCommentsPerPost = statistics.getAverageCommentsPerPost();
        double averageCommentsPerUser = statistics.getAverageCommentsPerUser();
        double averagePostPerUser = statistics.getAveragePostPerUser();


        //Then
        Assertions.assertEquals(2,averageCommentsPerPost);
        Assertions.assertEquals(1,averageCommentsPerUser);
        Assertions.assertEquals(0.5,averagePostPerUser);
    }

    @Test
    void test0Users() {
        StatisticsCalculator statistics = new StatisticsCalculator();

        //Given
        List<String> userNames =userNamesListGenerator(0);
        int statsComments = 0;
        int statsPosts = 0;

        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(statsComments);
        when(statisticsMock.postsCount()).thenReturn(statsPosts);

        //When
        statistics.calculateAdvStatistics(statisticsMock);
        double averageCommentsPerPost = statistics.getAverageCommentsPerPost();
        double averageCommentsPerUser = statistics.getAverageCommentsPerUser();
        double averagePostPerUser = statistics.getAveragePostPerUser();


        //Then
        Assertions.assertEquals(0,averageCommentsPerPost);
        Assertions.assertEquals(0,averageCommentsPerUser);
        Assertions.assertEquals(0,averagePostPerUser);
    }

    @Test
    void test100Users() {
        StatisticsCalculator statistics = new StatisticsCalculator();

        //Given
        List<String> userNames =userNamesListGenerator(100);
        int statsComments = 600;
        int statsPosts = 200;

        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(statsComments);
        when(statisticsMock.postsCount()).thenReturn(statsPosts);

        //When
        statistics.calculateAdvStatistics(statisticsMock);
        double averageCommentsPerPost = statistics.getAverageCommentsPerPost();
        double averageCommentsPerUser = statistics.getAverageCommentsPerUser();
        double averagePostPerUser = statistics.getAveragePostPerUser();


        //Then
        Assertions.assertEquals(3,averageCommentsPerPost);
        Assertions.assertEquals(6,averageCommentsPerUser);
        Assertions.assertEquals(2,averagePostPerUser);
    }
}