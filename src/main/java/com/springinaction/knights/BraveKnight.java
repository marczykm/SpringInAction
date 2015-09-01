package com.springinaction.knights;


/**
 * The type Brave knight.
 */
public class BraveKnight implements Knight {


    private Quest quest;

    /**
     * Instantiates a new Brave knight.
     *
     * @param quest the quest
     */
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        this.quest.embark();
    }


}
