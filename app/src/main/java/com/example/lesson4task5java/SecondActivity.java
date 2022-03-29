package com.example.lesson4task5java;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.lesson4task5java.Model.Member;
import com.example.lesson4task5java.Model.User;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = SecondActivity.class.toString() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
    }
    void initView(){
        TextView tv_detail = findViewById(R.id.tv_detail);
        Button b_exit = findViewById(R.id.b_exit);
        b_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Member member = new Member("Temur", 18);
                closeDetail(member);
            }
        });
        User user = (User) getIntent().getParcelableExtra("user");
        Log.d(TAG, user.toString());

        tv_detail.setText(user.toString());
    }
    void closeDetail(Member member){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("member", member);
        setResult(RESULT_OK,intent);
        finish();
    }

}