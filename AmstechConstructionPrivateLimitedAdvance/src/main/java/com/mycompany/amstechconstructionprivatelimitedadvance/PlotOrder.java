/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.amstechconstructionprivatelimitedadvance;

/**
 *
 * @author Anant
 */
public class PlotOrder {
    private static double length;
    private static double width;
    private static String sector;
    private static String gender;
    private static double discount;
    public PlotOrder(double length, double width,String gender,double discount){
        if (discount<=100 && discount>=0){
                this.discount=discount;}
        if(gender=="male"){
                this.gender=gender;}
        if(gender=="female"){
                this.gender=gender;
                        }
        if(length==50 && width==20){
            this.length=length;
            this.width=width;
            this.sector="a";
        }
        else if(length>=50 && length<=100 && width==50){
            this.length=length;
            this.width=width;
            this.sector="b";
        }
        else if(length>=100 && length<=300 && width>=100 && width<=300){
            this.length=length;
            this.width=width;
            this.sector="c";
        }
        else{
        throw new ExceptionInInitializerError("the given dimensions are invalid");}
        
    }   

    public static double getLength() {
        return length;
    }

    public static double getWidth() {
        return width;
    }

    public static String getSector() {
        return sector;
    }

    public static String getGender() {
        return gender;
    }

    public static double getDiscount() {
        return discount;
    }
    
}
