package com.example.lab6ex1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

//da posib sa ne facem un ob doar cu campurile de care avem nevoie builder
//adnotare ca sa nu mai scriu getteri si setteri

@Data
@AllArgsConstructor
@ToString
@Builder
public class User{

    private int id;
    private String usedName;
    private String firstName;
    private String lastName;
    private String adress;
    private String email;
    private String contact;

    public User(int id, String usedName, String firstName, String lastName, String adress, String email, String contact) {
        this.id = id;
        this.usedName = usedName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.email = email;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsedName() {
        return usedName;
    }

    public void setUsedName(String usedName) {
        this.usedName = usedName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
