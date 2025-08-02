/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayquestions;

/**
 *
 * @author Anant
 */
public class Question5 extends Printarray{
    public int[] array={4, 2, 9, 1, 7};

    public Question5() {
        System.out.print("q5 ");
        System.out.print("Array: ");
        printarray(array);
        System.out.print("Minimum: ");
        findMin();
        System.out.print(" Maximum: ");
        findMax();
        System.out.println("");
    }
    public int max;
    public int min;
    public int temp;
    public void findMin(){
        min=array[0];
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]<array[j]){
                    temp=array[i];
                }
                else{
                temp=array[j];}
            }
            if (temp<min){min=temp;}
            else{min=min;}
        }
        System.out.print(min);
}
    public void findMax(){
        max=array[0];
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]>array[j]){
                    temp=array[i];
                }
                else{
                temp=array[j];}
            }
            if (temp>max){max=temp;}
            else{max=max;}
        }
        System.out.print(max);
}
}

