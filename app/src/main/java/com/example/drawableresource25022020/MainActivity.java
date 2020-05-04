package com.example.drawableresource25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    CheckBox mcbandroid;
    RadioGroup mradiogroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        mcbandroid = findViewById(R.id.checkbox);
//        mcbandroid.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if (isChecked){
//                    Toast.makeText(MainActivity.this, "Da check", Toast.LENGTH_SHORT).show();
//                }else {
//                    Toast.makeText(MainActivity.this, "Bo check", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
        mradiogroup = findViewById(R.id.radiogroup);
        mradiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radioandroid:
                        Toast.makeText(MainActivity.this, "Android", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radiojava:
                        Toast.makeText(MainActivity.this, "Java", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radiophp:
                        Toast.makeText(MainActivity.this, "PHP", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
