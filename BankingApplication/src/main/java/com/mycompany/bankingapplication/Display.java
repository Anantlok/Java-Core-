/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankingapplication;

/**
 *
 * @author Anant
 */
public class Display {
    public Display(BankAccount bank){
        System.out.println("Account Number - "+bank.getAccountNumber()+", Initialize Balance - "+bank.getBalance());
        System.out.println("");
        System.out.println("");
    }
}
