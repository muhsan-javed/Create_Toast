package com.muhsantech.createtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.muhsantech.createtoast.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnToast.setOnClickListener(view -> {
            // BuildToast Toast.makeText(getApplicationContext(), "This is My First Toast", Toast.LENGTH_LONG).show();

            // Custom Toast
            Toast toast = new Toast(this);
            View view1 = getLayoutInflater().inflate(R.layout.custom_toast_layout, (ViewGroup) findViewById(R.id.viewContainer));
            toast.setView(view1);
            //toast.setText("");

            TextView txtMsg = view1.findViewById(R.id.txtMsg);
            txtMsg.setText("Message sent Successfully");
            toast.setDuration(Toast.LENGTH_LONG);

            toast.setGravity(Gravity.CENTER, 0,0);

            toast.show();
        });



    }
}