package spellchecker;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * This Class creates a Dictionary by reading a file and storing each word 
 * into a TreeSet. It provides a function to check if a word is contained 
 * in the dictionary as well as prints out the dictionary in Alphabetic order. 
 * @author George
 */
public class Dictionary {

    TreeSet<String> dictionary;
    
    /**
     * Dictionary Constructor instantiates the TreeSet Dictionary
    */
    Dictionary()
    {
        dictionary = new TreeSet<String>();
    }
        
    /**
    * Takes a String and checks if it is contained in the Dictionary. 
    * Returns true if the String Word is in Dictionary(TreeSet).
    * 
    * @param Word String Type
    * @return Boolean 
    */
    public Boolean checkWord(String Word)
    {
        if(dictionary.contains(Word))
        {
            return true;
        }
        else 
            return false;
    }
    
    /**
    * Using the BufferedReader class, it reads a file specified by the path, line by line
    * and stores each word in the dictionary(TreeSet). The word is stripped of any punctuation and
    * any Numbers and is stored in lowercase format.    
    *
    * @param Path String Type
    * @throws FileNotFoundException
    * @throws IOException 
    */
    public void constructDictionary(String Path) throws FileNotFoundException, IOException
    {
        String line;
        BufferedReader br = new BufferedReader(new FileReader(Path));
        
        while ((line = br.readLine()) != null) {
            dictionary.add(line.replaceAll("[^a-zA-Z]", "").toLowerCase());
        }
        
        
    }
    /**
    * Print the Dictionary(TreeSet) which is sorted Alphabetically  
    */
    public void printDictionary()
    {
          Iterator iterator = dictionary.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        
    }
    
}
