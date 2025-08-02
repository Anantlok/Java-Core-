/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayquestions;

/**
 *
 * @author Anant
 */
public class Question8 extends Printarray{

   
    
    public int[] array={1, 2, 3, 4, 5,6,4,6,7};

    public Question8() {
        System.out.print("q8 ");
        System.out.print("Before ");
        printarray(array);
        System.out.print("after ");
        shiftarrayright();
        printarray(array);
        System.out.println("");
    }
    
    public int k=2;
    public int temp;
    public void shiftarrayright(){
    int n=array.length;
    k=k%n;
    int[] res= new int[n];
        for (int i = 0; i < n; i++) {
            if(i<k){res[i]=array[n+i-k];}
            else{res[i]=array[i-k];}
        }
        for (int i = 0; i < n; i++) {
            array[i]=res[i];
        }
}
} 

