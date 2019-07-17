package com.tw.apistackbase.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Profile {

    @Id
    @Column
    private int registeredCapital;
    @Column
    private String certId;

    Profile(){}

    public Profile(int registeredCapital, String certId) {
        this.registeredCapital = registeredCapital;
        this.certId = certId;
    }

    public int getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(int registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }
}
