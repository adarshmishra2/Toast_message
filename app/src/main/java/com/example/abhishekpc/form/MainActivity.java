package com.example.abhishekpc.form;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;
;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dispMsg(View V) {
        EditText et;
        et=(EditText)findViewById(R.id.usrname);
        String etName=et.getText().toString();
        Toast toast = Toast.makeText(this, "Welcome "+etName, Toast.LENGTH_LONG);
        toast.show();
    }
}
