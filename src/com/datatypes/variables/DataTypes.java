package com.datatypes.variables;


public class DataTypes {

    //primative data types
    //byte	1 byte	Stores whole numbers from -128 to 127
    //short	2 bytes	Stores whole numbers from -32,768 to 32,767
    //int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
    //long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    //float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    //double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
    //boolean	1 bit	Stores true or false values
    //char	2 bytes	Stores a single character/letter or ASCII values https://www.w3schools.com/charsets/ref_html_ascii.asp

    public void printHi(){
        for (int i = 0; i < 5 ; i++) {
            System.out.println("hi");
        }

    }

    byte aByte = 125;
    short aShort = 32_000; //the underscore does not show up in the print message but it gives a comma
    int anInt = 2_000_000;
    long aLong = 9_000_000_000_000_000_000L;//added an upper case L to signify it is a long
    float aFloat = 6_000_000.90F;
    double aDouble = 9_000_000_000D;
    boolean aBoolean = true;
    char aChar = '!';//use single quotes for char
    char asciChar = 33;//shows an exclamation mark using ascii

    //primitive data type: is pre-defined by the programming language.
    // The size and type of variable values are specified, and it has no additional methods.
    // Non-Primitive Data Types: These data types are not actually defined by the programming language but are created by the programmer.

    //examples of non primitive data types

    String testString = "test string ";

    String aString = "a string ";//this is how we write a string
    int array [];//one way to declare an array
    int alsoArray [] = new int [20]; //declaring an array for 20 spaces
    int anArray [] = {1,2,3,4,5};
    final String CONSTANT_STRING = "cant change";

    ///create a method that has three diffrent loops in java

    //create the method
    public void loops(){
        for(int i = 0; i<3; i++){
            System.out.println("Today's temp is " + aShort);

        }

        //second loop
        int i =0;
        while(i < 5){
            System.out.print(anArray[3]);
            i++;
        }


        //third loop
        int x = 2;
        do{
            System.out.println(aChar);
            x++;
        }
        while(x <= 5);

    }


}
