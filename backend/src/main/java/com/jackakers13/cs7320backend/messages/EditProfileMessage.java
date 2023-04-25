package com.jackakers13.cs7320backend.messages;

public class EditProfileMessage {
    private String firstName;
    private String lastName;
    private String email;
    private String cellPhone;
    private int hoursAvailablePerWeek;
    private String address;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public int getHoursAvailablePerWeek() {
        return hoursAvailablePerWeek;
    }

    public void setHoursAvailablePerWeek(int hoursAvailablePerWeek) {
        this.hoursAvailablePerWeek = hoursAvailablePerWeek;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
