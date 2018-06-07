package foodsmash;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Txai Pereira de Lacerda 50078467
 */
public class PersonManager extends Person
{   
    List<Person> players = new ArrayList<>();
    
    public PersonManager(String username, int score, boolean isSelected) 
    {
        super(username, score, isSelected);
    }

    public List<Person> getPlayers() 
    {
        return this.players;
    }

    public void addPlayer(Person player) 
    {
        this.players.add(player);
    }    

    public void updatePlayer(Person player) {
        this.players.stream().filter(o ->  
                o.getUsername().equals(player.getUsername()));
    }
    
    
    
    
}
