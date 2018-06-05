package foodsmash;

/**
 *
 * @author Txai Pereira de Lacerda 50078467
 */
public class Person
{
    private String username;
    private int score;
    private boolean isSelected;

    public Person(String username, int score, boolean isSelected) 
    {
        this.username = username;
        this.score = score;
        this.isSelected = isSelected;
    }

    public String getUsername() 
    {
        return username;
    }

    public void setUsername(String username) 
    {
        this.username = username;
    }

    public int getScore() 
    {
        return score;
    }

    public void setScore(int score) 
    {
        this.score = score;
    }

    public boolean isIsSelected() 
    {
        return isSelected;
    }

    public void setIsSelected(boolean isSelected) 
    {
        this.isSelected = isSelected;
    }
}
