package com.springinaction.knights;

import java.io.PrintStream;

/**
 * Created by MMARCZYK on 2015-08-31.
 */
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
