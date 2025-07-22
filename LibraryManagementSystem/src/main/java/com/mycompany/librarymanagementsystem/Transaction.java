/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

/**
 *
 * @author Anant
 */
public class Transaction {
    public String BookBorrowed;
    public String Borrower;
    public String dueDate;

    public Transaction(String BookBorrowed, String Borrower, String dueDate) {
        this.BookBorrowed = BookBorrowed;
        this.Borrower = Borrower;
        this.dueDate = dueDate;
    }

    public String getBookBorrowed() {
        return BookBorrowed;
    }

    public String getBorrower() {
        return Borrower;
    }

    public String getDueDate() {
        return dueDate;
    }
        
     
            
            
}
