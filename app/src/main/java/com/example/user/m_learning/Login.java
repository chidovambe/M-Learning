package com.example.user.m_learning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText username=null;
    private EditText  phone =null;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText)findViewById(R.id.username_field);
        phone = (EditText)findViewById(R.id.phone_number_field);
        login = (Button)findViewById(R.id.login_button);


        public void login(View  view){
            if(username.getText().toString().equals("admin") &&
                    phone.getText().toString().equals("admin")){
                Toast.makeText(getApplicationContext(), "Redirecting...",
                        Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(getApplicationContext(), "Wrong Credentials",
                        Toast.LENGTH_SHORT).show();

    }
}
