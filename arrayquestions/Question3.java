/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayquestions;

/**
 *
 * @author Anant
 */
public class Question3 extends Printarray{
    public int[] array={1,2,3,4,5,6};
    public int temp;

    public Question3() {
        System.out.print("q3 ");
        System.out.print("before: ");
        printarray(array);
        reversearray();
        System.out.print("after: ");
        printarray(array);
        System.out.println("");
    }
    public void reversearray(){ 
        for (int i = 0; i < array.length/2; i++) {
            temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }  
    }
}
