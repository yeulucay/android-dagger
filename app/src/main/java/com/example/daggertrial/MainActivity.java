package com.example.daggertrial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.daggertrial.repository.UserRepository;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    UserRepository userRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((TrialApplication) getApplication()).getLoginComponent().inject(MainActivity.this);


        TextView tv = (TextView)findViewById(R.id.tvMain);
        tv.setText(userRepository.getUserName());
    }
}
