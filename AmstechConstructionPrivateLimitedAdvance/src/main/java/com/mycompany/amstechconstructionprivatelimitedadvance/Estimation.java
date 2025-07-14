/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.amstechconstructionprivatelimitedadvance;

/**
 *
 * @author Anant
 */
public class Estimation {
    public Estimation(PlotOrder plot){
        Operation op=new Operation();
        DiscountedPrice disc=new DiscountedPrice();
        System.out.println("base plot Price"+op.CalculatePlotPrice());
        System.out.println("sector "+plot.getSector());
        System.out.println("GreenTax "+op.CalculateGreentax());
        System.out.println("CGST "+op.CalculateCGST());
        System.out.println("SGST "+op.CalculateSGST());
        System.out.println("Registry Tax"+op.CalculateRegistrytax());
        System.out.println("MemberShipe Price "+op.CalculateMemberShipPrice());
        System.out.println("Total Price"+op.CalculateTotalPrice());
        System.out.println("Society Devopment"+op.CalculateSocietyDevlopmentTax());
        System.out.println("");
        System.out.println("AFTER DISCOUNT");
        System.out.println("");
        System.out.println("Discounted PlotPrice "+disc.CalculateDiscountedPlotPrice());
        System.out.println("plot sector "+plot.getSector());
        System.out.println("Discounted GreenTax "+disc.CalculateDiscountedGreentax());
        System.out.println("Discounted CGST "+disc.CalculateDiscountedCGST());
        System.out.println("Discounted SGST "+disc.CalculateDiscountedSGST());
        System.out.println("Discounted Rgistry Tax "+disc.CalculateDiscountedRegistrytax());
        System.out.println("Discounted MemberShip Price "+disc.CalculateDiscountedMemberShipPrice());
        System.out.println("Discounted Society DevlopmentTax "+disc.CalculateDiscountedSocietyDevlopmentTax());
        System.out.println("Total Price After Discount "+op.CalculateTotalPrice());
        
    }
}
