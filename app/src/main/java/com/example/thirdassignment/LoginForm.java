package com.example.thirdassignment;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginForm extends AppCompatActivity {
    EditText username,password;
    Button login;
    String user,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);

        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        login=findViewById(R.id.login);





        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user=username.getText().toString().trim();
                pass=password.getText().toString().trim();
                if(!user.isEmpty()&& !pass.isEmpty()){

                    if(user.equals("admin")&&pass.equals("admin")){
                        Intent intent= new Intent(LoginForm.this,MainActivity.class);
                        startActivity(intent);
                        Toast.makeText(LoginForm.this, "Login Success", Toast.LENGTH_SHORT).show();
                    }

                }
                else
                {
                    if(user.isEmpty()){
                        username.setError("Enter User Name");
                        Toast.makeText(LoginForm.this, "Eithr username or password is invalid", Toast.LENGTH_LONG).show();
                    }
                    if(pass.isEmpty()){
                        password.setError("Enter Password");
                        Toast.makeText(LoginForm.this, "Either username or password is invalid", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}

