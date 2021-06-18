package com.example.demo.Model;

import org.springframework.data.repository.cdi.Eager;
import reactor.util.annotation.NonNull;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MemberEntity {
    @Id
    private int id;
    private String khojiID;
    private String firstName;
    private String lastName;
    private String email;
    private boolean status;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "MemberEntity{" +
                "id=" + id +
                ", khojiID='" + khojiID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                '}';
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean isStatus() {
        return status;
    }

    public String getKhojiID() {
        return khojiID;
    }

    public void setKhojiID(String khojiID) {
        this.khojiID = khojiID;
    }
}
