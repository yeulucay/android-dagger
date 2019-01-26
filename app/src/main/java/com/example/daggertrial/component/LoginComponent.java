package com.example.daggertrial.component;

import com.example.daggertrial.MainActivity;
import com.example.daggertrial.module.LoginModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = LoginModule.class)
public interface LoginComponent {

    void inject(MainActivity mainActivity);
}
