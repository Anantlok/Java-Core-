/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaces;

/**
 *
 * @author Anant
 */
public class Interfaces {

    public static void main(String[] args) {
        int[][] multiarray;
       Test t= new Test();
        System.out.print("[");
        t.printarray();
        System.out.println("]");
        multiarray= new int[1][3];
        multiarray[0][0]=10;
        multiarray[0][1]=10;
        multiarray[0][2]=10;
        System.out.println("arr[0][0] = " + multiarray[0][0]);
        System.out.println("arr[0][1] = " + multiarray[0][1]);
        System.out.println("arr[0][2] = " + multiarray[0][2]);
        
    }
}
