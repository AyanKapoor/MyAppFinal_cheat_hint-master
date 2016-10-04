package com.example.ayankapoor.myapplication;

import android.app.ListActivity;
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
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.content.Intent;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.database.DatabaseUtils;
import android.widget.Toast;
import 	java.io.OutputStream;
import java.io.FileOutputStream;
import android.content.ContentValues;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class ViewCommentsActivity extends ListActivity {


    FeedReaderDbHelper mDbHelper = new FeedReaderDbHelper(this);
    //    SQLiteDatabase db = mDbHelper.getWritableDatabase();
    TextView textView_username;
    TextView textView_comment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_comments);

        ArrayList<HashMap<String,String>> comments_list2 = new ArrayList<HashMap<String, String>>();

        textView_username = (TextView) findViewById(R.id.username1);
        textView_comment = (TextView) findViewById(R.id.comment1);
        ArrayList<String> comments_list = new ArrayList<String>();
        ArrayList<String> username_list = new ArrayList<String>();
        comments_list= mDbHelper.readComment();
       // username_list= mDbHelper.readUsername();
        comments_list2=mDbHelper.readUsername();

        ArrayList<HashMap<String, String>> studentList = comments_list2;
        if (studentList.size() != 0) {
            ListView lv = getListView();
            ListAdapter adapter = new SimpleAdapter(ViewCommentsActivity.this, studentList, R.layout.activity_view_comments, new String[]{"username", "comment"}, new int[]{R.id.username1, R.id.comment1});
            setListAdapter(adapter);
        } else {
            Toast.makeText(this, "No movie!", Toast.LENGTH_SHORT).show();
        }

    }





    }



