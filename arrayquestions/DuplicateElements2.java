/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayquestions;

/**
 *
 * @author Anant
 */
public class DuplicateElements2 {
    public int[] array={1,2,3,3,44,5,6,5,7,44,1,5};
    public boolean flag;
    public int[] unique=new int[array.length];
    public void unique(){
        for (int i = 0; i < array.length; i++) {
            flag=false;
            for (int j = i+1; j < array.length; j++) {
                if (array[i]==array[j]){
                flag=true;
                }
                if (flag==true) {
                    unique[i]=array[i];
                }
            }
            
        }
}
    
}
