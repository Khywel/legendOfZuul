import java.util.*;
/**
 *
 *
 *
 * @author  Sixtine Vernhes
 * @version 2018.11.14
 */
public class Enemy extends Actor
{
    private ArrayList loot = new ArrayList();
    /**
     * Constructor of an enemy
     *  @param loot list of loot of an enemy, can be have null value
     */
    public Enemy(ArrayList aLoot, String name)
    {
    	super(name);
	loot = aLoot;
    }

    /**
     * @return list of loot of an enemy 
     */
    public ArrayList getLoot()
    {
    }
	
	/**
	 * random to know if magic attack or physic attack 
	 * if magic attack => verify if mana >= 1 and call spell attack method
	 * if mana = 0, so do physic attack
	 * if physic attack => call physic attack method
	 */
	public void attack()
	{
	}
	
	/**
	 * random between 0-1 to know which spell is used
	 * if 0 : health , heal = random 1-20 + intel enemy 
	 * if 1 : attack the player, dammage = random 1-20 + intel enemy 
	 * remove 1 mana 
	 * @return heal : boolean which indicate if the spell is an heal or not 7
	 * @return nb : integer calculated with heal formula or dammage formula
	 */
	public void spellAttack()
	{
	}
	
	/**
	 * physic attack, dammage = random 1-20 + strenght enemy
	 * @return dammage calculated before
	 */
	public int physicAttack()
	{
	}	
	
}
