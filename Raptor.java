
/**
 * Write a description of class Raptor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Raptor extends Dinosaur
{
    public Raptor()
    {
        super("Raptor");
    }

    public boolean attack(Dinosaur def)
    {
        if(def.getType().equals("TRex"))
        {
            if(Math.random() <.45)
            {
                this.update(def, true);
                return true;
            }
            else
            {
                this.update(def, false);
                return false;
            }
        }
        else if(def.getType().equals("Raptor"))
        {
            if(Math.random() < .60)
            {
                this.update(def, true);
                return true;
            }
            else
            {
                this.update(def, false);
                return false;
            }
        }
        else if(def.getType().equals("Anky"))
            {
                 if(Math.random() < .60)
            {
                this.update(def, true);
                return true;
            }
            else
            {
                this.update(def, false);
                return false;
            }
            }
        else 
        return false;
    }
}
