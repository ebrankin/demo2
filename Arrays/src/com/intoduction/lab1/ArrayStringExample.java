/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intoduction.lab1;

import java.util.Scanner;

/**
 *
 * @author EBRANKIN
 */
public class ArrayStringExample {

            //place below public class
 static Scanner inputStr = new Scanner(System.in);   
 static Scanner inputNum = new Scanner(System.in);
 
    public static void main(String[] args) {
        // START OF MAIN
        
        //VARIABLES
        String []sData = new String [20] ;
        int iArrayCount = 0;
        
        //CODE
        
        //INPUT
       do
       {
           System.out.print("Enter data : ");
           sData[iArrayCount] = inputStr.next();
           iArrayCount ++;
       }while ( ! sData[iArrayCount - 1].equals("exit"));
        //PROCESS
        iArrayCount --;
        //OUTPUT
        for (int cnt = 0; cnt < iArrayCount; cnt ++)
        {
            System.out.println("Data = " + sData[cnt]);
        }
        //END OF MAIN
    }
    
}
