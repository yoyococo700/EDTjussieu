package com.example.edtjussieu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.edtjussieu.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'edtjussieu' library on application startup.
    static {
        System.loadLibrary("edtjussieu");
    }

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int a;
        

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Example of a call to a native method
        TextView tv = binding.sampleText;
        tv.setText(stringFromJNI());
    }

    /**
     * A native method that is implemented by the 'edtjussieu' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}