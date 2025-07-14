/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.amstechconstructionprivatelimitedadvance;

/**
 *
 * @author Anant
 */
public class DiscountedPrice {
    private double DiscountPercentage;
    private double DiscountedPlotPrice;
    private double Discountedgreentax;
    private double DiscountedSocietyDevlopmentTax;
    private double DiscountedMembershipPrice;
    private double DiscountedTotalPrice;
    
    public DiscountedPrice(){
        this.DiscountPercentage = DiscountPercentage;
        this.DiscountedPlotPrice = DiscountedPlotPrice;
        this.Discountedgreentax = Discountedgreentax;
        this.DiscountedSocietyDevlopmentTax = DiscountedSocietyDevlopmentTax;
        this.DiscountedMembershipPrice = DiscountedMembershipPrice;
        this.DiscountedTotalPrice = DiscountedTotalPrice;
    }
    public double CalculateArea(){
    return PlotOrder.getLength()*PlotOrder.getWidth();
    }
    public double CalculateDiscountPercentage(){
    if(PlotOrder.getDiscount()==0){
        return 1;
    }
    else{
    return PlotOrder.getDiscount()/100;
    }
    }
    public double CalculateDiscountedPlotPrice(){
    if(PlotOrder.getSector()=="a"){return CalculateArea()*5500*CalculateDiscountPercentage();}
    if(PlotOrder.getSector()=="b"){return CalculateArea()*8500*CalculateDiscountPercentage();}
    if(PlotOrder.getSector()=="c"){return CalculateArea()*11300*CalculateDiscountPercentage();}
    else{return -1;}
    }
    public double CalculateDiscountedRegistrytax(){
    if(PlotOrder.getGender()=="male"){return CalculateDiscountedPlotPrice()*0.12;}
    if(PlotOrder.getGender()=="female"){return CalculateDiscountedPlotPrice()*0.10;}
    else{return -1;}
    };
    public double CalculateDiscountedGreentax(){
    return CalculateDiscountedPlotPrice()*0.01;
    };
    public double CalculateDiscountedCGST(){
    return CalculateDiscountedPlotPrice()*0.09;
    };
    public double CalculateDiscountedSGST(){
    return CalculateDiscountedPlotPrice()*0.09;
    };
    public double CalculateDiscountedSocietyDevlopmentTax(){
    if(PlotOrder.getSector()=="a"){DiscountedSocietyDevlopmentTax=200000; 
    return DiscountedSocietyDevlopmentTax;}
    if(PlotOrder.getSector()=="b"){DiscountedSocietyDevlopmentTax=500000; 
    return DiscountedSocietyDevlopmentTax;}
    if(PlotOrder.getSector()=="c"){DiscountedSocietyDevlopmentTax=1200000; 
    return DiscountedSocietyDevlopmentTax;}
    else{ return -1;}
    }
    public double CalculateDiscountedMemberShipPrice(){
    if(PlotOrder.getSector()=="c"){DiscountedMembershipPrice=0; return DiscountedMembershipPrice;}
    if(PlotOrder.getSector()=="b"){DiscountedMembershipPrice=48000; return DiscountedMembershipPrice;}
    if(PlotOrder.getSector()=="a"){DiscountedMembershipPrice=48000; return DiscountedMembershipPrice;}
    else{return -1;}
    }
    public double ApplyDiscountedSubsidy(){
    if (CalculateDiscountedPlotPrice()<=300000){return 250000;}
    if (CalculateDiscountedPlotPrice()>300000){return 0;}
    else{return -1;}
    }
    public double CalculateDiscountedTotalPrice(){
    return CalculateDiscountedPlotPrice()+CalculateDiscountedSocietyDevlopmentTax()+CalculateDiscountedSGST()+CalculateDiscountedRegistrytax()+CalculateDiscountedMemberShipPrice()+CalculateDiscountedGreentax()+CalculateDiscountedCGST()+ApplyDiscountedSubsidy();}


}
