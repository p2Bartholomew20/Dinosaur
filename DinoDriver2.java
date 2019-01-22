import java.util.Scanner;

/**
 * Write a description of class DinoDriver2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DinoDriver2
{

    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Dinosaur[] pop = new Dinosaur[100];
        int winCount = 0;
        int battleCount = 0;
        int rndCount = 0;
        int livingCount = 0;
        int deadBeforeRnd = 0;
        int deadAfterRnd = 0;
        for(int i = 0; i<33; i++)
        {
            pop[i] = new TRex();
        }
        for(int i = 33;i<66; i++)
        {
            pop[i] = new Raptor();
        }
        for(int i = 66; i<pop.length; i++)
        { 
            pop[i] = new Anky();
        }
        for(int i = 0; i<pop.length; i++)
        {
            int rand = (int)(Math.random()*36);
            for(int j = 0; j<rand; j++)
                pop[i].ageUp();
        }
        
        
        while(livingCount>=2)
        {
            for(Dinosaur d: pop)
            {
                
                if(d.getisAlive()==true)
                {
                    Dinosaur defend = DinoDriver2.getDefender(pop, pop[0]);
                    battleCount++;
                    if(d.attack(defend))
                        winCount++;
                }

            }
        }

        rndCount++;
        System.out.println("Total Wins: " +winCount+ " Total Battles: "+battleCount);
        //livingDinos(pop);     
        System.out.println("Total Rounds: "+rndCount);

    }

    public static int livingDinos( Dinosaur[] p)
    {
        int livingCount = 0;
        for(Dinosaur d: p)
        {
            if(d.getisAlive() ==true)
            {
                livingCount++;
            }
            d.setAge(d.getAge()+1);
        }

        System.out.println("There are "+ livingCount+ " Dinosaurs alive.");
        return livingCount;

    }

    public static Dinosaur getDefender(Dinosaur[] p, Dinosaur attacker)
    {
        Dinosaur def = null;

        do
        {
            int rand = (int)(Math.random()*p.length);
            def = p[rand];
        }
        while(def == attacker || def.getHealth() == 0);

        return def;
    }
}
