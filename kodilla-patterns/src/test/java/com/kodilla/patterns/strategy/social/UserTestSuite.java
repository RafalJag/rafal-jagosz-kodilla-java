package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.SnapchatPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefeaultSharingStrategies(){
        //Given
        User steven = new Millenials("Steven");
        User john = new YGeneration("John");
        User james = new ZGeneration("James");

        //When
        String stevenShouldShare = steven.sharePost();
        System.out.println("Steven should: " + stevenShouldShare);
        String johnShouldShare = john.sharePost();
        System.out.println("John should: " + johnShouldShare);
        String jamesShouldShare = james.sharePost();
        System.out.println("James should: " + jamesShouldShare);

        //Then
        assertEquals("Share on Facebook", stevenShouldShare);
        assertEquals("Share on Snapchat", johnShouldShare);
        assertEquals("Share on Twitter", jamesShouldShare);
    }

    @Test
    void testIndividualSharingStrategy(){
        //Given
        User steven = new Millenials("Steven");

        //When
        String stevenShouldShare = steven.sharePost();
        System.out.println("\nSteven should: " + stevenShouldShare);
        steven.setSocialPublisher(new SnapchatPublisher());
        stevenShouldShare = steven.sharePost();
        System.out.println("Steven now should: " + stevenShouldShare);

        //Then
        assertEquals("Share on Snapchat", stevenShouldShare);
    }
}