package com.example.mycontacts.model;

import androidx.room.Entity;

import java.util.Date;

@Entity(tableName = "users")

public class User {

    public final String firstName;
    public final String lastName;
    public final Date birthDate;
    public final int gender;
    public final boolean single;
    public final Date someTime;

    public User(String firstName, String lastName, Date birthDate, int gender, boolean single, Date someTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.single = single;
        this.someTime = someTime;
    }
}
