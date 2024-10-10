package com.processing_example;

public abstract class Word {
    String whatWord; 

    //1. Create the constructor

    //is this word before the input work?
    boolean before(Word word)
    {
        return getOrder() < word.getOrder(); 
    }

    void print()
    {
        System.out.print(whatWord); 
    }

    //2. Create an abstract method getOrder

}
