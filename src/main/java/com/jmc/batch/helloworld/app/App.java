package com.jmc.batch.helloworld.app;

import java.util.List;

import com.jmc.batch.helloworld.utils.Utils;

public class App 
{
    public static void main( String[] args )
    {
        List<Integer> numbers=Utils.getPrimaryNumbersFromRange(8, 2001);
        Utils.displayNumbersFromList(numbers);
    }
}
