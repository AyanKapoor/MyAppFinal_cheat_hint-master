package com.example.ayankapoor.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void login3(View view) {
        Intent intent = new Intent(this, LoginActivity2.class);

        //intent.putExtra("name", user.getUserFullName());
        startActivity(intent);


    } public void create_account(View view) {
        Intent intent = new Intent(this, CreateAccountActivity.class);

        //intent.putExtra("name", user.getUserFullName());
        startActivity(intent);


    }


    public void delete_account(View view) {
        Intent intent = new Intent(this, DeleteAccountActivity.class);

        //intent.putExtra("name", user.getUserFullName());
        startActivity(intent);


    }

    public void view_comments(View view){
        Intent intent = new Intent(this, ViewCommentsActivity.class);

        //intent.putExtra("name", user.getUserFullName());
        startActivity(intent);



    }

}
