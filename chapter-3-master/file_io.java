/*********************************************
 * 
 * maggie sanborn
 * 10/14/16
 * file io
 * 
 *********************************************/
 
 import java.util.*;
 import java.text.*;
 import java.io.*;
 
public class file_io
{
    /**
     * Constructor for objects of class practice_prog
     */
    
    public static void main(String[] args) throws IOException
    {
        DecimalFormat fmt = new DecimalFormat("0.00");
        String word;
        int countwords = 0, len, totallen = 0, avg;
        int cp = 0, cn = 0, cy = 0;
        
        Scanner scanFile1 = new Scanner(new File ("speaches\\gwinaugural.txt"));
        
        System.out.println("\n");
        System.out.println("-------------------------------\n");
        for(int i=0; i <3; i++){
            String ln = scanFile1.nextLine();
            System.out.println(ln);
        }
        
        while (scanFile1.hasNext()){
            word = scanFile1.next();
            countwords++;
            
            //System.out.println(word);
            
            len = word.length();
            
            totallen += len;
            
            /**/
            
            if (word.equalsIgnoreCase("people"))
            cp++;
            if (word.equalsIgnoreCase("no"))
            cn++;
            if (word.equalsIgnoreCase("our"))
            cy++;
            /**/
        }
        avg = totallen/countwords;
       
        
        System.out.print("total number of words: " + countwords);
        System.out.print("\navg length of words: " + avg);
        System.out.print( "\npeople: " + cp  );
        System.out.print("\nno: " + cn );
        System.out.print("\nour: " + cy );
        //System.out.print("total: " + countwords);
        
        
        /************************************************************************************
         ************************************************************************************/
         
        
        Scanner scanFile2 = new Scanner(new File ("speaches\\fillmore.txt"));
        
        countwords = 0;
        totallen = 0;
        cp = 0;
        cn = 0;
        cy = 0;
        
        
        System.out.println("\n");
        System.out.println("-------------------------------\n");
        for(int i=0; i <3; i++){
            String ln = scanFile2.nextLine();
            System.out.println(ln);
        }
        
        while (scanFile2.hasNext()){
            word = scanFile2.next();
            countwords++;
            
            //System.out.println(word);
            
            len = word.length();
            
            totallen += len;
            
            /**/
            
            if (word.equalsIgnoreCase("people"))
            cp++;
            if (word.equalsIgnoreCase("no"))
            cn++;
            if (word.equalsIgnoreCase("our"))
            cy++;
            /**/
        }
        avg = totallen/countwords;
        System.out.print("total number of words: " + countwords);
        System.out.print("\navg length of words: " + avg);
        System.out.print("\npeople: " + cp + "\nno: " + cn + "\nour: " + cy);

        
        /************************************************************************************
         ************************************************************************************/
         
        
        Scanner scanFile3 = new Scanner(new File ("speaches\\gwbush.txt"));
        
        countwords = 0;
        totallen = 0;
        cp = 0;
        cn = 0;
        cy = 0;
        
        System.out.println("\n");
        System.out.println("-------------------------------\n");
        for(int i=0; i <3; i++){
            String ln = scanFile3.nextLine();
            System.out.println(ln);
        }
        //System.out.println("");
        
        while (scanFile3.hasNext()){
            word = scanFile3.next();
            countwords++;
            
            //System.out.println(word);
            
            len = word.length();
            
            totallen += len;
            
            /**/
            
            if (word.equalsIgnoreCase("people"))
            cp++;
            if (word.equalsIgnoreCase("no"))
            cn++;
            if (word.equalsIgnoreCase("our"))
            cy++;
            /**/
        }
        avg = totallen/countwords;
        System.out.print("total number of words: " + countwords);
        System.out.print("\navg length of words: " + avg);
        System.out.print("\npeople: " + cp + "\nno: " + cn + "\nour: " + cy);
        /**/
        /**/
    }
}













