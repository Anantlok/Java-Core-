/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayquestions;

/**
 *
 * @author Anant
 */
public class Question14 extends Printarray{
    public int[] array={1, 2, 2, 3, 3, 3};

    public Question14() {
        System.out.println("q14");
        printarray(array);
        CountElement();
    }
    public int target=3;
    public int count=0;
    public void CountElement(){
        for (int i : array) {
            if(i==target){
            count=count+1;}
            else{count=count;}
        }
        System.out.println("count of key element"+count);
    }
}
