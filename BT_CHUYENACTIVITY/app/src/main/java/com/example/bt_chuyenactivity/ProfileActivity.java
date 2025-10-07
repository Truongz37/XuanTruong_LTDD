package com.example.bt_chuyenactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        TextView tvUsername = findViewById(R.id.tvUsername);
        TextView tvEmail = findViewById(R.id.tvEmail);
        ImageButton btnSetting = findViewById(R.id.btnSetting);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        if (username != null) {
            tvUsername.setText("Xin chào, " + username + "!");
            tvEmail.setText(username.toLowerCase() + "@gmail.com");
        }

        btnSetting.setOnClickListener(v -> {
            Intent backIntent = new Intent(ProfileActivity.this, LoginActivity.class);
            startActivity(backIntent);
            finish();
        });
    }
}
