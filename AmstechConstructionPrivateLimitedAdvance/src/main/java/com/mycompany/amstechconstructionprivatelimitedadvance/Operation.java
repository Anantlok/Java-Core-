/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.amstechconstructionprivatelimitedadvance;

public class Operation {
    private double Area;
    private double PlotPrice;
    private double greentax;
    private double SocietyDevlopmentTax;
    private double MembershipPrice;
    private double TotalPrice;

    public Operation() {
        this.Area = Area;
        this.PlotPrice = PlotPrice;
        this.greentax = greentax;
        this.SocietyDevlopmentTax = SocietyDevlopmentTax;
        this.MembershipPrice = MembershipPrice;
        this.TotalPrice = TotalPrice;
    }
    public double CalculateArea(){
    return PlotOrder.getLength()*PlotOrder.getWidth();
    }
    public double CalculatePlotPrice(){
    if(PlotOrder.getSector()=="a"){return CalculateArea()*5500;}
    if(PlotOrder.getSector()=="b"){return CalculateArea()*8500;}
    if(PlotOrder.getSector()=="c"){return CalculateArea()*11300;}
    else{return -1;}
    }
    public double CalculateRegistrytax(){
    if(PlotOrder.getGender()=="male"){return CalculatePlotPrice()*0.12;}
    if(PlotOrder.getGender()=="female"){return CalculatePlotPrice()*0.10;}
    else{return -1;}
    };
    public double CalculateGreentax(){
    return CalculatePlotPrice()*0.01;
    };
    public double CalculateCGST(){
    return CalculatePlotPrice()*0.09;
    };
    public double CalculateSGST(){
    return CalculatePlotPrice()*0.09;
    };
    public double CalculateSocietyDevlopmentTax(){
    if(PlotOrder.getSector()=="a"){SocietyDevlopmentTax=200000; 
    return SocietyDevlopmentTax;}
    if(PlotOrder.getSector()=="b"){SocietyDevlopmentTax=500000; 
    return SocietyDevlopmentTax;}
    if(PlotOrder.getSector()=="c"){SocietyDevlopmentTax=1200000; 
    return SocietyDevlopmentTax;}
    else{ return -1;}
    }
    public double CalculateMemberShipPrice(){
    if(PlotOrder.getSector()=="c"){MembershipPrice=0; return MembershipPrice;}
    if(PlotOrder.getSector()=="b"){MembershipPrice=48000; return MembershipPrice;}
    if(PlotOrder.getSector()=="a"){MembershipPrice=48000; return MembershipPrice;}
    else{return -1;}
    }
    public double ApplySubsidy(){
    if (CalculatePlotPrice()<=300000){return 250000;}
    if (CalculatePlotPrice()>300000){return 0;}
    else{return -1;}
    
    }
    public double CalculateTotalPrice(){
    return CalculatePlotPrice()+CalculateSocietyDevlopmentTax()+CalculateSGST()+CalculateRegistrytax()+CalculateMemberShipPrice()+CalculateGreentax()+CalculateCGST()+ApplySubsidy();}
}
