/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayquestions;

/**
 *
 * @author Anant
 */
public class Mainnew {
    static public boolean isprime(int n){
        int count=0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
            count=count+1;}
        }
        if(count>2){
        return false;}
        if(count==2){
        return true;}
        else{return false;}
    }
    public static void main(String[] args) {
        int sum=0;
        int[] array={235,254,254,256,45,25,45,25,55};
        for (int i = 2; i < array.length; i++) {
            if (isprime(i)==true) {
                if(array[i]%2==0){
                sum=sum+array[i];}
            }
        }
        System.out.println("the total even sum is "+sum);
    }
}
