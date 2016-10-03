package com.example.ayankapoor.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.content.SharedPreferences;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.database.DatabaseUtils;
import android.widget.Toast;
import android.content.ContentValues;

import java.util.Random;

public class DeleteAccountActivity extends AppCompatActivity {

    Button button_delete_account;
    FeedReaderDbHelper mDbHelper = new FeedReaderDbHelper(this);
    //    SQLiteDatabase db = mDbHelper.getWritableDatabase();
    EditText editText_username;
    EditText editText_password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_account);


        button_delete_account= (Button)findViewById(R.id.button_delete_account);
        editText_username = (EditText) findViewById(R.id.editText_user_name);
        editText_password = (EditText) findViewById(R.id.editText_password);


    }

    public void delete_account(View view) {

        String username = editText_username.getText().toString();
        //String password = editText_password.getText().toString();
        // FeedReaderDbHelper mDbHelper = new FeedReaderDbHelper(this);

        //ContentValues values = new ContentValues();
        //values.put("username", username);
        //values.put("password", password);
        mDbHelper.deleteUser(username);


        Toast.makeText(getApplicationContext(),"Account deleted",Toast.LENGTH_SHORT).show();
        //intent.putExtra("HELLO", message);
        //intent.putExtra("number", editText.getText().toString());
        //intent.putExtra("name", user.getUserFullName());
        //startActivity(intent);



    }



}
