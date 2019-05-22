package com.example.singinsingupathufirbase.Bean;

public class SignUpBean {

    public String EmailID;
    public String password;

    public SignUpBean() {
    }

    public SignUpBean(String emailID, String password) {
        EmailID = emailID;
        this.password = password;
    }

    public String getEmailID() {
        return EmailID;
    }

    public void setEmailID(String emailID) {
        EmailID = emailID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

