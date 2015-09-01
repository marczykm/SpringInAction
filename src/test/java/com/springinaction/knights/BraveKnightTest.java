package com.springinaction.knights;

import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * Test for type Brave knight.
 */
public class BraveKnightTest {

    /**
     * Knight should embark on quest.
     */
    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }

}

