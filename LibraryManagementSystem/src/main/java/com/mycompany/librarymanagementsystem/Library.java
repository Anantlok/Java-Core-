/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

/**
 *
 * @author Anant
 */
public  class Library {
    static Book book1 = new Book("The Night Is Short, Walk on Girl", "Tomihiko Morimi", "9780061120084", true);
    static Book book2 = new Book("It ends with us", "Coleen Hoover", "9780451524935", false);
    static Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", true);
    static Book book4 = new Book("No more Human", "Osamu Dazai", "9780141439518", true);
    static Book book5 = new Book("Dead Poet Society", "Nancy H. Kleinbaum", "9780316769488", false);
    static Book book6 = new Book("Dune", "Frank Herbert", "9780316769488", false);
    static Book book7 = new Book("The Stranger", "Camus Albert", "9780316769488", false);
    static Book book8 = new Book("White Nights", "Doetovsky", "9780316769488", false);
    static Book book9 = new Book("The Setting Sun", "Osamu Dazai", "9780316769488", false);
    static Book book10 = new Book("Catcher in the Rye", "J.D Salinger", "9780316769488", false);
    
    
    static LibraryMember member1 = new LibraryMember("Anuj", "101", "Anuj@example.com");
    static LibraryMember member2 = new LibraryMember("Raj", "102", "Raj@example.com");
    static LibraryMember member3 = new LibraryMember("Aaditya", "103", "brown@example.com");
        
    static Transaction trans1 = new Transaction(book1.getTitle(), member1.getName(), "(2025/6/15)");
    static Transaction trans2 = new Transaction(book2.getTitle(), member2.getName(), "(2025/6/20)");
    static Transaction trans3 = new Transaction(book3.getTitle(), member3.getName(), "2025/7/1");
}
