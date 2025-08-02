/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayquestions;

/**
 *
 * @author Anant
 */
public class Question13 {
    public int[] array={1, 2, 3, 4, 5};
    public int[] array2={2, 4, 5};
    public boolean flag;
    public void subset(){
            flag=true;
            for (int i : array2){
                for (int j : array) {
                    if (i!=j) {
                        flag=false;
                    }   
                }
            if (flag==true){System.out.println("it is a subset");}
        }
}

    public Question13() {
        System.out.println("q13");
        subset();
    }
}
