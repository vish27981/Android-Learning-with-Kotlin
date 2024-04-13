package com.vishcustom.login;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class  MainActivity extends AppCompatActivity {

    private EditText etUsername, etPassword;
    private Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnSignIn = findViewById(R.id.btnSignIn);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                // Perform authentication logic here (e.g., check credentials)
                if (username.equals("vishakha") && password.equals("12345")) {
                    // Successful authentication
                    Toast.makeText(MainActivity.this, "Sign-in successful", Toast.LENGTH_SHORT).show();
                } else {
                    // Failed authentication
                    Toast.makeText(MainActivity.this, "Sign-in failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
