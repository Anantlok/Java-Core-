/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayquestions;

/**
 *
 * @author Anant
 */
public class DuplicateElements {
    public int[] array={1,2,3,3,44,5,6,5,7,44,1,5};
    public boolean flag;
    public void duplicate(){
        
        for (int i = 0; i < array.length; i++) {
            flag=false;
            for (int j = i+1; j < array.length; j++) {
                if(array[i]==array[j]){
                flag=true;
                }
            }
            if(flag==false){
                System.out.println(array[i]);}
        }
}
    public DuplicateElements() {
        System.out.println("not duplicate element");
        duplicate();
    }
    public static void main(String[] args) {
        DuplicateElements dup=new DuplicateElements();
        
        Lowercase l=new Lowercase();
    }
    
}
