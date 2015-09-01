package com.springinaction.knights;

import java.io.PrintStream;

/**
 * The type Minstrel.
 */
public class Minstrel {

    private PrintStream stream;

    /**
     * Instantiates a new Minstrel.
     *
     * @param stream the stream
     */
    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    /**
     * Sing before quest.
     */
    @SuppressWarnings("unused")
    public void singBeforeQuest() {
        stream.println("Fa la la, the knight is so brave!");
    }

    /**
     * Sing after quest.
     */
    @SuppressWarnings("unused")
    public void singAfterQuest() {
        stream.println("Tee hee hee, the brave knight did embark on a quest!");
    }
}
