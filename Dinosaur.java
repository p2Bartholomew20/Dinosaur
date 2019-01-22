
/**
 * Write a description of class Dinosaur here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Dinosaur
{
    private String type;
    private int age;
    private String gender;
    private int wins;
    private int battleCount;
    private int health;
    private boolean isAlive;

    /**
     * Dinosaur constructor 
     * There isn't a default dinosaur, so that is why the type and the attack
     * are going to be abstract and there isn't a default
     * 
     */
    public Dinosaur(String t)
    {
        this.type = t;
        this.age = 0;
        this.wins = 0;
        this.health = 20;
        this.isAlive = true;
        if(Math.random() < 0.5)
        {
            this.gender = "M";
        }
        else
        {
            this.gender = "F";
        }
    }

    /** 
     * ****************************Methods**********************************
     */
    //attack is abstract b/c there are different attacks for different dinos
    public abstract boolean attack(Dinosaur def);

    public void ageUp()
    {
        age++;

        if(this.age < 25)
        {
            this.setHealth(this.getHealth() +10);
        }
        else if(this.age > 25)
        {
            this.setHealth(this.getHealth() -5);
        }
        this.checkHealth();
    }

    public void checkHealth()
    {
        if(this.health == 0)
        {
            if(this.isAlive = true)
            {
                System.out.println("\t" + this.toString() +" just died.");
                this.isAlive = false;
                this.health = 0;
            }
        }
        else if( this.health > 100)
            this.health = 100;
        else if(this.health < 0)
            this.health = 0;
    }

    public void update(Dinosaur def, boolean winner)
    {  
        this.battleCount++;
        def.setBattleCount(def.getBattleCount() +1);
        if(winner == true)
        {
            this.wins++;
            def.setHealth(def.getHealth() -20);
            def.checkHealth();
        }
        else
        {
            def.setWins(def.getWins() +1);
            this.health-=20;
            this.checkHealth();
        }

    }

    public String toString()
    {
        String temp = " ";
        temp = this.type + " " + this.age + " " + this.wins + " " + this.health + " " + this.gender+ " ";

        return temp;
    }

    /**
     * ***************************Getters************************************
     */
    public int getAge()
    {
        return age;
    }   

    public String getType()
    {
        return type;
    }

    public int getHealth()
    {
        return health; 
    }

    public String getGender()
    {
        return gender;
    }

    public int getWins()
    {
        return wins;
    }

    public int getBattleCount()
    {
        return battleCount;
    }

    public boolean getisAlive()
    {
        return isAlive;
    }

    /**
     * ******************************Setters*********************************
     */
    public void setGender(String g)
    {
        this.gender = g;
    }

    public void setType(String t)
    {
        this.type = t;
    }

    public void setBattleCount(int bC)
    {
        this.battleCount = bC;
    }

    public void setAge(int age)
    {
        if(age < 0)
        {
            this.age = 0;
        }
        else
        {
            this.age = age;
        }
    }

    public void setWins(int wins)
    {
        if(wins < 0)
        {
            this.wins = 0;
        }
        else
        {}
    }

    public void setHealth(int health)
    {
        if(health < 0)
        {
            this.health = 0;
        }
        else
        {
            this.health = health;
        }

    }

    public void setisAlive(boolean a)
    {
        this.isAlive = a;
    }
}
