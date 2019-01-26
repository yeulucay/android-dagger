package com.example.daggertrial;

import android.app.Application;

import com.example.daggertrial.component.DaggerLoginComponent;
import com.example.daggertrial.component.LoginComponent;
import com.example.daggertrial.module.LoginModule;


public class TrialApplication extends Application {
    private LoginComponent loginComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        loginComponent = createLoginComponent();
    }

    LoginComponent getLoginComponent() {
        return loginComponent;
    }

    private LoginComponent createLoginComponent() {
        return DaggerLoginComponent
                .builder()
                .loginModule(new LoginModule())
                .build();
    }
}
