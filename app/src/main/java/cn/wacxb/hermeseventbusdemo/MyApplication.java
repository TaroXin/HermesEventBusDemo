package cn.wacxb.hermeseventbusdemo;

import android.app.Application;

import xiaofei.library.hermeseventbus.HermesEventBus;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        HermesEventBus.getDefault().init(this);

    }
}
