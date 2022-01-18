package com.muhsantech.createtoast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
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
            // This is Android Build Toast
            // Toast.makeText(getApplicationContext(), "This is My First Toast", Toast.LENGTH_LONG).show();

            // Custom Toast
            Toast toast = new Toast(this); // Creating TOAST
            // ADD your TOAST Layout or layout find ID
            View viewT = getLayoutInflater().inflate(R.layout.custom_toast_layout, findViewById(R.id.viewContainer));
            toast.setView(viewT); // set View
            //toast.setText(""); // Not Used this Method
            TextView txtMsg = viewT.findViewById(R.id.txtMsg); // Find ID
            txtMsg.setText(R.string.showMessage); // Set Your Message
            toast.setDuration(Toast.LENGTH_LONG); // Set Toast Duration
            toast.setGravity(Gravity.CENTER, 0,0); // Set Toast Gravity
            toast.show(); // this very Import method you cannot write this method, Not show TOAST.......
        });



    }
}