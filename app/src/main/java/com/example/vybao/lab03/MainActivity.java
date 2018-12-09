package com.example.vybao.lab03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.database.sqlite.SQLiteDatabase;
public class MainActivity extends AppCompatActivity {

    SQLiteDatabase database ;
    public void createDataBase(){
        database = SQLiteDatabase.openDatabase("ContactsManager.db",null,SQLiteDatabase.CREATE_IF_NECESSARY);

    }
    public void createContactsTable(){
        String sql = "CREATE TABLE Contacts (";
        sql += "id INTEGER primary key";
        sql += "name TEXT ";
        sql += "phone_number TEXT )";

        database.execSQL(sql);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
