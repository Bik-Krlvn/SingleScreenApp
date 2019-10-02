package com.birikorang_kelvin_proj.mypizzabusssinessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add_item(View view) {
        Toast.makeText(this, "item added", Toast.LENGTH_SHORT).show();
    }

    public void selectedItem(View view) {
        switch (view.getId()) {
            case R.id.lv_fish:
                Toast.makeText(this, "fish selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.lv_meat:
                Toast.makeText(this, "meat selected", Toast.LENGTH_SHORT).show();
                break;

            case R.id.lv_cheese:
                Toast.makeText(this, "cheese selected", Toast.LENGTH_SHORT).show();
                break;

            case R.id.lv_vegetarians:
                Toast.makeText(this, "vegetarian selected", Toast.LENGTH_SHORT).show();
                break;

            case R.id.lv_view_all:
                Toast.makeText(this, "load all", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
