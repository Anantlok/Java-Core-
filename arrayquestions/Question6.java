/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayquestions;

/**
 *
 * @author Anant
 */
public class Question6 {

    public Question6() {
        findlength();
    }
    public int[] array={1, 1, 2, 2, 3, 4, 4};
    
    public int temp;
    public int newlength;
    public void findlength(){
        temp=array.length;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]==array[j]){
                temp=temp-1;}
                else{temp=temp;}
        }
}
        if (temp>newlength){
        newlength=temp;}
        else{
        newlength=newlength;
        }
        System.out.println(newlength);
}
    public int[] array2=new int[newlength];
    public void newArray() {
        System.out.print("Unique array: ");
        for (int num : array2) {
            System.out.print(num + " ");
        }
    }
    
}