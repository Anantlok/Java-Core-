/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

/**
 *
 * @author Anant
 */
public class LibraryMember {
    public String name;
    public String ID;
    public String ContactInfo;

    public LibraryMember(String name, String ID, String ContactInfo) {
        this.name = name;
        this.ID = ID;
        this.ContactInfo = ContactInfo;
    }

    public String getName() {
        return name;
    }
    public String getID() {
        return ID;
    }
    public String getContactInfo() {
        return ContactInfo;
    }    
}
