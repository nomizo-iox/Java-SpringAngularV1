package com.angularcrud.model;


import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String domain;
    private String experience;
    private String email;

    public User() { super(); }

    public User(int id, String name, String domain, String experience, String email) {
        this.id = id;
        this.name = name;
        this.domain = domain;
        this.experience = experience;
        this.email = email;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//        User user = (User) obj;
//        return id == user.id;
//    }
//
//    @Override
//    public int hashCode() { return Objects.hash(id); }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDomain() { return domain; }
    public void setDomain(String domain) { this.domain = domain; }

    public String getExperience() { return experience; }
    public void setExperience(String experience) { this.experience = experience; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() { return ToStringBuilder.reflectionToString(this); }
}
