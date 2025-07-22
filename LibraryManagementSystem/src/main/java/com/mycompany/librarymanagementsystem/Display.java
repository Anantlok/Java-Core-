/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

/**
 *
 * @author Anant
 */
public class Display {
    public Display(Book book){
        System.out.println("Author: "+book.getAuthor());
        System.out.println("ISBN :"+book.getISBN());
        System.out.println("Title :"+book.getTitle());
        System.out.println("is Available :"+book.isAvailability());
        System.out.println("");
    }
    public Display(LibraryMember member) {
        System.out.println(member.name);
        System.out.println(member.ID);
        System.out.println(member.ContactInfo);
        System.out.println("");
    }
    public Display(Transaction trans) {
        System.out.println(trans.BookBorrowed);
        System.out.println(trans.Borrower);
        System.out.println(trans.dueDate);
        System.out.println("");
    }
    
    
}
