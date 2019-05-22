package com.example.singinsingupathufirbase.Bean;

public class SignInBean {

    public String mobilenumber;
    public String password;

    public SignInBean() {
    }

    public SignInBean(String mobilenumber, String password) {
        this.mobilenumber = mobilenumber;
        this.password = password;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
