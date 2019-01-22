import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListTester
{
    public static void main (String[] args)
    {
        System.out.println("How many words?");
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int numWords = scan.nextInt();
        System.out.println(numWords);
        
        ArrayList<String> words = new ArrayList<String>();
        
        
        words.add("fun");
        words.add("Cliff");
        words.add(0, "DownSet");
        words.remove("fun");
        System.out.println(words.size());
        System.out.println(words);
    }
}
