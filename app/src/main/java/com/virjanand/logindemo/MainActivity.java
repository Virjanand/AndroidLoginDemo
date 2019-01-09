package com.virjanand.logindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickLogin(View view) {
        EditText username = (EditText) findViewById(R.id.usernameEditText);
        EditText password = (EditText) findViewById(R.id.passwordEditText);

        Log.i("Info", "Username: " + username.getText().toString() +
                "\nPassword: " + password.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
