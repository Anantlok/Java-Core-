/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayquestions;

/**
 *
 * @author Anant
 */
public class Question4 extends Printarray{
    public int[] array={5, 2, 9, 1, 5, 6};
    public int temp;

    public Question4() {
        System.out.print("q4 ");
        System.out.print("before: ");
        printarray(array);
        bubblesort();
        System.out.print("after: ");
        printarray(array);
        System.out.println("");
    }
    public void bubblesort(){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
                else{
                    array[j]=array[j];
                    array[j+1]=array[j+1];
                }
            }
        }
}
}
