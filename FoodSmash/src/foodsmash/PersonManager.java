package foodsmash;

/**
 *
 * @author Txai Pereira de Lacerda 50078467
 */
public class PersonManager
{
    Person[] persons;  
    public void Person(Person[] persons)
    {
        for (Person person : persons) 
        {
            person.setUsername("");
            person.setScore(0);
            person.setIsSelected(false);
        }
    }
}
