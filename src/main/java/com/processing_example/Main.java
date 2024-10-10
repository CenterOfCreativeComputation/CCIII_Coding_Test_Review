/*
 *
 * Name:
 * Date: Oct. 2024
 * Description: Review of the coding portion of the test.
 * 
 */

package com.processing_example;

class Noun extends Word
{
    //create the constructor for Noun

    int getOrder()
    {
        return 0; 
    }
}

class Verb extends Word
{
    //create the constructor for Verb

    int getOrder()
    {
        return 1; 
    }
}

//create the DirectObject class. It's word order is 2. Override the print() function to add a println (ie, line ending) at the end.

public class Main  {

    public static void main(String[] args) {

        //create an arraylist of a Noun, Verb, and DirectObject. The actual words can be anything.

        //verify that the arraylist is in the correct order using getOrder(). if so, print "Words added in order!"
        //else print (words out of order!) 

        //now, print your ArrayList sentence. you must use a loop to do this part.

    }
}