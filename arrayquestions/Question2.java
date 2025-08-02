/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayquestions;

/**
 *
 * @author Anant
 */
public class Question2 {
    public int[] array={2,4,6};

    public Question2() {
        System.out.print("q2 ");
        Sum();
        
    }
    public double sum=0;
    public void Sum(){
        for (int i = 0; i < array.length; i++) {
            sum=sum+array[i];
        }
        System.out.println(sum);
}
}
