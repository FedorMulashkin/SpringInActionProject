package com.example.springinactionproject.entity;

public class User {
    private int id;
    private PersonalData personalData;
    private ContactInformation contactInformation;

    public User() {
    }

    public User(PersonalData personalData, ContactInformation contactInformation) {
        this.personalData = personalData;
        this.contactInformation = contactInformation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(ContactInformation contactInformation) {
        this.contactInformation = contactInformation;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", personalData=" + personalData +
                ", contactInformation=" + contactInformation +
                "}\n";
    }
}
