package com.springinaction.knights;

import java.io.PrintStream;

/**
 * The type Slay dragon quest.
 */
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    /**
     * Instantiates a new Slay dragon quest.
     *
     * @param stream the stream
     */
    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
