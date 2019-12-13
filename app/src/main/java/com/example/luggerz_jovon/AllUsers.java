package com.example.luggerz_jovon;

public class AllUsers {

    private String name;
    private String phone;
    private String userId;
    private String bannedStatus;



    public AllUsers(String name, String phone, String userId, String bannedStatus) {
        this.name = name;
        this.phone = phone;
        this.userId = userId;
        this.bannedStatus = bannedStatus;



    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public String getBannedStatus() {
        return bannedStatus;
    }

    public void setBannedStatus(String bannedStatus) {
        this.bannedStatus = bannedStatus;
    }







    public AllUsers() {

    }


}
