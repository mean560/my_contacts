package com.example.mycontacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.mycontacts.db.AppDatabase;
import com.example.mycontacts.model.User;
import com.example.mycontacts.util.AppExecutors;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppExecutors executors = new AppExecutors();
        executors.diskIO().execute(new Runnable() {
            @Override
            public void run() {
                AppDatabase db = AppDatabase.getInstance(MainActivity.this);
                User[] users = db.userDao().getAllUser();
                for (User u : users){
                    Log.i(TAG, u.firstName+" "+u.lastName);
                }
            }
        });
    }
}