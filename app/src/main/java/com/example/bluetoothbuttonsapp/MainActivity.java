package com.example.bluetoothbuttonsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button onButton, offButton;
    BluetoothAdapter bluetoothAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onButton = (Button)findViewById(R.id.button);
        offButton = (Button)findViewById(R.id.button2);
        bluetoothAdapter = bluetoothAdapter.getDefaultAdapter();
    }
}