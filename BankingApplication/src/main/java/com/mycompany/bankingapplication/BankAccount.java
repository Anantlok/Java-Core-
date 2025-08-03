/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankingapplication;

/**
 *
 * @author Anant
 */
public class BankAccount {
    private int accountNumber;
    private double balance;
    private double amount;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println("Account Number - "+getAccountNumber()+", Initialize Balance - "+getBalance());
    }
    public BankAccount() {
        this.accountNumber = 0;
        this.balance = 0.0;
        System.out.println("Account Number - "+getAccountNumber()+", Initialize Balance - "+getBalance());
    }
    public void deposit(double amount){
    balance=balance+amount;
    System.out.println("Depositing "+amount+" into Account Number "+getAccountNumber());
    }
    public void withdraw(double amount){
    balance=balance-amount;
    System.out.println("Withdraw "+amount+" into Account Number "+getAccountNumber());
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    
    public void DisplayAccountNumber() {
        System.out.println("Account Number; "+getAccountNumber());
    }
    public void DisplayBalance() {
         System.out.println("Current Balance; "+getBalance());
    }
}
