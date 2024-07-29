package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private  long clientId;

    @ManyToOne
    @JoinColumn(name = "advisorId", nullable = false)
    private Advisor advisor;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String contactInfo;

    protected Client()  {}

    public Client(long id, Advisor advisor, String name, String contactInfo) {
        this.advisor = advisor;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    // Getters and Setters
    public long getClientId() {
        return clientId;

    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}

