package com.example.day_10_gouwuche.component;


import com.example.day_10_gouwuche.MainActivity;
import com.example.day_10_gouwuche.module.HttpModule;

import dagger.Component;

@Component(modules = HttpModule.class)
public interface HttpComponent {
    void inject(MainActivity mainActivity);


}
