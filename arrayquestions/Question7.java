/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayquestions;

/**
 *
 * @author Anant
 */
public class Question7 {
    public int[] array={1, 2, 4, 5, 6};
    public boolean found;
    public int missingno;

    public Question7() {
        System.out.print("q7 ");
        findmissingnumber();
        System.out.println("");
    }
    public void findmissingnumber(){
        for (int i = 1; i < array.length+1; i++) {
            found=false;
            for (int j = 0; j < array.length; j++) {
                if(array[j]==i){
                found=true;}
            }
            if(!found){
            missingno=i;}
        }
        System.out.print("Missing No "+ missingno);
}
}
