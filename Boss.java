import java.util.*;
/**
 *  This class allows to create NPC.
 *  A NPC is a neutral character in the game.
 *  He doesn't attack the player.
 *  He can't die. He is able to give quests to the player.
 *
 *
 * @author  Sixtine Vernhes
 * @version 14/11/18
 */

public class Boss extends Enemy
{
    private List<Quest> quetes;
    /**
     * Creates a Boss who is an actor with an empty quest list at the beginning
     * The quest list will be filled in the constructor with the main quest : get the 6 statuette back
    */
    public Boss(ArrayList aLoot, String aName)
    {
        super(aLoot, aName);
    }

    /**Add a new quest in the Quest list of the player
    return true if the quest is added*/
    public boolean giveQuestToNPC(Quest quest)
    {
        return true;
    }
}
