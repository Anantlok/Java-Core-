/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pyramid;

/**
 *
 * @author Anant
 */
public class SchoolGradingSystem {
    public static void main(String[] args) {
        int marks=90;
        if (marks>90 && marks <=100){System.out.println(" O");}
        else if (marks>80 && marks <=90){System.out.println("A+");}
        else if (marks>70 && marks <=80){System.out.println("A");}
        else if (marks>60 && marks <=70){System.out.println("B+");}
        else if (marks>50 && marks <=60){System.out.println("B");}
        else if (marks>40 && marks <=50){System.out.println("C");}
        else if ( marks<40){System.out.println("F");}
    }
}
