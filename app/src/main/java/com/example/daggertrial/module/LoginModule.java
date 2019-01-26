package com.example.daggertrial.module;

import com.example.daggertrial.repository.UserRepository;
import com.example.daggertrial.repository.UserRepositoryImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    @Provides
    @Singleton
    static UserRepository provideUserRepository(){
        return new UserRepositoryImpl();
    }
    // ...
    // can be put more
}
