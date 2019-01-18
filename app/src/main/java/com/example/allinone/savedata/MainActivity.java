package com.example.allinone.savedata;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText edit;
TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(TextView)findViewById(R.id.show);
        edit=(EditText)findViewById(R.id.editText);
    }
    public void save(View view){
        SharedPreferences shard =getSharedPreferences("savefile",MODE_PRIVATE);
        SharedPreferences.Editor editor=shard.edit();
        editor.putString("name",edit.getText().toString());
        editor.apply();
    }
    public void load (View view){
        SharedPreferences shard =getSharedPreferences("savefile",MODE_PRIVATE);
        //هتظهر فى حاله دوسنا على ذرار اللود مفيش داتا
        String name =shard.getString("name","No Data");
        text.setText(name);
    }
}
