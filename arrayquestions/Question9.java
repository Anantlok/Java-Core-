/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayquestions;

/**
 *
 * @author Anant
 */
import java.util.Arrays;

public class Question9 extends Printarray{

    public Question9() { 
        System.out.print("q9");
        printarray(array);
        twosum();
    }
    
    public int[] array={1, 2, 3, 4, 5,6,8,7,9,10,11,12};
    public int[] twoarray=new int[2];
    public int sum=12;
    public void twosum(){
        
        for (int i = 0; i < array.length; i++) {
            twoarray[0]=0;
            twoarray[1]=0;
            for (int j = i+1; j < array.length; j++) {
                if(array[i]+array[j]==sum){
                    twoarray[0]=array[i];
                    twoarray[1]=array[j];
                    System.out.println("pairs of numbers; "+ Arrays.toString(twoarray));
                }
            }
            
        }
}
}
