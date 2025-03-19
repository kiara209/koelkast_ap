package com.example.koelkastap;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {

    EditText email;
    EditText Wachtwoord;
    Button Loginbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), this::onApplyWindowInsets);

    }

    private WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat insets) {
        Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
        return insets;

        email = findViewById(R.id.email);
        Wachtwoord = findViewById(R.id.Wachtwoord);
        Loginbutton = findViewById(R.id.Loginbutton);

        Loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString().equals("user") && Wachtwoord.getText().toString().equals("1234")) {
                    Toast.makeText(Login.this, "login succesvol", Toast.LENGTH_SHORT).show();

                } else if {
                    Toast.makeText(Login.this, "login onsuccesvol", Toast.LENGTH_SHORT).show();

                }
            }

        });

    }
}



