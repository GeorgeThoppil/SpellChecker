package spellchecker;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

/**
 * This class checks an input file for any incorrect spelling with a Dictionary File
 * @author George
 */
public class SpellChecker {

    /**
     * Takes in two parameters: HasSet input, Dictionary dictionary. 
     * Iterates over the input HashSet and checks if it is contained in
     * the Dictionary. Prints out the word if it is not contained in the 
     * dictionary. 
     * 
     * @param input HashSet Type
     * @param dictionary Dictionary Class
     */
   public static void printIncorrectWords(HashSet input, Dictionary dictionary)
    {
        //Iterate through the input HashSet
         Iterator iterator = input.iterator();
        while(iterator.hasNext())
        {
            String Word = iterator.next().toString();
            
            //Checks to see if the input word is in the dictionary. If not, it is then printed
            if(!dictionary.checkWord(Word.toLowerCase()))
                  {
                      System.out.println(Word);
                 }
        }
    }
    
    /**
     *
     * Calls on the Dictionary class to create the Dictionary as a TreeSet and calls
     * the InputFile class to create the input as a HashSet and prints out the incorrect words
     * 
     * Must provide the name of the Dictionary File as well as the name of the InputFile
     * in String [] args in order to execute program
     * 
     * <p><b> Execute instruction: java -jar SpellChecker.jar InputFile DictionaryFile</b></p>
     * 
     * @param args[0] : Name of the Input File
     * @param args[1] : Name of the Dictionary File
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        if(args.length == 2)
        {
            //Construct the input into a HashSet
            InputFile input = new InputFile();
            HashSet checkFile = input.constructInput(args[0]);

            //Construct the dictionary into a TreeSet
            Dictionary dictionary = new Dictionary();
            dictionary.constructDictionary(args[1]);

            //Print the incorrect Words
            printIncorrectWords(checkFile,dictionary);
        }
        else
        {
            System.out.println("Needs two Arguements to run this program: ");
            System.out.println("Arguement 1: Path to Input File to be Checked");
            System.out.println("Arguement 2: Path to the Dictionary File");
        }
        
    }
    
}
