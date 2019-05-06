package com.example.q20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Main { 
        /*
         * Use BufferReader to get the input data file, and then turn each of the bufferObjects into its lines
         */
        public static void main(String[] args)
        {    
            String newString;
            StringTokenizer tokenObject = null;
            
            try ( BufferedReader bufferObject = new BufferedReader(new FileReader("src/Data.txt")) ){
                while( (newString = bufferObject.readLine()) != null ){
                    tokenObject = new StringTokenizer(newString, ":"); //This separates the text with every instance of a ':'
                    System.out.println( "Name: " + tokenObject.nextToken() + " " + tokenObject.nextToken() );
                    while( tokenObject.hasMoreTokens() )
                    {
                      
                        System.out.println( "Age: " + tokenObject.nextToken() );
                        System.out.println("State: "+tokenObject.nextToken());
                    }
                    
                    System.out.println();
                }
            }
            catch(FileNotFoundException e){}
            catch(IOException e){}
            catch(NoSuchElementException e) {}
            catch(Exception e) {}
        }
    
    }