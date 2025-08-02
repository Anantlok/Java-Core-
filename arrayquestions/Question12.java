/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayquestions;

/**
 *
 * @author Anant
 */
public class Question12 extends Printarray{
    public int[] array={1, 3, 5, 7};
    public int key=5;
    public Question12() {
        System.out.println("q12");
        printarray(array);
        checkexist();
    }
    public boolean available;
    public void checkexist(){
        available=false;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==key){
                available=true;
            }
            
        }     
        if(available==true){
            System.out.println(available);;}
        else{System.out.println(available);;}
}
}
