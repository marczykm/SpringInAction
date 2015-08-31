package com.springinaction.knights;

/**
 * Created by MMARCZYK on 2015-08-31.
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        this.quest.embark();
    }
}
