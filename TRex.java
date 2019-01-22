
/**
 * Write a description of class TRex here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TRex extends Dinosaur
{
    public TRex()
    {
        super("TRex");
    }

    public boolean attack(Dinosaur def)
    {
        
        
        if(def.getType().equals("TRex"))
        {
            if(Math.random() < 0.55)
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
            if(Math.random() < 0.70)
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
            if(Math.random() < .75)
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
