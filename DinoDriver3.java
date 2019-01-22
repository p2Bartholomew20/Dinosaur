import java.util.Scanner;
import java.util.ArrayList;
public class DinoDriver3
{
    public static void main (String[] args)
    {
        ArrayList<Dinosaur> myPop =  new ArrayList<Dinosaur>();

        System.out.println("How many dinosaurs are in this population?");
        Scanner input = new Scanner(System.in);
        int popNum = input.nextInt();
        
        for(int i = 0; i < popNum; i++)
        {
            double randNum = Math.random();
            int age = 0;
            if(randNum <.33)

            {
                myPop.add(new TRex());
                age = (int)(Math.random()*10);
            }
            else if(randNum < .67)
            {
                myPop.add(new Raptor());
                age = (int)(Math.random()*10);
            }
            else
            {
                myPop.add(new Anky());
                age = (int)(Math.random()*10);
            }

        }
        
        for(Dinosaur d: myPop)
        {

            int rand = (int)(Math.random()*35);
            for(int i = 0; i<rand; i++)
                d.ageUp();
        }
        
        for(int i = 0; i< myPop.size(); i++)
        {
            Dinosaur attacker = myPop.get(i);
            int defIndex = DinoDriver3.getDefender(myPop, attacker);
            Dinosaur defender = defIndex
            
            attacker.attack(defender);
            
            if(popNum >= 2)
            {
                getDefender(myPop, null);
            }
        }
        
        for(Dinosaur d: myPop )
        {
            System.out.println(d);
        }
        livingDinos(myPop);
        
    }

    public static int livingDinos( ArrayList<Dinosaur> p)
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

    public static int getDefender(ArrayList<Dinosaur> p, Dinosaur attacker)
    {
        Dinosaur def = null;
        int rand = 0;
        do
        {
            rand = (int)(Math.random()*p.size());
            def = p.get(rand);
        }
        while(def == attacker || def.getHealth() == 0);
        System.out.println(def);
        return rand;
    }
}
