package com.cookandroid.practice7_1_review;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class Practice7_1 extends AppCompatActivity {
    EditText editText;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice71);
        imageView = (ImageView) findViewById(R.id.imageView);
        editText = (EditText) findViewById(R.id.editText);
        setTitle("제주도 경치");


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu2, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.jeju1:
                imageView.setImageResource(R.drawable.jeju1);
                return true;
            case R.id.jeju2:
                imageView.setImageResource(R.drawable.jeju2);
                return true;
            case R.id.jeju3:
                imageView.setImageResource(R.drawable.jeju3);
                return true;
            case R.id.jeju4:
                imageView.setImageResource(R.drawable.jeju4);
                return true;
            case R.id.jeju5:
                imageView.setImageResource(R.drawable.jeju5);
                return true;
            case R.id.rotation:
                int rValue = Integer.parseInt(editText.getText().toString());
                Log.e("rValue", "" + rValue);
                imageView.setRotation(rValue);
                return true;
        }
        return false;
    }
}