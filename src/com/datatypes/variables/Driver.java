package com.datatypes.variables;


public class Driver {
    public static void main(String[] args) {
        DataTypes data = new DataTypes();

    data.printHi();

        System.out.println(data.aChar);
        System.out.println(data.asciChar);
//        for(int i=0; i< data.anArray.length; i++) {
//            System.out.print(data.anArray[i]);
//        }
        System.out.println("\n"+ data.CONSTANT_STRING);

        System.out.println(data.anArray.length);


        System.out.println(data.aBoolean);
        System.out.println(!data.aBoolean);
        //System.out.printf("I have %d dogs!", data.aByte );
        data.loops();
        


    }
}
