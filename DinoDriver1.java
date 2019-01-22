
/**
 * Write a description of class DinoDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DinoDriver1
{
    public static void main (String[] args)
    {

        Dinosaur d1 = new TRex();
        Dinosaur d2 = new Raptor();
        Dinosaur d3 = new Anky();
        d1.setHealth(100);
        d2.setHealth(100);
        d3.setHealth(100);
        int winCount = 0;
        for(int i = 0; i<1000; i++)
        {
            if(d3.attack(d2))
            {
                winCount++;
            }
            System.out.println(d3.toString()+" ********** "+d2.toString());
        }
        System.out.println(""+ winCount+ " out of 100 attacks");
    }
}
