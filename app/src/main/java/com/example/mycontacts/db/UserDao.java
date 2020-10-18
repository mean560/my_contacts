package com.example.mycontacts.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.mycontacts.model.User;

@Dao
public interface UserDao {

    @Query("SELECT*FROM users")
    User[] getAllUser();

    @Query("SELECT*FROM users WHERE id = :id")
    User getUserById(int id);

    @Insert
    void addUser(User... users);

    @Delete
    void deleteUser(User user);
}
