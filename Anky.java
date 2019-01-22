
/**
 * Write a description of class Ankylosaurus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Anky extends Dinosaur
{
   public Anky()
   {
       super("Anky");
    }
    
    public boolean attack(Dinosaur def)
    {
        if(def.getType().equals("Anky"))
        {
            if(Math.random() <.62)
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
        else if(def.getType().equals("TRex"))
        {
            if(Math.random() < .25)
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
            if(Math.random() < .44)
            {
                 this.update(def, true);
                return true;
            }
            else
            {
                this.update(def, false);
                return false;
            }
        else
        return false;

    }
}
