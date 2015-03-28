package spellchecker;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

/**
 * This Class creates a HashSet by reading a file and storing each word 
 * free of any punctuation or any number. It provides a function to print out 
 * the HashSet in non-sorted order. 
 * @author George
 */
public class InputFile {
    
    HashSet<String> input;
    
    /**
     * InputFile Constructor instantiates the HashSet Input
    */
    InputFile()
    {
        input = new HashSet<String>();
    }
    
    
    /**
     * Using the BufferedReader class, it reads a file specified by the path, line by line
     * and stores each word in the HashSet. The line is split on whitespace and is stripped of 
     * any punctuation and any Numbers.
     * 
     * @param Path String Type
     * @return HashSet
     * @throws FileNotFoundException
     * @throws IOException 
     */
   public HashSet constructInput(String Path) throws FileNotFoundException, IOException
    {
        String line;
        
        BufferedReader br = new BufferedReader(new FileReader(Path));
        
          while ((line = br.readLine()) != null) {
             
            line = line.replaceAll("[-]"," ");
            String [] Words= line.replaceAll("[^a-zA-Z ]", "").split("\\s+");
              for(int i =0; i < Words.length;i++)
              {
                  //Add to HashSet
                  input.add(Words[i]);
              }
        }
     return input;
    }
    
    /**
     * Print the HashSet Input  
     */
    public void printInput()
    {
         Iterator iterator = input.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
    
}
