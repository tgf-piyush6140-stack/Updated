package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class member {
    @Id
    private int KhojiId;
    private Boolean status;
    private String first_name;
    private String last_name;
    private String email;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getEmail() {
        return email;
    }

    public int getKhojiId() {
        return KhojiId;
    }

    public void setKhojiId(int khojiId) {
        KhojiId = khojiId;
    }

    @Override
    public String toString() {
        return "member{" +
                "KhojiId=" + KhojiId +
                ", status=" + status +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
