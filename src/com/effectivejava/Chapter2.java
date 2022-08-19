package com.effectivejava;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.time.Instant;
import java.util.Date;
import java.util.EnumSet;

public class Chapter2 {

    //static factory methods instead of a constructor

    public static Boolean valueOf(boolean b){
        return b ? Boolean.TRUE:Boolean.FALSE;
    }


    public static void main(String[] args) {

    }

}
